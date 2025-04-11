package com.empresa.pagamentos.model;

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
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }

}
