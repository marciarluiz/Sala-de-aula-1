public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo >= 0 ? saldo : 0;
    }

    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }
    public double getSaldo() { return saldo; }
    protected void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido: o valor deve ser positivo.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: o valor deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saque negado: saldo insuficiente.");
            return;
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado.%n", valor);
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }
}
