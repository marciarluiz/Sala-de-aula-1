public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Janaina";
        conta1.numeroConta = "12345";
        conta1.saldo = 0;

        conta1.depositar(500);
        conta1.sacar(150);
        conta1.sacar(1000);
        conta1.exibirSaldo();
    }
}
