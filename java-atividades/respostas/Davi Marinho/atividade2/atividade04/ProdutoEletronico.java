public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.10;
    }

    @Override
    public void exibirProduto() {
        double desconto = calcularDesconto();
        double precoFinal = getPreco() - desconto;
        System.out.println("Produto Eletrônico: " + getNome() + " (Garantia: " + garantiaMeses + " meses)");
        System.out.println("Preço Original: R$ " + String.format("%.2f", getPreco()));
        System.out.println("Desconto (10%): R$ " + String.format("%.2f", desconto));
        System.out.println("Preço Final: R$ " + String.format("%.2f", precoFinal));
        System.out.println("-----------------------------------");
    }
}
