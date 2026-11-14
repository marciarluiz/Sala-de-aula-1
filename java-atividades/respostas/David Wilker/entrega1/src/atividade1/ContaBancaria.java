package atividade1;
public class ContaBancaria {

    String titular; //nome do titular da conta
    int numeroConta; //numero da conta
    double saldo; //saldo da conta

    //Deposito
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito realizado: R$ " + valor);
        }
        else {
            System.out.println("Valor inválido");
        }
    }

    //Sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        } 
        else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque. Seu saldo R$ " + saldo);
        }
        else {
            System.out.println("Valor de saque inválido");
        }
    }

    //saldo
    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo disponível: " + saldo);
    }
}