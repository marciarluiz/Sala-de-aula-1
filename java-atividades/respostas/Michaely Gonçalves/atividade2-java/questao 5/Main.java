public class Main {
 public static void main(String[] args) {
 ContaCorrente corrente =
 new ContaCorrente("Carlos", 1000.00, 5.00);

 ContaPoupanca poupanca =
 new ContaPoupanca("Ana", 1500.00, 0.05);

 System.out.println("=== CONTA CORRENTE ===");
 corrente.depositar(200);
 corrente.sacar(100);
 corrente.exibirSaldo();

 System.out.println();

 System.out.println("=== CONTA POUPANÇA ===");
 poupanca.depositar(300);
 poupanca.sacar(100);
 poupanca.exibirSaldo();
    }
}
