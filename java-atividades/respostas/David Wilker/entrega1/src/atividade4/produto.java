package atividade4;

public class produto {
    String nome;
    double preco;
    int quantidade;

    produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$:" + calcularValorEstoque());
    }

    void descontar(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual de desconto inválido. Deve estar entre 0 e 100.");
            return;
        }
        double desconto = preco * (percentual / 100);
        preco -= desconto;
        System.out.println("Desconto de " + percentual + "% aplicado ao produto " + nome + ". Novo preço: R$" + preco);
    }
}
