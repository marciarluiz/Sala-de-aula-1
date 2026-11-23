public class Main {
    public static void main(String[] args) {
        PagamentoPix pix = new PagamentoPix(150.00, "usuario@email.com");

        PagamentoCartao cartao = new PagamentoCartao(300.00, 3);

        pix.processarPagamento();
        pix.exibirComprovante();

        System.out.println();

        cartao.processarPagamento();
        cartao.exibirComprovante();
    }
}