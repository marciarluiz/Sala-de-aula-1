package Atividade1.Banco;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Maria";
        conta1.numeroConta = 1001;
        conta1.saldo = 0;

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.exibirSaldo();
    }
}