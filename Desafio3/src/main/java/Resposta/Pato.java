package Resposta;

public class Pato extends Animal implements Voador, Nadador {
    public Pato (String nome, int qtdPatas) {
        super(nome, qtdPatas);
    }

    @Override
    public void voar () {
        System.out.println("Voando...");
    }

    @Override
    public void nadar () {
        System.out.printf("Nadando com %d patas...\n", getQtdPatas());
    }
}
