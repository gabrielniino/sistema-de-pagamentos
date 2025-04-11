package com.empresa.pagamentos.service;

import com.empresa.pagamentos.model.Pessoa;
import com.empresa.pagamentos.util.Formatador;

public class PagamentoService {
    private Formatador formatador = new Formatador();

    public void processarPagamento(Pessoa pessoa) {
        double valor = pessoa.calcularPagamento();
        String valorFormatado = formatador.formatarValor(valor);
        System.out.println("Pagamento processado para: " + pessoa.getNome());
        System.out.println("Valor: " + valorFormatado);
    }
}