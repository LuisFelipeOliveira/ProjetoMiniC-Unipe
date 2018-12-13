package com.br.unipe.projetominic.elementos;

public class ComandoPrintint implements IComando {

    private boolean isEntreParenteses;
    private IExpressao exp;

    public ComandoPrintint(IExpressao exp) {
        setExp(exp);
    }

    public IExpressao getExp() {
        return exp;
    }

    public void setExp(IExpressao exp) {
        this.exp = exp;
    }

    public boolean EntreParenteses() {
        return isEntreParenteses;
    }

    public void setEntreParenteses(boolean EntreParenteses) {
        this.isEntreParenteses = EntreParenteses;
    }


    public String toString() {
        StringBuilder comandoprintint = new StringBuilder();

        if (this.isEntreParenteses) {
            String retorno = "printf(" + this.exp.toString() + ");";
            comandoprintint.append(retorno);
        } else {
            String retorno = "printf" + this.exp.toString() + ";";
            comandoprintint.append(retorno);
        }

        return comandoprintint.toString();
    }

}


