public class PagamentoCartao extends Pagamento {
    private int numeroParcelas;

    public PagamentoCartao(double valor, int numeroParcelas) {
        super(valor);
        this.numeroParcelas = numeroParcelas;
    }

    public int getNumeroParcelas() { return numeroParcelas; }
    public void setNumeroParcelas(int numeroParcelas) { this.numeroParcelas = numeroParcelas; }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão realizado");
    }

    @Override
    public void exibirComprovante() {
        System.out.println("--- Comprovante Cartão ---");
        super.exibirComprovante();
        System.out.printf("Parcelas: %dx de R$ %.2f%n", numeroParcelas, getValor() / numeroParcelas);
    }
}
