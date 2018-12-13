package com.br.unipe.projetominic.elementos;

public class ExpRelAux implements IExpressao {

    private IExpressao expRelAux;

    public ExpRelAux(IExpressao expRelAux) {
        setExpRelAux(expRelAux);
    }

    public IExpressao getExpRelAux() {
        return expRelAux;
    }

    public void setExpRelAux(IExpressao expRelAux) {
        this.expRelAux = expRelAux;
    }

    public String toString() {
        StringBuilder toString = new StringBuilder();

        toString.append(this.getExpRelAux());

        return toString.toString();
    }

    public void setEntreParenteses(boolean isEntreParenteses) {
    }

}
