// Atividade 12

public class ControleEstoque {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para retirar de " + nome + ".");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println();
    }

    public static void main(String[] args) {
        ControleEstoque produto1 = new ControleEstoque();
        produto1.nome = "Caderno";
        produto1.preco = 15.50;
        produto1.quantidade = 10;

        ControleEstoque produto2 = new ControleEstoque();
        produto2.nome = "Caneta";
        produto2.preco = 2.00;
        produto2.quantidade = 20;

        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(3);

        produto2.adicionarEstoque(10);
        produto2.retirarEstoque(4);

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}
