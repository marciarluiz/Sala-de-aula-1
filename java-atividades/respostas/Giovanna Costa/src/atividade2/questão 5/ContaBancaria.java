public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    protected void atualizarSaldo(double novoSaldo) {
        saldo = novoSaldo;
    }
}