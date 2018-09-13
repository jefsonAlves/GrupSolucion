package br.com.drogaria.domain;
//Essa classe irá gera ID para todas as tabelas
import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass //usado para falar que essa classe não será uma tabela
public class GenericDomain implements Serializable {
	@Id //informa para o hibernate que essa classe sera uma chave primaria
	@GeneratedValue(strategy = GenerationType.AUTO) //informara que o BD ira criar a contagem
	private long codigo;
	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
}
