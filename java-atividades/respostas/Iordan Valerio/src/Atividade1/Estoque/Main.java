package Atividade1.Estoque;

public class Main {
    public static void main(String[]args){

        Produto produto1 = new Produto();

        produto1.nome = "Feijão";
        produto1.preco = 22;
        produto1.quantidade = 12;
        produto1.adicionarEstoque(12 );
        produto1.retirarEstoque(7);
        produto1.mostrarEstoque();


        Produto produto2 = new Produto();

        produto2.nome = "Macarrão";
        produto2.preco = 12;
        produto2.quantidade = 10;
        produto2.adicionarEstoque(15 );
        produto2.retirarEstoque(9);
        produto2.mostrarEstoque();
    }
    
}
