public class Main {
 public static void main(String[] args) {
 ProdutoEletronico celular =
 new ProdutoEletronico("Celular", 2000.00, 12);

 ProdutoEletronico notebook =
 new ProdutoEletronico("Notebook", 3500.00, 24);

 ProdutoAlimenticio arroz =
 new ProdutoAlimenticio("Arroz", 30.00, "10/12/2026");

 ProdutoAlimenticio leite =
 new ProdutoAlimenticio("Leite", 6.00, "05/12/2026");

 celular.exibirProduto();
 System.out.println();

 notebook.exibirProduto();
 System.out.println();

 arroz.exibirProduto();
 System.out.println();

 leite.exibirProduto();
    }
}
