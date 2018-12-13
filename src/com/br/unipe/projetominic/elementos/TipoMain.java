package com.br.unipe.projetominic.elementos;

public class TipoMain {

    private String tipo;

    public TipoMain(String tipo) {
        this.setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.getTipo();
    }

}
