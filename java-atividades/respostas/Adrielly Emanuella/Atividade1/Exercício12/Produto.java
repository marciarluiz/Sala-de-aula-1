public class Produto {
    String nome;
    double preco;
    int quantidade;

    // Adiciona produtos ao estoque
    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade invalida!");
        }
    }

    // Retira produtos do estoque
    void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Nao e possivel retirar essa quantidade!");
        }
    }

    // Mostra a quantidade atual
    void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Caderno";
        produto1.preco = 15.0;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta";
        produto2.preco = 2.5;
        produto2.quantidade = 20;

        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(3);

        produto2.adicionarEstoque(10);
        produto2.retirarEstoque(4);

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}