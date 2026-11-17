public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Mendes", 5000.00, 1500.00);
        Vendedor vendedor = new Vendedor("Fernanda Lima", 2500.00, 800.00);

        gerente.exibirDados();
        vendedor.exibirDados();
    }
}
