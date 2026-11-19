public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Cargo: Gerente | Bônus: R$ %,.2f%n", bonus);
        super.exibirDados();
    }
}
