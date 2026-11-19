public class Main {
    public static void main(String[] args) {
        ProdutoEletronico notebook = new ProdutoEletronico("Notebook", 3500.00, 24);
        ProdutoEletronico smartphone = new ProdutoEletronico("Smartphone", 2000.00, 12);
        ProdutoAlimenticio arroz = new ProdutoAlimenticio("Arroz 5 kg", 30.00, "20/12/2026");
        ProdutoAlimenticio chocolate = new ProdutoAlimenticio("Chocolate", 8.00, "30/06/2027");

        System.out.println("=== Produtos Eletrônicos (10% de desconto) ===");
        notebook.exibirProduto();
        System.out.println();
        smartphone.exibirProduto();

        System.out.println();
        System.out.println("=== Produtos Alimentícios (5% de desconto) ===");
        arroz.exibirProduto();
        System.out.println();
        chocolate.exibirProduto();
    }
}
