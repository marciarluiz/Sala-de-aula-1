package Atividade1.Produtos;

public class Produto {
    String nome;
    double preco;
    int quantidade;
    double estoque;

    public void calcularValorEstoque(){
        double estoque = preco * quantidade;
        System.out.println("Existe um valor de " + estoque + "R$ no estoque.");
    }

    public void exibirProdutos(){
        System.out.println("\nDados do produto\n");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: " + estoque);
    }




}
