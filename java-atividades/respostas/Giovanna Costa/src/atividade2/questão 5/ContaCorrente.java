public class ContaCorrente extends ContaBancaria {
    private double taxaSaque;

    public ContaCorrente(String titular, double saldo, double taxaSaque) {
        super(titular, saldo);
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) {
        double total = valor + taxaSaque;

        if (valor > 0 && total <= getSaldo()) {
            atualizarSaldo(getSaldo() - total);
            System.out.println("Saque realizado com taxa!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}