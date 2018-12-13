package com.br.unipe.projetominic.elementos;

public class DeclIdOpt implements IExpressao {
	
	private Identificador id;
	private IExpressao declidopt;
    
    public DeclIdOpt(Identificador identificador, IExpressao declidopt) {
    	setId(identificador);
	}

	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}
    
    public IExpressao getDeclidopt() {
		return declidopt;
	}

	public void setDeclidopt(IExpressao declidopt) {
		this.declidopt = declidopt;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("," + this.getId());
		toString.append("," + this.getDeclidopt());
		
	    return toString.toString();    	
    }

	public void setEntreParenteses(boolean isEntreParenteses) {
	}

}