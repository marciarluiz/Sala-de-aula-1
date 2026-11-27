package atividade12;

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
        if (quantidade < 0) {
            System.out.println("Não é possível adicionar uma quantidade negativa ao estoque.");
            return;
        }
        else {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque do produto " + nome + ".");
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Não é possível retirar uma quantidade negativa do estoque.");
            return;
        }
        else if (quantidade > this.quantidade) {
            System.out.println("Não é possível retirar mais do que a quantidade em estoque.");
            return;
        }
        else {
            this.quantidade -= quantidade;
                System.out.println(quantidade + " unidades retiradas do estoque do produto " + nome + ".");

        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Quantidade em estoque: " + this.quantidade);
    }

}
