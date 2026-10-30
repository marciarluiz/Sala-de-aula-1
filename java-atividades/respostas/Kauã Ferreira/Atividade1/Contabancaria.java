
/**
 * ATIVIDADE 1 - CONTA BANCÁRIA
 */

public class Contabancaria {
    // Atributos
    String titular;
    int numeroConta;
    double saldo;

    // Adiciona dinheiro ao saldo
    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ "
                    + String.format("%.2f", valor) + " realizado");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Retira dinheiro se houver saldo suficiente
    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$ "
                    + String.format("%.2f", valor) + ".");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ "
                    + String.format("%.2f", valor) + " realizado");
        }
    }

    // Mostra os dados da conta e o saldo atual
    void exibirSaldo() {
        System.out.println("Titular: " + titular
                + " | Conta: " + numeroConta
                + " | Saldo: R$ " + String.format("%.2f", saldo));
    }

    public static void main(String[] args) {
        // Criação do objeto
        Contabancaria conta1 = new Contabancaria();

        conta1.titular = "Marcia Ramos";
        conta1.numeroConta = 13131313;
        conta1.saldo = 0;

        conta1.exibirSaldo();
        conta1.depositar(15000);
        conta1.sacar(1000);
        conta1.sacar(15000);
        conta1.exibirSaldo();
    }
}
