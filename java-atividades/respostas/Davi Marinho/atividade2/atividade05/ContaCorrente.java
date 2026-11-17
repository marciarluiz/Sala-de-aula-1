public class ContaCorrente extends ContaBancaria {
    private double taxaSaque;

    public ContaCorrente(String titular, double saldo, double taxaSaque) {
        super(titular, saldo);
        this.taxaSaque = taxaSaque;
    }

    public double getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(double taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) {
        double totalDesconto = valor + taxaSaque;
        if (valor <= 0) {
            System.out.println("Valor de saque inválido! Informe um valor positivo.");
        } else if (totalDesconto > getSaldo()) {
            System.out.println("Saldo insuficiente para saque de R$ " + String.format("%.2f", valor) + " + taxa de R$ " + String.format("%.2f", taxaSaque) + ".");
        } else {
            setSaldo(getSaldo() - totalDesconto);
            System.out.println("Saque na Conta Corrente de R$ " + String.format("%.2f", valor) + " (taxa: R$ " + String.format("%.2f", taxaSaque) + ") realizado.");
        }
    }
}
