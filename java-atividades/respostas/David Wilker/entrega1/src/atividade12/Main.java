package atividade12;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 49.90, 10);
        produto1.mostrarEstoque();
        System.out.println();

        produto1.adicionarEstoque(5);
        produto1.mostrarEstoque();
        System.out.println();

        produto1.retirarEstoque(3);
        produto1.mostrarEstoque();
        System.out.println();

        produto1.retirarEstoque(20);
        produto1.mostrarEstoque();
        System.out.println();

        Produto produto2 = new Produto("Calça", 99.90, 5);
        produto2.mostrarEstoque();
        System.out.println();
        produto2.adicionarEstoque(-2);
        System.out.println();
        produto2.mostrarEstoque();
        System.out.println();
        produto2.retirarEstoque(-1);
        System.out.println();
        produto2.mostrarEstoque();
    }
}
