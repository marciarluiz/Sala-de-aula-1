public class Gerente extends Funcionario {

 private double bonus;

 public Gerente(String nome, double salario, double bonus) {
 super(nome, salario);
 this.bonus = bonus;
    }

 @Override
 public double calcularSalario() {
 return getSalario() + bonus;
    }

 @Override
 public void exibirDados() {
 System.out.println("=== GERENTE ===");
 super.exibirDados();
 System.out.println("Bonus: R$ " + bonus);
    }
}
