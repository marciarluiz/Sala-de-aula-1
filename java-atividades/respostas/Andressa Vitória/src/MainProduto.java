public class MainProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 5);
        Produto p2 = new Produto("Mouse", 50.00, 20);
        Produto p3 = new Produto("Teclado", 120.00, 10);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System.out.println("\nAplicando 10% de desconto no Notebook:");
        p1.aplicarDesconto(10);
        p1.exibirProduto();

    }
}