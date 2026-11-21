///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Produto1 {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto1(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para entrada.");
            return;
        }
        this.quantidade += quantidade;
        System.out.println("Entrada de " + quantidade + " unidade(s) de " + nome + ".");
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para saída.");
        } else if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente de " + nome + ". Disponível: " + this.quantidade);
        } else {
            this.quantidade -= quantidade;
            System.out.println("Saída de " + quantidade + " unidade(s) de " + nome + ".");
        }
    }

    public void mostrarEstoque() {
        System.out.println(nome + " | Preço: R$ " + String.format("%.2f", preco)
                + " | Estoque: " + quantidade);
    }

    public static void main(String[] args) {
        Produto1 p1 = new Produto1("Caderno", 15.90, 20);
        Produto1 p2 = new Produto1("Caneta", 2.50, 100);

        p1.mostrarEstoque();
        p2.mostrarEstoque();

        p1.adicionarEstoque(10);
        p1.retirarEstoque(5);
        p2.retirarEstoque(150);
        p2.retirarEstoque(40);

        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////