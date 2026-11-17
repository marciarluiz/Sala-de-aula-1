public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salario));
        System.out.println("Salário Final: R$ " + String.format("%.2f", calcularSalario()));
    }
}
