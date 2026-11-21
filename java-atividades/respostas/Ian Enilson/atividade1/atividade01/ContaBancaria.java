///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado.");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ian Enilson", "12345-6", 500.00);

        conta1.exibirSaldo();
        conta1.depositar(250.00);
        conta1.sacar(100.00);
        conta1.sacar(1000.00);
        conta1.exibirSaldo();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
