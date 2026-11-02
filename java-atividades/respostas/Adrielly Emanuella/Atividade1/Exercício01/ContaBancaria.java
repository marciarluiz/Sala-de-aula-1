public class ContaBancaria {

    // Dados da conta
    String titular;
    int numeroConta;
    double saldo;

    // Faz um deposito
    void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado!");
    }

    // Retira dinheiro da conta
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Mostra os dados da conta
    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {

        // Cria uma conta
        ContaBancaria conta = new ContaBancaria();

        // Coloca os dados da conta
        conta.titular = "Adrielly";
        conta.numeroConta = 123;
        conta.saldo = 100;

        // Testa os metodos
        conta.depositar(50);
        conta.sacar(30);
        conta.exibirSaldo();
    }
}