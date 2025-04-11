package com.empresa.pagamentos.model;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome, String documento, double salario) {
        super(nome, documento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }

}
