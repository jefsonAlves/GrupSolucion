package br.com.drogaria.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity //serve para dizer que é uma entidade do hibernate ou seja, é uma tabela
@Table(name="estado")
public class Estado extends GenericDomain {
	private String sigla;
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
