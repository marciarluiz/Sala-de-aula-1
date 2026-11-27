public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Arroz";
        produto1.preco = 6.5;
        produto1.quantidade = 50;

        Produto produto2 = new Produto();
        produto2.nome = "Feijao";
        produto2.preco = 8.0;
        produto2.quantidade = 30;

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();

        produto1.adicionarEstoque(20);
        produto1.retirarEstoque(10);
        produto2.retirarEstoque(40);
        produto2.retirarEstoque(15);

        System.out.println();
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}
