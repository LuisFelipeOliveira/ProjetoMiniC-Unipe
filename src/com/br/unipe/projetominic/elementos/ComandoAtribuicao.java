package com.br.unipe.projetominic.elementos;

public class ComandoAtribuicao implements IComando {
	
	String tipo;
	Identificador id;
	IExpressao DeclaraOpt;
	
	public ComandoAtribuicao(String tipo, Identificador id, IExpressao DeclaraOpt) {
		this.setTipo(tipo);
		this.setId(id);
		this.setDeclOpt(DeclaraOpt);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}

	public IExpressao getDeclOpt() {
		return DeclaraOpt;
	}

	public void setDeclOpt(IExpressao DeclaraOpt) {
		this.DeclaraOpt = DeclaraOpt;
	}
	
	public String toString() {
		StringBuilder dclcmdtipatropt = new StringBuilder();
        String retorno;
        if (this.DeclaraOpt != null) {
            retorno = this.tipo + " " + this.id.toString() + " " + this.DeclaraOpt.toString() + ";";
        }
        else{
            retorno = this.tipo + " " + this.id.toString() + ";";
        }
        
        dclcmdtipatropt.append(retorno);
        return dclcmdtipatropt.toString();
    }

	public void setEntreParenteses(boolean b) {
	}

}
