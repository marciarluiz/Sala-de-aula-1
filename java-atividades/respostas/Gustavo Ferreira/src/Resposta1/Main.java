package Resposta1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Gustavo";
        conta1.numeroConta = 12345;
        conta1.saldo = 1000.00;

        conta1.exibirSaldo();
        conta1.depositar(500.00);
        conta1.exibirSaldo();
        conta1.sacar(200.00);
        conta1.exibirSaldo();
    }
}
