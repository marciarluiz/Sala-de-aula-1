public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido! Informe um valor positivo.");
        } else if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente na Conta Poupança para saque de R$ " + String.format("%.2f", valor) + ".");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque na Conta Poupança de R$ " + String.format("%.2f", valor) + " (sem taxa) realizado.");
        }
    }
}
