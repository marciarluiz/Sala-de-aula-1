class Produto {
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
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * percentual / 100;
        } else {
            System.out.println("Percentual inválido.");
        }
    }

    void exibirProduto() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Quantidade: %d | Valor em estoque: R$ %.2f%n",
                nome, preco, quantidade, calcularValorEstoque());
    }
}

public class Atividade04 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 120.0, 10);
        Produto p2 = new Produto("Mouse", 60.0, 25);
        Produto p3 = new Produto("Monitor", 900.0, 5);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System.out.println("\nAplicando 10% de desconto no monitor:");
        p3.aplicarDesconto(10);
        p3.exibirProduto();
    }
}