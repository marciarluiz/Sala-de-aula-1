public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setTitular("Maria Silva");
        conta1.setNumeroConta(12345);

        conta1.exibirSaldo();

        conta1.depositar(1000.00);
        conta1.exibirSaldo();

        conta1.sacar(300.00);
        conta1.exibirSaldo();

        conta1.sacar(900.00);   // saldo insuficiente
        conta1.exibirSaldo();
    }
}