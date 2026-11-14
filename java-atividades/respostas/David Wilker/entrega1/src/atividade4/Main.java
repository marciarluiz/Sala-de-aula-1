package atividade4;

public class Main {
    public static void main(String[] args) {
        produto produto1 = new produto("Notebook", 3500.00, 10);
        produto1.exibirProduto();
        produto1.calcularValorEstoque();
        produto1.descontar(10);
        produto1.exibirProduto();

        System.out.println();

        produto produto2 = new produto("Smartphone", 1500.00, 20);
        produto2.exibirProduto();
        produto2.calcularValorEstoque();
        produto2.descontar(5);
        produto2.exibirProduto();

        System.out.println();
        
        produto produto3 = new produto("Tablet", 800.00, 15);
        produto3.exibirProduto();
        produto3.calcularValorEstoque();
        produto3.descontar(15);
        produto3.exibirProduto();
    }
}
