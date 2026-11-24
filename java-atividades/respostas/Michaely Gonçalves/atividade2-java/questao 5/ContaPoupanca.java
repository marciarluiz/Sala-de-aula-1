public class ContaPoupanca extends ContaBancaria {
 private double taxaRendimento;

 public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
 super(titular, saldo);
 this.taxaRendimento = taxaRendimento;
    }

 @Override
 public void sacar(double valor) {
 if (valor > 0 && valor <= getSaldo()) {
 atualizarSaldo(getSaldo() - valor);
 System.out.println("Saque realizado sem taxa!");
        } else {
 System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
