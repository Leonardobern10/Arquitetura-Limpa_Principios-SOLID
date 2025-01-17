package Resposta;

public abstract class Animal {
    private String nome;
    private int qtdPatas;

    public Animal (String nome, int qtdPatas) {
        this.nome = nome;
        this.qtdPatas = qtdPatas;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getQtdPatas () {
        return qtdPatas;
    }

    public void setQtdPatas (int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public void comer() {
        System.out.println("Comendo...");
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }
}
