
public class ControleDeEstoque {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente!");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        ControleDeEstoque p1 = new ControleDeEstoque();
        ControleDeEstoque p2 = new ControleDeEstoque();

        p1.nome = "Arroz";
        p1.preco = 25.0;
        p1.quantidade = 10;

        p2.nome = "Feijao";
        p2.preco = 8.0;
        p2.quantidade = 20;

        p1.adicionarEstoque(5);
        p1.retirarEstoque(3);

        p2.adicionarEstoque(10);
        p2.retirarEstoque(5);

        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}

