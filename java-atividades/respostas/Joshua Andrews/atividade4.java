public class atividade4 {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos();
        Produtos produto2 = new Produtos();
        Produtos produto3 = new Produtos();

        produto1.nome = "Macarrão";
        produto1.preco = 12.99f;
        produto1.quantidade = 50;
        produto1.desconto = 25;

        produto2.nome = "Arroz";
        produto2.preco = 30.50f;
        produto2.quantidade = 10;

        produto3.nome = "Maça";
        produto3.preco = 9.99f;
        produto3.quantidade = 33;

        produto1.exibirProduto();
        produto1.calcularValorEstoque();
        produto1.aplicarDesconto();
        System.out.println("--//--//--//--//--//--//--//--//--//--//--//--// ");
        produto2.exibirProduto();
        produto2.calcularValorEstoque();
        System.out.println("--//--//--//--//--//--//--//--//--//--//--//--// ");
        produto3.exibirProduto();
        produto3.calcularValorEstoque();
    }

}

class Produtos{
    String nome;
    float preco;
    int quantidade;
    int desconto;

    void calcularValorEstoque(){
        float valorEstoque = preco * quantidade;
        System.out.printf("Valor total do estoque é: R$%.2f%n", valorEstoque);
    }

    void exibirProduto(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: R$" + preco);
        System.out.println("Quantos produtos tem: " + quantidade);
    }

    void aplicarDesconto() {
        float desc = (preco * desconto) / 100;
        float novoPreco = preco - desc;

        System.out.printf("O produto com desconto de %d%% fica agora por R$ %.2f%n", desconto, novoPreco);
    }
}



