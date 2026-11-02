public class Produtos {
    //Atributos//
    String nome;
    double preço;
    int quantidade;

    // Construtor
    Produtos(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    //Metodos//
    double calcularValorEstoque() {
        return preço * quantidade;
    } 
    void descontoPercentual(double percentual) {
        double desconto = preço * percentual / 100;
        preço = preço - desconto;
    }
  
  void exibirProduto() {
    System.out.println("Nome: " + nome);
    System.out.println("preço: " + preço);
    System.out.println("Quantidade: " + quantidade);
    System.out.println("Valor do estoque: " + calcularValorEstoque());
  }
}
