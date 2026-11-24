public class ProdutoEletronico extends Produto {
 private int garantiaMeses;

 public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
 super(nome, preco);
 this.garantiaMeses = garantiaMeses;
    }

 @Override
 public double calcularDesconto() {
 return getPreco() * 0.10;
    }

 @Override
 public void exibirProduto() {
 System.out.println("=== PRODUTO ELETRÔNICO ===");
 super.exibirProduto();
 System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}
