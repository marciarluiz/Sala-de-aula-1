public class Produto {

    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Quantidade: " + quantidade
                + " | Valor em estoque: R$" + calcularValorEstoque());

    }
}