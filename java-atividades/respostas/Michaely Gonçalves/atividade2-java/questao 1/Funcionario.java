public class Funcionario {

 private String nome;
 private double salario;

 public Funcionario(String nome, double salario) {
 this.nome = nome;
 this.salario = salario;
    }

 public double calcularSalario() {
 return salario;
    }

 public void exibirDados() {
 System.out.println("Nome: " + nome);
 System.out.println("Salario base: R$ " + salario);
 System.out.println("Salario final: R$ " + calcularSalario());
    }

 public String getNome() {
 return nome;
    }

 public double getSalario() {
 return salario;
    }
}
