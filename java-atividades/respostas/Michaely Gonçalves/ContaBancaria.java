
public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Maria";
        conta1.numeroConta = 1234;
        conta1.saldo = 500;

        conta1.depositar(200);
        conta1.sacar(100);

        conta1.exibirSaldo();
    }
}
