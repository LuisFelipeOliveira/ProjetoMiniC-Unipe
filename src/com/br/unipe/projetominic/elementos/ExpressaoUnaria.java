package com.br.unipe.projetominic.elementos;

public class ExpressaoUnaria implements IExpressao {

    private String operador;
    private IExpressao expressao;
    private boolean isEntreParenteses;

    public ExpressaoUnaria(String operador, IExpressao expressao) {
        this.setOperador(operador);
        this.setExpressao(expressao);
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public IExpressao getExpressao() {
        return expressao;
    }

    public void setExpressao(IExpressao expressao) {
        this.expressao = expressao;
    }

    public boolean isEntreParenteses() {
        return isEntreParenteses;
    }

    @Override
    public String toString() {
        if (this.isEntreParenteses) {
            return "(" + this.getOperador() + "" + this.getExpressao() + ")";
        } else {
            return this.getOperador() + "" + this.getExpressao();
        }
    }

    public void setEntreParenteses(boolean isEntreParenteses) {
    }

}
