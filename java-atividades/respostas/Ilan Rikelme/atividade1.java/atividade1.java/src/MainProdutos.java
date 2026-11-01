public class MainProdutos {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos( "Arroz", 25.90, 10);
        Produtos produto2 = new Produtos( "Feijão", 9.70, 7);
        Produtos produto3 = new Produtos( "açucar", 7.80, 9);
        produto1.descontoPercentual(20);
        produto2.descontoPercentual(15);
        produto3.descontoPercentual(3);
        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
    }
}
