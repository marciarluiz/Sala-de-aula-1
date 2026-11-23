public class produto {

    String nome;
    double preco;
    int quantidade;

    public void adicionarestoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Produtos adicionados ao estoque.");
        } else {
            System.out.println("Quantidade invalida.");
        }
    }

    public void retirarestoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Produtos retirados do estoque.");
        } else {
            System.out.println("Quantidade invalida ou estoque insuficiente.");
        }
    }

    public void mostrarestoque() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("--------------------");
    }
}