package com.empresa.pagamentos.model;

public abstract class Pessoa {

    private String nome;
    private String documento;

    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

// Metodos: "setNome" e "setDocumento" estão comentados pois eles não apareceram como requisito no Diagrama anexado à atividade.

    // public void setNome(String nome) {
    // this.nome = nome;
    // } 

    public String getDocumento() {
        return documento;
    }

    // public void setDocumento(String documento) {
    // this.documento = documento;
    // }

    public abstract double calcularPagamento();

}
