package com.br.unipe.projetominic.elementos;

public class ExpressaoAtributicao {

    private Identificador id;
    private IExpressao expressao;

    public ExpressaoAtributicao(Identificador identificador, IExpressao expressao) {
        this.setId(identificador);
        this.setExpressao(expressao);
    }

    public Identificador getId() {
        return id;
    }

    public void setId(Identificador id) {
        this.id = id;
    }

    public IExpressao getExpressao() {
        return expressao;
    }

    public void setExpressao(IExpressao expressao) {
        this.expressao = expressao;
    }

    @Override
    public String toString() {
        return this.getId() + " = " + this.getExpressao();
    }

}
