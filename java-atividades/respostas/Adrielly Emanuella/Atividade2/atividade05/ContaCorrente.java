public class ContaCorrente extends ContaBancaria {
    private double taxaSaque;

    public ContaCorrente(String titular, double saldo, double taxaSaque) {
        super(titular, saldo);
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaSaque() { return taxaSaque; }
    public void setTaxaSaque(double taxaSaque) { this.taxaSaque = taxaSaque; }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: o valor deve ser positivo.");
            return;
        }
        double total = valor + taxaSaque;
        if (total > getSaldo()) {
            System.out.println("Saque negado: saldo insuficiente (valor + taxa).");
            return;
        }
        setSaldo(getSaldo() - total);
        System.out.printf("Saque de R$ %.2f realizado (taxa de R$ %.2f).%n", valor, taxaSaque);
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Tipo: Conta Corrente");
        super.exibirSaldo();
        System.out.printf("Taxa por saque: R$ %.2f%n", taxaSaque);
    }
}
