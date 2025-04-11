package com.empresa.pagamentos.model;

import com.empresa.pagamentos.util.PagamentoException;

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
        if (salario < 0) {
            throw new PagamentoException("Salário deve ser maior ou igual a zero.");
        }
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        if (salario < 0) {
            throw new PagamentoException("Salário não pode ser negativo.");
        }
        return salario;
    }

}
