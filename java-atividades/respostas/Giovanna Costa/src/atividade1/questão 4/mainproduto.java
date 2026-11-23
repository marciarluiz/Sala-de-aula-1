public class mainproduto {

    public static void main(String[] args) {

        produto produto1 = new produto("Notebook", 3000, 5);
        produto produto2 = new produto("Mouse", 80, 10);
        produto produto3 = new produto("Teclado", 150, 8);

        produto1.exibirproduto();
        produto2.exibirproduto();
        produto3.exibirproduto();

        System.out.println("Aplicando desconto no notebook...");

        produto1.aplicardesconto(10);

        produto1.exibirproduto();
    }
}