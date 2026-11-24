public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public double calcularSalario() {
        return salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário base: R$ %.2f%n", salario);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalario());
    }
}
