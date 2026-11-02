public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque();
        Estoque estoque2 = new Estoque();
        estoque1.nome = "Feijão";
        estoque1.preço = 7.80;
        estoque1.quantidade = 10;

        estoque2.nome = "Arroz";
        estoque2.preço = 6.90;
        estoque2.quantidade = 20;

        estoque1.mostrarEstoque();
        estoque2.mostrarEstoque();
        estoque1.adicionarEstoque(10);
        estoque2.retirarEstoque(5);

        estoque1.mostrarEstoque();
        estoque2.mostrarEstoque();
    }
}
