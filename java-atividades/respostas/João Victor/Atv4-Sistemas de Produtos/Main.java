public class Main {
    public static void main(String[] args) {

        // Criando os produtos
        Produto produto1 = new Produto("Ryzen 5500", 690.00, 10);

        Produto produto2 = new Produto("Placa Mãe A520M", 400.00, 20);

        Produto produto3 = new Produto("Monitor Curvo", 700.00, 5);

        // Exibindo os produtos
        System.out.println("LISTA DE PRODUTOS");

        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();

        // Aplicando desconto
        System.out.println("APLICANDO DESCONTO");

        produto1.aplicarDesconto(10);

        // Exibindo produto atualizado
        produto1.exibirProduto();
    }
}
