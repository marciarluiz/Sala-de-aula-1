package Resposta4;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    double desconto;
    double precoComDesconto;

    Produto(String nome, double preco, int quantidade, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    void aplicarDesconto(double percentual) {
        desconto = preco * (percentual / 100);
        preco -= desconto;
        precoComDesconto = preco;
    }

    void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Desconto: " + desconto + "%");
    }

    void exibirPrecoComDesconto() {
        System.out.println("Preço com desconto: " + precoComDesconto);
    }
}   
