package Atividade1.Produtos;

//  ESTÁ INCORRETO, POIS NÃO USEI O CONSTRUTOR

public class Main {

    public static void main(String[] args){
        
        Produto produto1 = new Produto();

        produto1.nome = "Café";
        produto1.preco = 18.0;
        produto1.quantidade = 5;

        Produto produto2 = new Produto();

        produto2.nome = "Arroz";
        produto2.preco = 22;
        produto2.quantidade = 25;

        Produto produto3 = new Produto();

        produto3.nome = "Açucar";
        produto3.preco = 3.50;
        produto3.quantidade = 30; 
    }
    
}
