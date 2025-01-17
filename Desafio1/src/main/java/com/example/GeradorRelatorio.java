package com.example;

public class GeradorRelatorio extends GerenciadorRelatorio {
    private final GeradorPDF geradorPdf;
    private final GeradorSMS geradorSMS;

    public GeradorRelatorio (TipoRelatorio tipo, GeradorSMS geradorSMS, GeradorPDF geradorPDF) {
        super(tipo);
        this.geradorPdf = geradorPDF;
        this.geradorSMS = geradorSMS;
    }

    public void gerarRelatorio () {
        switch ( getTipo() ) {
            case PDF -> geradorPdf.gerarPdf();
            case SMS -> geradorSMS.gerarSMS();
            default -> throw new IllegalArgumentException("Tipo de relatório inválido!");
        }
    }
}
