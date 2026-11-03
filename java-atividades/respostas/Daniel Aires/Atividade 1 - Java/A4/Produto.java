public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor com parâmetros
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Métodos
    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.printf("Valor total em estoque: R$ %.2f%n", calcularValorEstoque());
        System.out.println("-----------------------------");
    }

    // Desafio: aplicar desconto percentual ao preço
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = preco * (percentual / 100);
            preco -= desconto;
            System.out.printf("Desconto de %.1f%% aplicado em %s. Novo preço: R$ %.2f%n",
                    percentual, nome, preco);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }
}