package com.example;

public abstract class GerenciadorRelatorio {
    protected final TipoRelatorio tipo;

    public GerenciadorRelatorio (TipoRelatorio tipo) {
        this.tipo = tipo;
    }

    public TipoRelatorio getTipo () {
        return tipo;
    }
}