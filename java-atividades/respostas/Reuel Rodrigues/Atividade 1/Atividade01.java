class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Conta: " + numeroConta + " | Saldo: R$ " + saldo);
    }
}

public class Atividade01 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Maria Silva";
        conta1.numeroConta = 12345;
        conta1.saldo = 500.0;

        conta1.exibirSaldo();
        conta1.depositar(250.0);
        conta1.sacar(100.0);
        conta1.sacar(1000.0);
        conta1.exibirSaldo();
    }
}