public class Contabancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

    public Contabancaria(String titular, String numeroConta, double saldo) {
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
        System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " Feito com Sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque sem sucesso, tente novamente.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " Feito com Sucesso!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Usuário: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    public static void main(String[] args) {
        Contabancaria conta1 = new Contabancaria(
         "João Batista",
         "123456789", 
         325.00);

        conta1.exibirSaldo();
        conta1.depositar(272.50);
        conta1.sacar(100.00);
        conta1.sacar(1000.00);
        conta1.exibirSaldo();
    }
}


