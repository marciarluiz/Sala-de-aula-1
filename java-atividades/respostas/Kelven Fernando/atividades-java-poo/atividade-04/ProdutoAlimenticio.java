public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() { return dataValidade; }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }

    @Override
    public void exibirProduto() {
        super.exibirProduto();
        System.out.println("Validade: " + dataValidade);
    }
}
