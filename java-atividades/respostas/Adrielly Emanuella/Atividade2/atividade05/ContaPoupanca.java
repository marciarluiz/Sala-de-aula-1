public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() { return taxaRendimento; }
    public void setTaxaRendimento(double taxaRendimento) { this.taxaRendimento = taxaRendimento; }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: o valor deve ser positivo.");
            return;
        }
        if (valor > getSaldo()) {
            System.out.println("Saque negado: saldo insuficiente.");
            return;
        }
        setSaldo(getSaldo() - valor);
        System.out.printf("Saque de R$ %.2f realizado (sem taxa).%n", valor);
    }

    @Override
    public void exibirSaldo() {
        System.out.println("Tipo: Conta Poupança");
        super.exibirSaldo();
        System.out.printf("Taxa de rendimento: %.2f%% ao mês%n", taxaRendimento);
    }
}
