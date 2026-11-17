public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Gerente");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$ " + String.format("%.2f", getSalario()));
        System.out.println("Bônus: R$ " + String.format("%.2f", bonus));
        System.out.println("Salário Total Calculado: R$ " + String.format("%.2f", calcularSalario()));
        System.out.println("-----------------------------------");
    }
}
