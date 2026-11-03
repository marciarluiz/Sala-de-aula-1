public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor padrão
    public Produto() {
    }

    // Getters e setters
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
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    // Métodos
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(nome + ": entrada de " + quantidade + " unidade(s) no estoque.");
        } else {
            System.out.println(nome + ": quantidade de entrada inválida.");
        }
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println(nome + ": quantidade de saída inválida.");
        } else if (quantidade > this.quantidade) {
            System.out.println(nome + ": estoque insuficiente (disponível: "
                    + this.quantidade + ", solicitado: " + quantidade + ").");
        } else {
            this.quantidade -= quantidade;
            System.out.println(nome + ": saída de " + quantidade + " unidade(s) do estoque.");
        }
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("-----------------------------");
    }
}