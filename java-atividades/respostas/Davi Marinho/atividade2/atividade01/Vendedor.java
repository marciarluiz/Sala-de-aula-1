public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalario() + comissao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Vendedor");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$ " + String.format("%.2f", getSalario()));
        System.out.println("Comissão: R$ " + String.format("%.2f", comissao));
        System.out.println("Salário Total Calculado: R$ " + String.format("%.2f", calcularSalario()));
        System.out.println("-----------------------------------");
    }
}
