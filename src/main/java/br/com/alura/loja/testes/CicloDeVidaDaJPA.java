package br.com.alura.loja.testes;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.util.JPAUtil;

public class CicloDeVidaDaJPA {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

//		estado transient
		Categoria celulares = new Categoria("CELULARES");

//		estado managed
		em.persist(celulares); 				// comando insert
		celulares.setNome("XPTO"); 			// comando update
		em.flush();; 						// executa comandos insert e update

//		estado detached
		em.clear();
		celulares.setNome("1234"); 			// não atualiza no BD (seria um comando update)
		
//		estado managed
		celulares = em.merge(celulares);	// comando select
		em.flush();							// executa comandos select e update
		
//		removed
		em.remove(celulares);				// comando delete
		em.flush();							// executa comando delete
		
//		estado detached
		em.close();;
	}
}
