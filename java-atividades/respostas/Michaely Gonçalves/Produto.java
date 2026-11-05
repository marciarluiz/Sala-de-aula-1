
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
        preco -= preco * percentual / 100;
    }

    void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor do estoque: R$ " + calcularValorEstoque());
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.0, 10);
        Produto p2 = new Produto("Feijao", 8.0, 20);
        Produto p3 = new Produto("Macarrao", 5.0, 15);

        p1.aplicarDesconto(10);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();
    }
}
