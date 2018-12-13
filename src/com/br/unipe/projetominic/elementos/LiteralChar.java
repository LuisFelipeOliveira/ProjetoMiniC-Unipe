package com.br.unipe.projetominic.elementos;

public class LiteralChar implements IExpressao {

	private String valor;

	public LiteralChar(String valor) {
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
		return String.valueOf(this.getValor());
	}

	public void setEntreParenteses(boolean isEntreParenteses) {
	}

}
