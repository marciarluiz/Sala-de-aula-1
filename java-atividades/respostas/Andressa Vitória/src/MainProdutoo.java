public class MainProdutoo {

    public static void main(String[] args) {
        Produtoo p1 = new Produtoo();
        p1.nome = "Cadeira";
        p1.preco = 250.00;
        p1.quantidade = 10;

        Produtoo p2 = new Produtoo();
        p2.nome = "Mesa";
        p2.preco = 600.00;
        p2.quantidade = 3;

        p1.mostrarEstoque();
        p1.adicionarEstoque(5);
        p1.retirarEstoque(8);
        p1.mostrarEstoque();

        System.out.println();
        p2.mostrarEstoque();
        p2.retirarEstoque(5); // maior que o estoque, deve bloquear
        p2.retirarEstoque(3);
        p2.mostrarEstoque();

    }
}