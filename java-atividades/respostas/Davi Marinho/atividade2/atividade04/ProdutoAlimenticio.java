public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }

    @Override
    public void exibirProduto() {
        double desconto = calcularDesconto();
        double precoFinal = getPreco() - desconto;
        System.out.println("Produto Alimentício: " + getNome() + " (Validade: " + dataValidade + ")");
        System.out.println("Preço Original: R$ " + String.format("%.2f", getPreco()));
        System.out.println("Desconto (5%): R$ " + String.format("%.2f", desconto));
        System.out.println("Preço Final: R$ " + String.format("%.2f", precoFinal));
        System.out.println("-----------------------------------");
    }
}
