public class Main {
    public static void main(String[] args) {
        ProdutoEletronico notebook = new ProdutoEletronico("Notebook", 4500.00, 12);
        ProdutoEletronico fone = new ProdutoEletronico("Fone Bluetooth", 300.00, 6);
        ProdutoAlimenticio chocolate = new ProdutoAlimenticio("Chocolate", 12.50, "30/12/2026");
        ProdutoAlimenticio leite = new ProdutoAlimenticio("Leite Integral", 6.00, "15/01/2027");

        notebook.exibirProduto();
        System.out.println();
        fone.exibirProduto();
        System.out.println();
        chocolate.exibirProduto();
        System.out.println();
        leite.exibirProduto();
    }
}
