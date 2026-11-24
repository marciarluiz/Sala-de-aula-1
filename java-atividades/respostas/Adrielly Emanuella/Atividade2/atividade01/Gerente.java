public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Gerente");
        super.exibirDados();
        System.out.printf("Bônus: R$ %.2f%n", bonus);
    }
}
