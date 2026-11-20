class Produto {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidade(s) de " + nome + " adicionada(s).");
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida.");
        } else if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente de " + nome + ".");
        } else {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidade(s) de " + nome + " retirada(s).");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidade);
    }
}

public class Atividade12 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Caderno";
        p1.preco = 15.90;
        p1.quantidade = 20;

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 3.50;
        p2.quantidade = 50;

        p1.mostrarEstoque();
        p2.mostrarEstoque();

        System.out.println();
        p1.adicionarEstoque(10);
        p1.retirarEstoque(5);
        p2.retirarEstoque(60);
        p2.retirarEstoque(20);

        System.out.println();
        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}