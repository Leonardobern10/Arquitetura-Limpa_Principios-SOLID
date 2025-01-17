package resposta;

public class ContaPoupanca extends ContaBancaria {
    private final double limiteSaque;

    public ContaPoupanca(double saldoInicial, double limiteSaque) {
        super(saldoInicial);
        if (limiteSaque <= 0) {
            throw new IllegalArgumentException("O limite de saque deve ser positivo.");
        }
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacar(double valor) {
        if (valor > limiteSaque) {
            throw new IllegalArgumentException("O valor do saque excede o limite permitido.");
        }
        super.sacar(valor);
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }
}
