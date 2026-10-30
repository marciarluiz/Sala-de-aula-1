/**
 * ATIVIDADE 4 - SISTEMA DE PRODUTO (COM DESAFIO DE DESCONTO)
 */

public class Produto {
    //Atributos
    String nome;
    double preco;
    int quantidade;
    
    Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Valor total em estoque = preco x quantidade
    double calcularValorEstoque(){
        return  preco * quantidade;

    }
    //Desafio:  reduz o precço em um percentual
    void aplicarDesconto(double percentual){
        if (percentual > 0 && percentual <=100){
            preco = preco - (preco * percentual / 100);
            System.out.println("Desconto de " + percentual + "% aplicado em " + nome + ".");
        }else{
            System.out.println("Percentual de desconto inválido.");
        }
    }

    void exibirProduto(){
        System.out.println("Produto: " + nome + " | Preço: R$" + String.format("%.2f", preco) + " | Quantidade: " + quantidade + " | Valor em estoque: R$" + String.format("%.2f", calcularValorEstoque()));
    }

    public static void main(String[] args){
        Produto p1 = new Produto("Maça", 3.00, 10);
        Produto p2 = new Produto("Banana", 5.00, 15);
        Produto p3 = new Produto("Uva", 8.00, 13);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System.out.println();
        p3.aplicarDesconto(10);
        p3.exibirProduto();
    }
}
