public class Produto {
 private String nome;
 private double preco;

 public Produto(String nome, double preco) {
 this.nome = nome;
 this.preco = preco;
    }

 public double calcularDesconto() {
 return 0;
    }

 public void exibirProduto() {
 double desconto = calcularDesconto();

 System.out.println("Nome: " + nome);
 System.out.println("Preço original: R$ " + preco);
 System.out.println("Desconto: R$ " + desconto);
 System.out.println("Preço final: R$ " + (preco - desconto));
    }

 public String getNome() {
 return nome;
    }

 public double getPreco() {
 return preco;
    }
}
