public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Mouse sem fio", 80.00, 50);
        Produto produto3 = new Produto("Teclado mecânico", 250.00, 20);

        System.out.println("=== Produtos cadastrados ===");
        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();

        System.out.println("\n=== Aplicando descontos (desafio) ===");
        produto1.aplicarDesconto(10);   // 10% no notebook
        produto3.aplicarDesconto(15);   // 15% no teclado
        produto2.aplicarDesconto(150);  // inválido

        System.out.println("\n=== Produtos após os descontos ===");
        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
    }
}