package br.com.alura.loja.modelo.produto;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.alura.loja.modelo.Produto;

@Entity
@Table(name = "livros")
public class Livro extends Produto {

	String autor;
	Integer numeroDePaginas;

	public Livro() {
	}

	public Livro(String autor, Integer numeroDePaginas) {
		super();
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(Integer numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
}
