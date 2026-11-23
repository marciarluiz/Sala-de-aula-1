public class mainproduto {

    public static void main(String[] args) {

        produto produto1 = new produto();
        produto produto2 = new produto();

        produto1.nome = "Teclado";
        produto1.preco = 150;
        produto1.quantidade = 10;

        produto2.nome = "Mouse";
        produto2.preco = 80;
        produto2.quantidade = 20;

        produto1.mostrarestoque();
        produto1.adicionarestoque(5);
        produto1.retirarestoque(3);
        produto1.mostrarestoque();

        System.out.println();

        produto2.mostrarestoque();
        produto2.adicionarestoque(10);
        produto2.retirarestoque(5);
        produto2.mostrarestoque();
    }
}