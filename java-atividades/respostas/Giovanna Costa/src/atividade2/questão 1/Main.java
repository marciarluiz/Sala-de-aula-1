public class Main {

    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Carlos", 5000.00, 1500.00);

        Vendedor vendedor1 = new Vendedor("Ana", 2000.00, 800.00);

        gerente1.exibirDados();

        System.out.println();

        vendedor1.exibirDados();

    }
}