package com.empresa.pagamentos.app;

import com.empresa.pagamentos.model.Funcionario;
import com.empresa.pagamentos.model.PrestadorServico;
import com.empresa.pagamentos.service.PagamentoService;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario("João", "123", 3000.0);
        PrestadorServico prestador = new PrestadorServico("Maria", "456", 50.0, 40);

        // Teste com erro
        Funcionario funcionarioErro = new Funcionario("Carlos", "789", -500.0);

        PagamentoService pagamentoService = new PagamentoService();
        pagamentoService.processarPagamento(funcionario);
        pagamentoService.processarPagamento(prestador);
        pagamentoService.processarPagamento(funcionarioErro); // Vai lançar exceção

    }
}
