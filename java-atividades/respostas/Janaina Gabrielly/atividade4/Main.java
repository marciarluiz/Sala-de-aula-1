public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 15.0, 20);
        Produto p2 = new Produto("Caneta", 2.5, 100);
        Produto p3 = new Produto("Mochila", 120.0, 8);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        // desafio
        p3.aplicarDesconto(10);
        System.out.println("Mochila com 10% de desconto:");
        p3.exibirProduto();
    }
}
