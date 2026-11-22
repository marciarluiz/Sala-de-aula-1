public class Produto {

    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida!");
        } else if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades retiradas do estoque.");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("-------------------------");
    }
}

