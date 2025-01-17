public class ContaPoupanca extends ContaBancaria {
    private final double limiteSaque;

    public ContaPoupanca(double saldo, double limiteSaque) {
        super(saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacar(double valor) {
        if (valor > limiteSaque) {
            System.out.println("Valor excede o limite de saque!");
        } else {
            super.sacar(valor);
        }
    }
}