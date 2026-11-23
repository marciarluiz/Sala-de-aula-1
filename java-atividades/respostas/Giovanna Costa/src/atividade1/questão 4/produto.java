public class produto {

    String nome;
    double preco;
    int quantidade;

    public produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularvalorestoque() {
        return preco * quantidade;
    }

    public void aplicardesconto(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            preco -= preco * percentual / 100;
        } else {
            System.out.println("Desconto invalido.");
        }
    }

    public void exibirproduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor do estoque: R$ " + calcularvalorestoque());
        System.out.println("--------------------");
    }
}