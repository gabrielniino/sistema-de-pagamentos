package com.empresa.pagamentos.util;

public class Formatador {
    
    public String formatarValor(double valor) {
        return String.format("R$ %.2f", valor);
    }
}
