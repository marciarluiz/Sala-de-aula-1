public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente("Ana Lima", 1000.00, 2.50);
        ContaPoupanca poupanca = new ContaPoupanca("Bruno Alves", 2000.00, 0.50);

        System.out.println("=== Conta Corrente ===");
        corrente.depositar(500.00);
        corrente.sacar(200.00);
        corrente.sacar(5000.00);
        corrente.depositar(-10.00);
        corrente.exibirSaldo();

        System.out.println();

        System.out.println("=== Conta Poupança ===");
        poupanca.depositar(300.00);
        poupanca.sacar(500.00);
        poupanca.sacar(-50.00);
        poupanca.sacar(9999.00);
        poupanca.exibirSaldo();
    }
}
