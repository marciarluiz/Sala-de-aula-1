public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de " + valor + " realizado");
        } else {
            System.out.println("Valor invalido");
        }
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque de " + valor + " realizado");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
}
