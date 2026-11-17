public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Roberto Almeida", 1000.00, 5.00);
        ContaPoupanca cp = new ContaPoupanca("Mariana Souza", 800.00, 0.005);

        System.out.println("=== Conta Corrente ===");
        cc.exibirSaldo();
        cc.depositar(200.00);
        cc.sacar(300.00);
        cc.exibirSaldo();

        System.out.println("\n=== Conta Poupança ===");
        cp.exibirSaldo();
        cp.depositar(150.00);
        cp.sacar(250.00);
        cp.exibirSaldo();
    }
}
