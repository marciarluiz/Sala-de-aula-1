public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() { return dataValidade; }
    public void setDataValidade(String dataValidade) { this.dataValidade = dataValidade; }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }

    @Override
    public void exibirProduto() {
        System.out.println("Categoria: Alimentício");
        super.exibirProduto();
        System.out.println("Validade: " + dataValidade);
    }
}
