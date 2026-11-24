// Atividade 4
public class Produto {
    String nome;
    double preco;
    int quantidade;

    // Construtor: define os dados do produto ao criá-lo
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
        System.out.println();
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Caderno", 15.50, 10);
        Produto produto2 = new Produto("Caneta", 2.00, 25);
        Produto produto3 = new Produto("Mochila", 80.00, 5);

        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
    }
}
