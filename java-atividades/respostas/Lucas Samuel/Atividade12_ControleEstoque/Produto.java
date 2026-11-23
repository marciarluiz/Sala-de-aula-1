public class Produto {

    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Entrada de " + quantidade + " unidade(s) de " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para entrada.");
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para saída.");
        } else if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente de " + nome + ". Disponível: " + this.quantidade);
        } else {
            this.quantidade -= quantidade;
            System.out.println("Saída de " + quantidade + " unidade(s) de " + nome + ".");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + String.format("%.2f", preco)
                + " | Estoque: " + quantidade);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);
        Produto p2 = new Produto("Cadeira Gamer", 950.00, 3);

        p1.mostrarEstoque();
        p2.mostrarEstoque();
        System.out.println();

        p1.adicionarEstoque(5);
        p1.retirarEstoque(8);
        p2.retirarEstoque(5); // maior que o estoque
        p2.retirarEstoque(3);
        System.out.println();

        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}
