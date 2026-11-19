public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente("Maria Silva", 1000.00, 2.50);
        ContaPoupanca poupanca = new ContaPoupanca("João Souza", 2000.00, 0.005);

        System.out.println("=== Conta Corrente ===");
        corrente.exibirSaldo();
        corrente.depositar(500.00);
        corrente.sacar(200.00);
        corrente.sacar(5000.00);
        corrente.depositar(-50.00);
        corrente.exibirSaldo();

        System.out.println();
        System.out.println("=== Conta Poupança ===");
        poupanca.exibirSaldo();
        poupanca.depositar(300.00);
        poupanca.sacar(500.00);
        poupanca.sacar(-100.00);
        poupanca.sacar(5000.00);
        poupanca.exibirSaldo();
    }
}
