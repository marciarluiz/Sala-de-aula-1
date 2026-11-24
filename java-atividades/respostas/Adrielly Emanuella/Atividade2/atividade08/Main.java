public class Main {
    public static void main(String[] args) {
        PagamentoPix pix = new PagamentoPix(250.00, "joao@email.com");
        PagamentoCartao cartao = new PagamentoCartao(1200.00, 4);

        pix.processarPagamento();
        pix.exibirComprovante();

        System.out.println();

        cartao.processarPagamento();
        cartao.exibirComprovante();
    }
}
