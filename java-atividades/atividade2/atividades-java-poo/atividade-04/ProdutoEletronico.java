public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() { return garantiaMeses; }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.10;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}
