package br.com.banco;

import java.io.Serializable;

public class Cliente implements Serializable {
	
	private String nome;
	
	//receber
	public String getNome() {
		return nome;
	}
	//alterar
	public void setNome(String nome) {
		this.nome = nome;
	}

}
