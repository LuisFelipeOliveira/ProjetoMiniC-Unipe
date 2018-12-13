package com.br.unipe.projetominic.elementos;

public class LiteralPontoFlutuante implements IExpressao {

	private double valor;

	public LiteralPontoFlutuante(double valor) {
		this.setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return String.valueOf(this.getValor());
	}

	public void setEntreParenteses(boolean isEntreParenteses) {
	}

}
