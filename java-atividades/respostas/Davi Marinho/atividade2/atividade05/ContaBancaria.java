public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = (saldo >= 0) ? saldo : 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado na conta de " + titular + ".");
        } else {
            System.out.println("Valor de depósito inválido! Informe um valor positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido! Informe um valor positivo.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$ " + String.format("%.2f", valor) + ".");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
}
