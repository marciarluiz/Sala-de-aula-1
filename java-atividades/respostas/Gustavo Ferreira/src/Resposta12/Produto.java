package Resposta12;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = Math.max(0, quantidade);
    }

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Adicionado " + quantidade + " un ao produto " + nome + "");
        } else {
            System.out.println("Quantidade inválida para adição.");
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para retirada.");
        } else if (this.quantidade - quantidade < 0) {
            System.out.println("Operação negada: estoque insuficiente de " + nome + " (atual: " + this.quantidade + ")");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Retirado " + quantidade + " un. do produto " + nome + ".");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome + "\n" + "Preço: R$ " + preco + "\n" + "Estoque: " + quantidade + " un");
    }
}