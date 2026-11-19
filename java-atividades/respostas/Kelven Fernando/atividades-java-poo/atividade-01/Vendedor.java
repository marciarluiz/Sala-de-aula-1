public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() { return comissao; }

    @Override
    public double calcularSalario() {
        return getSalario() + comissao;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Cargo: Vendedor | Comissão: R$ %,.2f%n", comissao);
        super.exibirDados();
    }
}
