package br.com.alura.loja.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Cliente;

public class ClienteDao {

	private EntityManager em;

	public ClienteDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Cliente cliente) {
		this.em.persist(cliente);
	}

	public void atualizar(Cliente cliente) {
		this.em.merge(cliente);
	}

	public void remover(Cliente cliente) {
		cliente = this.em.merge(cliente);
		this.em.remove(cliente);
	}

	public Cliente buscarPorId(Long id) {
		return this.em.find(Cliente.class, id);
	}

	public List<Cliente> buscarTodos() {
		String jpql = "SELECT p FROM Cliente p";
		return this.em.createQuery(jpql, Cliente.class).getResultList();
	}
}
