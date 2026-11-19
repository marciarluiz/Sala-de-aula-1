public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Almeida", 8000.00, 2500.00);
        Vendedor vendedor = new Vendedor("Ana Souza", 3000.00, 1200.00);

        System.out.println("=== Gerente ===");
        gerente.exibirDados();

        System.out.println();
        System.out.println("=== Vendedor ===");
        vendedor.exibirDados();

        System.out.println();
        System.out.printf("Salário calculado do gerente: R$ %,.2f%n", gerente.calcularSalario());
        System.out.printf("Salário calculado do vendedor: R$ %,.2f%n", vendedor.calcularSalario());
    }
}
