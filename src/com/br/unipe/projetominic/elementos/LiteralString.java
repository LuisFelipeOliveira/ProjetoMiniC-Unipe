package com.br.unipe.projetominic.elementos;

public class LiteralString implements IExpressao {

	private String valor;

	public LiteralString(String valor) {
		this.setValor(valor);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return this.getValor();
	}

	public void setEntreParenteses(boolean isEntreParenteses) {
	}

}
