public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setPreco(3500.00);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto();
        produto2.setNome("Mouse sem fio");
        produto2.setPreco(80.00);
        produto2.setQuantidade(5);

        System.out.println("=== Estoque inicial ===");
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();

        System.out.println("=== Entrada de estoque ===");
        produto1.adicionarEstoque(5);
        produto2.adicionarEstoque(20);

        System.out.println("\n=== Saída de estoque ===");
        produto1.retirarEstoque(3);
        produto2.retirarEstoque(10);

        System.out.println("\n=== Tentando retirar mais do que existe (regra) ===");
        produto2.retirarEstoque(50);   // estoque insuficiente

        System.out.println("\n=== Estoque atualizado ===");
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}