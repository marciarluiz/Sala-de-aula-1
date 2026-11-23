package Resposta4;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000.00, 10, 10);
        produto1.exibirProduto();
        produto1.aplicarDesconto(10);
        produto1.exibirPrecoComDesconto();

        Produto produto2 = new Produto("Smartphone", 1500.00, 20, 5);
        produto2.exibirProduto();
        produto2.aplicarDesconto(5);
        produto2.exibirPrecoComDesconto();

        Produto produto3 = new Produto("Tablet", 800.00, 15, 8);
        produto3.exibirProduto();
        produto3.aplicarDesconto(8);
        produto3.exibirPrecoComDesconto();  
    }
}
