public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100.0);
            System.out.println("Desconto de " + percentual + "% aplicado ao produto " + nome + ".");
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Valor total em estoque: R$ " + String.format("%.2f", calcularValorEstoque()));
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500.00, 5);
        Produto produto2 = new Produto("Mouse Sem Fio", 120.00, 15);
        Produto produto3 = new Produto("Teclado Mecânico", 280.00, 10);

        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();

        // Desafio: aplicando desconto percentual
        produto1.aplicarDesconto(10);
        produto1.exibirProduto();
    }
}
