package com.empresa.pagamentos.service;

import com.empresa.pagamentos.model.Pessoa;
import com.empresa.pagamentos.util.Formatador;
import com.empresa.pagamentos.util.PagamentoException;

public class PagamentoService {
    private Formatador formatador = new Formatador();

    public void processarPagamento(Pessoa pessoa) {
        try {
            double valor = pessoa.calcularPagamento();
            String valorFormatado = formatador.formatarValor(valor);
            System.out.println("Pagamento processado para: " + pessoa.getNome());
            System.out.println("Valor: " + valorFormatado);
        } catch (PagamentoException e) {
            System.out.println("Erro ao processar pagamento de " + pessoa.getNome() + ": " + e.getMessage());
        }
    }
}