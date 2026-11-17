public class Produto {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
            System.out.println("Adicionado " + qtd + " unidade(s) ao estoque de " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para adição.");
        }
    }

    void retirarEstoque(int qtd) {
        if (qtd <= 0) {
            System.out.println("Quantidade inválida para retirada.");
        } else if (qtd > quantidade) {
            System.out.println("Erro: Estoque insuficiente de " + nome + "! Disponível: " + quantidade);
        } else {
            quantidade -= qtd;
            System.out.println("Retirado " + qtd + " unidade(s) do estoque de " + nome + ".");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + String.format("%.2f", preco) + " | Quantidade em estoque: " + quantidade);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Monitor 24 polegadas";
        produto1.preco = 899.90;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Headset Gamer";
        produto2.preco = 249.90;
        produto2.quantidade = 5;

        System.out.println("=== Estoque Inicial ===");
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();

        System.out.println("\n=== Movimentações ===");
        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(8);
        produto1.mostrarEstoque();

        System.out.println();
        produto2.retirarEstoque(10); // Testando regra de impedir estoque negativo
        produto2.retirarEstoque(3);
        produto2.mostrarEstoque();
    }
}
