public class Produto {

    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int qtd) {
        quantidade = quantidade + qtd;
        System.out.println(qtd + " unidades de " + nome + " adicionadas.");
    }

    void retirarEstoque(int qtd) {
        if (qtd <= quantidade) {       
            quantidade = quantidade - qtd;
            System.out.println(qtd + " unidades de " + nome + " retiradas.");
        } else {
            System.out.println("Estoque insuficiente de " + nome + "!");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Em estoque: " + quantidade);
        System.out.println("================");
    }

    public static void main(String[] args) {
       
        Produto produto1 = new Produto();
        produto1.nome = "Caderno";
        produto1.preco = 15.90;
        produto1.quantidade = 20;

        Produto produto2 = new Produto();
        produto2.nome = "Caneta";
        produto2.preco = 3.50;
        produto2.quantidade = 50;

        produto1.adicionarEstoque(10);
        produto1.retirarEstoque(5);
        produto1.retirarEstoque(100); 

        produto2.retirarEstoque(30);
        produto2.adicionarEstoque(5);

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}
