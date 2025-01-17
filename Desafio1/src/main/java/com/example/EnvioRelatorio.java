package com.example;

public class EnvioRelatorio extends GerenciadorRelatorio{
    public EnvioRelatorio (TipoRelatorio tipo) {
        super(tipo);
    }

    public void enviarRelatorio () {
        System.out.println("Enviando relatório...");
    }
}
