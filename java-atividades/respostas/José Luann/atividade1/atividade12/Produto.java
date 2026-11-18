public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
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
            System.out.println("Estoque insuficiente de " + nome + ": há apenas "
                    + this.quantidade + " unidade(s).");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Saída de " + quantidade + " unidade(s) de " + nome + ".");
        }
    }

    public void mostrarEstoque() {
        System.out.printf("%s | Preço: R$ %.2f | Em estoque: %d%n", nome, preco, quantidade);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 15.90, 20);
        Produto p2 = new Produto("Caneta", 3.50, 50);

        p1.mostrarEstoque();
        p2.mostrarEstoque();

        p1.adicionarEstoque(10);
        p1.retirarEstoque(5);
        p2.retirarEstoque(60); // deve ser recusado
        p2.retirarEstoque(50);

        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}
