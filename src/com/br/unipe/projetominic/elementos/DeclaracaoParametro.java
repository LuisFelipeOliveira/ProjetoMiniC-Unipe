package com.br.unipe.projetominic.elementos;

public class DeclaracaoParametro {

    private String tipo;
    private Identificador id;

    public DeclaracaoParametro(String tipo, Identificador identificador) {
        this.setTipo(tipo);
        this.setId(identificador);
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

    @Override
    public String toString() {
        return this.getTipo() + " " + this.getId();
    }

}
