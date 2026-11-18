public class Produto {

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
        double desconto = preco * percentual / 100;
        preco = preco - desconto;
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: " + calcularValorEstoque());
        System.out.println("======================");
    }

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Teclado", 120.0, 10);
        Produto p2 = new Produto("Mouse", 60.0, 25);
        Produto p3 = new Produto("Monitor", 900.0, 5);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System.out.println("Aplicando 10% de desconto no monitor:");
        p3.aplicarDesconto(10);
        p3.exibirProduto();
    }
}
