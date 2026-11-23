package Resposta1;
public class ContaBancaria {
    
    String titular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito efetivado: R$ " + valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Valor inválido para saque ou saldo insuficiente.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldo);
    }

}
