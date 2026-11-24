public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public double calcularDesconto() {
        return 0.0;
    }

    public void exibirProduto() {
        double desconto = calcularDesconto();
        System.out.println("Produto: " + nome);
        System.out.printf("Preço original: R$ %.2f%n", preco);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço final: R$ %.2f%n", preco - desconto);
    }
}
