public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.%n", valor);
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Conta: " + numeroConta);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Maria Silva", "12345-6", 500.00);
        conta1.exibirSaldo();
        conta1.depositar(250.00);
        conta1.sacar(100.00);
        conta1.sacar(1000.00); // deve ser recusado
        conta1.exibirSaldo();
    }
}
