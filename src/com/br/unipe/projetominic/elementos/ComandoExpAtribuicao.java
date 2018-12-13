package com.br.unipe.projetominic.elementos;

public class ComandoExpAtribuicao implements IComando {
	
	IExpressao id;
	IExpressao expAtr;
	
	public ComandoExpAtribuicao(IExpressao identificador, IExpressao expAtr) {
		setId(identificador);
		setExpAtr(expAtr);
	}

	public IExpressao getId() {
		return id;
	}

	public void setId(IExpressao id) {
		this.id = id;
	}
	
	public IExpressao getExpAtr() {
		return expAtr;
	}

	public void setExpAtr(IExpressao expAtr) {
		this.expAtr = expAtr;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getId());
		toString.append(this.getExpAtr());
		toString.append(";");
		
		return toString.toString();
	}

	public void setEntreParenteses(boolean b) {
	}

}
