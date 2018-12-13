package com.br.unipe.projetominic.elementos;

public class DeclaracaoInclude {

    private String id;

    public DeclaracaoInclude(String identificador) {
        setId(identificador);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder declaracaoInclude = new StringBuilder();

        declaracaoInclude.append("#include<" + this.getId() + ".h>");

        return declaracaoInclude.toString();
    }

}
