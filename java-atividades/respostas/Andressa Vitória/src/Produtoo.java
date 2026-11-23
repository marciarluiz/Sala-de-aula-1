public class Produtoo {

    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque de " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para retirar.");
        } else if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades retiradas do estoque de " + nome + ".");
        } else {
            System.out.println("Estoque insuficiente de " + nome + "! Disponível: " + this.quantidade);
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco + " | Em estoque: " + quantidade);

    }
}