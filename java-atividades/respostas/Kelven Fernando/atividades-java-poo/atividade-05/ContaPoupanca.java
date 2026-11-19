public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() { return taxaRendimento; }

    @Override
    public void sacar(double valor) {
        // Poupança não cobra taxa: reaproveita a regra da superclasse.
        super.sacar(valor);
    }

    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.printf("Tipo: Conta Poupança | Rendimento: %.2f%% ao mês%n", taxaRendimento * 100);
    }
}
