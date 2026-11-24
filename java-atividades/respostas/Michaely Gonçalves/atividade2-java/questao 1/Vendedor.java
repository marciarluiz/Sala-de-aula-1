public class Vendedor extends Funcionario {

 private double comissao;

 public Vendedor(String nome, double salario, double comissao) {
 super(nome, salario);
 this.comissao = comissao;
    }

 @Override
 public double calcularSalario() {
 return getSalario() + comissao;
    }

 @Override
 public void exibirDados() {
 System.out.println("=== VENDEDOR ===");
 super.exibirDados();
 System.out.println("Comissao: R$ " + comissao);
    }
}
