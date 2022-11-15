package br.com.alura.loja.modelo.produto;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.alura.loja.modelo.Produto;

@Entity
@Table(name = "informatica")
public class Informatica extends Produto {

	String marca;
	Integer modelo;

	public Informatica() {
	}

	public Informatica(String marca, Integer modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
}
