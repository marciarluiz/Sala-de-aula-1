package Resposta12;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado Mecânico 75%", 250.00, 10);
        Produto produto2 = new Produto("Mouse Gamer", 150.00, 5);

        produto1.mostrarEstoque();
        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(3);
        produto1.mostrarEstoque();

        System.out.println();

        produto2.mostrarEstoque();
        produto2.retirarEstoque(8);
        produto2.retirarEstoque(2);
        produto2.mostrarEstoque();
    }
}
