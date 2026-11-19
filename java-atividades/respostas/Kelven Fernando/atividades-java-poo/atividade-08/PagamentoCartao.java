public class PagamentoCartao extends Pagamento {
    private int numeroParcelas;

    public PagamentoCartao(double valor, int numeroParcelas) {
        super(valor);
        this.numeroParcelas = numeroParcelas > 0 ? numeroParcelas : 1;
    }

    public int getNumeroParcelas() { return numeroParcelas; }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão realizado");
    }

    @Override
    public void exibirComprovante() {
        super.exibirComprovante();
        System.out.println("Forma de pagamento: Cartão");
        System.out.printf("Parcelas: %dx de R$ %,.2f%n", numeroParcelas, getValor() / numeroParcelas);
    }
}
