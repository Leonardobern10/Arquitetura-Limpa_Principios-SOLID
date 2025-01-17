package Resposta;

public class Cachorro extends Animal implements Nadador {
    public Cachorro (String nome, int qtdPatas) {
        super(nome, qtdPatas);
    }

    @Override
    public void nadar () {
        System.out.printf("Nadando com %d patas...\n", getQtdPatas());
    }
}
