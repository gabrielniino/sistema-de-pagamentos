package com.empresa.pagamentos.app;

import com.empresa.pagamentos.model.Funcionario;
import com.empresa.pagamentos.model.PrestadorServico;
import com.empresa.pagamentos.service.PagamentoService;

public class App {
    public static void main(String[] args) throws Exception {

        Funcionario funcionario = new Funcionario("Gabriel", "123", 3000.0);
        PrestadorServico prestador = new PrestadorServico("Maria", "456", 50.0, 40);

        PagamentoService pagamentoService = new PagamentoService();
        pagamentoService.processarPagamento(funcionario);
        pagamentoService.processarPagamento(prestador);

    }
}
