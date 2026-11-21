///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Produto{

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual <= 0 || percentual > 100) {
            System.out.println("Percentual de desconto inválido.");
            return;
        }
        preco = preco - (preco * percentual / 100);
        System.out.println("Desconto de " + percentual + "% aplicado em " + nome + ".");
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + String.format("%.2f", calcularValorEstoque()));
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 120.00, 10);
        Produto p2 = new Produto("Mouse", 60.00, 25);
        Produto p3 = new Produto("Monitor", 800.00, 5);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        p3.aplicarDesconto(10);
        p3.exibirProduto();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////