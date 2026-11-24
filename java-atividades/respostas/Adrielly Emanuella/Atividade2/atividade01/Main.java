public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Silva", 8000.00, 2500.00);
        Vendedor vendedor = new Vendedor("Mariana Souza", 3000.00, 1200.00);

        gerente.exibirDados();
        System.out.println();
        vendedor.exibirDados();

        System.out.println();
        System.out.printf("Salário calculado do gerente: R$ %.2f%n", gerente.calcularSalario());
        System.out.printf("Salário calculado do vendedor: R$ %.2f%n", vendedor.calcularSalario());
    }
}
