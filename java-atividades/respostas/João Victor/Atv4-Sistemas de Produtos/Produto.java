
public class Produto {

    // Atributos
    String nome;
    double preco;
    int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para calcular o valor do estoque
    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    // Método para exibir informações
    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total do estoque: R$ " + calcularValorEstoque());
        System.out.println("-------------------------");
    }

    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco = preco - (preco * percentual / 100);
            System.out.println("Desconto aplicado!");
        } else {
            System.out.println("Percentual de desconto inválido!");
        }
    }
}
