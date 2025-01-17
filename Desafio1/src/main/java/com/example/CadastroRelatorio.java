package com.example;

public class CadastroRelatorio extends GerenciadorRelatorio{
    public CadastroRelatorio (TipoRelatorio tipo) {
        super(tipo);
    }
    public void salvarRelatorio () {
        System.out.println("Salvando relatório no disco...");
    }
}
