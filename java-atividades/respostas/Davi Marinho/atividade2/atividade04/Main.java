public class Main {
    public static void main(String[] args) {
        ProdutoEletronico eletronico1 = new ProdutoEletronico("Notebook", 4000.00, 12);
        ProdutoEletronico eletronico2 = new ProdutoEletronico("Smartphone", 2500.00, 12);

        ProdutoAlimenticio alimento1 = new ProdutoAlimenticio("Café Torrado 500g", 22.00, "10/12/2027");
        ProdutoAlimenticio alimento2 = new ProdutoAlimenticio("Azeite de Oliva", 45.00, "15/08/2027");

        eletronico1.exibirProduto();
        eletronico2.exibirProduto();
        alimento1.exibirProduto();
        alimento2.exibirProduto();
    }
}
