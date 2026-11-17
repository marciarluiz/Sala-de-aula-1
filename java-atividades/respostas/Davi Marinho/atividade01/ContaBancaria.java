public class ContaBancaria {
    String titular;
    String numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$ " + String.format("%.2f", valor) + ".");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Conta: " + numeroConta + " | Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Carlos Eduardo";
        conta1.numeroConta = "12345-6";
        conta1.saldo = 1000.00;

        conta1.exibirSaldo();
        conta1.depositar(500.00);
        conta1.exibirSaldo();
        conta1.sacar(300.00);
        conta1.exibirSaldo();
    }
}
