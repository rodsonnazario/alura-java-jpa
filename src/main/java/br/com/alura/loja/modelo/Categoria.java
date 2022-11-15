package br.com.alura.loja.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.alura.loja.modelo.categoria.CategoriaId;

@Entity
@Table(name = "categorias")
public class Categoria {

	@EmbeddedId
	CategoriaId id;
	
	public Categoria() {
	}

	public Categoria(String nome) {
		this.id = new CategoriaId(nome, "tipo");		
	}

	public String getNome() {
		return id.getNome();
	}

	public void setNome(String nome) {
		this.id.setNome(nome);
	}

}
