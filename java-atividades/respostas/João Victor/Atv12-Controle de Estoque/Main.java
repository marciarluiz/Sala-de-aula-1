public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Teclado";
        produto1.preco = 149.00;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();

        produto2.nome = "Monitor";
        produto2.preco = 570.00;
        produto2.quantidade = 20;

        System.out.println("=== ESTOQUE INICIAL ===");
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();

        System.out.println("=== MOVIMENTAÇÕES ===");

        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(3);

        produto2.adicionarEstoque(10);
        produto2.retirarEstoque(5);

        System.out.println("\n=== ESTOQUE ATUALIZADO ===");

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}
