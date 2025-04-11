package com.empresa.pagamentos.model;

import com.empresa.pagamentos.util.PagamentoException;

public class PrestadorServico extends Pessoa {

    private double valorHora;
    private int horasTrabalhadas;

    public PrestadorServico(String nome, String documento, double valorHora, int horasTrabalhadas) {
        super(nome, documento);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new PagamentoException("Valor da hora deve ser maior ou igual a zero.");
        }
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas < 0) {
            throw new PagamentoException("Horas trabalhadas devem ser maiores ou iguais a zero.");
        }
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        if (valorHora < 0 || horasTrabalhadas < 0) {
            throw new PagamentoException("Valor da hora e horas trabalhadas devem ser não-negativos.");
        }
        return valorHora * horasTrabalhadas;
    }

}
