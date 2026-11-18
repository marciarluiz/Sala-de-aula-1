public class Main {
    public static void main(String[] args) {
        PagamentoPix pix = new PagamentoPix(250.00, "maria@email.com");
        PagamentoCartao cartao = new PagamentoCartao(1200.00, 3);

        System.out.println("=== Pix ===");
        pix.processarPagamento();
        pix.exibirComprovante();

        System.out.println();
        System.out.println("=== Cartão ===");
        cartao.processarPagamento();
        cartao.exibirComprovante();
    }
}
