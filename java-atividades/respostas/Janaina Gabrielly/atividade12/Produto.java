public class Produto {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
        System.out.println("Adicionado " + quantidade + " de " + nome);
    }

    void retirarEstoque(int quantidade) {
        if (quantidade > this.quantidade) {
            System.out.println("Nao tem estoque suficiente de " + nome);
        } else {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Retirado " + quantidade + " de " + nome);
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println();
    }
}
