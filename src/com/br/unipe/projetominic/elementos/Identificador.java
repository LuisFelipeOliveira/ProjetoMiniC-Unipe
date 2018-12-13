package com.br.unipe.projetominic.elementos;

public class Identificador implements IExpressao {

	private String nome;

	public Identificador(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.getNome();
	}

	public void setEntreParenteses(boolean isEntreParenteses) {
	}

}
