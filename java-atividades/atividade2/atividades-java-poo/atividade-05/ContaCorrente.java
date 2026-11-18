public class ContaCorrente extends ContaBancaria {
    private double taxaSaque;

    public ContaCorrente(String titular, double saldo, double taxaSaque) {
        super(titular, saldo);
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaSaque() { return taxaSaque; }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque recusado: o valor deve ser positivo.");
            return;
        }
        double total = valor + taxaSaque;
        if (total > getSaldo()) {
            System.out.printf("Saque recusado: saldo insuficiente (saque de R$ %,.2f + taxa de R$ %,.2f).%n",
                    valor, taxaSaque);
            return;
        }
        setSaldo(getSaldo() - total);
        System.out.printf("Saque de R$ %,.2f realizado (taxa de R$ %,.2f cobrada).%n", valor, taxaSaque);
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.printf("Tipo: Conta Corrente | Taxa por saque: R$ %,.2f%n", taxaSaque);
    }
}
