package resposta;

public class ContextContaBancaria {
    private final ContaBancaria conta;

    public ContextContaBancaria(ContaBancaria conta) {
        this.conta = conta;
    }

    public void fazerSaque(double valor) {
        conta.sacar(valor);
    }

    public void fazerDeposito(double valor) {
        conta.depositar(valor);
    }

    public double consultarSaldo() {
        return conta.getSaldo();
    }
}
