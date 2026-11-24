//Atividade 01
public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    // Adiciona dinheiro à conta
    void depositar(double valor) {
        saldo = saldo + valor;
    }

    // Retira dinheiro da conta
    void sacar(double valor) {
        saldo = saldo - valor;
    }

    // Mostra o saldo
    void exibirSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        // Cria uma conta
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Ana";
        conta.numeroConta = 123;
        conta.saldo = 0;

        // Faz um depósito e um saque
        conta.depositar(100);
        conta.sacar(30);

        // Exibe o saldo final
        conta.exibirSaldo();
    }
}
