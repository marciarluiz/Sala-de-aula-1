public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Ilan";
        conta1.numeroConta = 12345;
        conta1.saldo = 1500;
        conta1.depositar(560);
        conta1.sacar(1230);
        conta1.exibirSaldo();
    }
}
