public class PagamentoCartao extends Pagamento {
 private int numeroParcelas;

 public PagamentoCartao(double valor, int numeroParcelas) {
 super(valor);
 this.numeroParcelas = numeroParcelas;
    }

 @Override
 public void processarPagamento() {
 System.out.println("Pagamento via cartão realizado!");
    }

 @Override
 public void exibirComprovante() {
 System.out.println("=== PAGAMENTO CARTÃO ===");
 super.exibirComprovante();
 System.out.println("Parcelas: " + numeroParcelas);
    }
}
