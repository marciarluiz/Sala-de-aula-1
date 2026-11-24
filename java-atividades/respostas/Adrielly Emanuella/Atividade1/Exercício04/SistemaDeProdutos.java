public class SistemaDeProdutos {
    String nome;
    double preco;
    int quantidade;

    // Construtor: define os dados iniciais do produto
    SistemaDeProdutos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Calcula o valor total do estoque
    double calcularValorEstoque() {
        return preco * quantidade;
    }

    // Aplica um desconto percentual
    void aplicarDesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            preco = preco - (preco * percentual / 100);
        }
    }

    // Mostra os dados do produto
    void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor do estoque: R$ " + calcularValorEstoque());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        SistemaDeProdutos produto1 = new SistemaDeProdutos("Caderno", 15.0, 10);
        SistemaDeProdutos produto2 = new SistemaDeProdutos("Caneta", 2.5, 20);
        SistemaDeProdutos produto3 = new SistemaDeProdutos("Mochila", 80.0, 5);

        produto1.exibirProduto();

        produto2.aplicarDesconto(10);
        produto2.exibirProduto();

        produto3.exibirProduto();
    }
}