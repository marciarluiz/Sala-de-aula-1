public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularDesconto() {
        return 0.0;
    }

    public void exibirProduto() {
        double desconto = calcularDesconto();
        double precoFinal = preco - desconto;
        System.out.println("Produto: " + nome);
        System.out.println("Preço Original: R$ " + String.format("%.2f", preco));
        System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Preço Final: R$ " + String.format("%.2f", precoFinal));
    }
}
