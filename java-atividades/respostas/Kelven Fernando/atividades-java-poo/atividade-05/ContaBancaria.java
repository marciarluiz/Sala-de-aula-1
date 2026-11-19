public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo >= 0 ? saldo : 0;
    }

    public String getTitular() { return titular; }

    public double getSaldo() { return saldo; }

    // Protegido: só as subclasses alteram o saldo, e ele nunca fica negativo.
    protected void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito recusado: o valor deve ser positivo.");
            return;
        }
        setSaldo(saldo + valor);
        System.out.printf("Depósito de R$ %,.2f realizado.%n", valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque recusado: o valor deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saque recusado: saldo insuficiente.");
            return;
        }
        setSaldo(saldo - valor);
        System.out.printf("Saque de R$ %,.2f realizado.%n", valor);
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo: R$ %,.2f%n", titular, saldo);
    }
}
