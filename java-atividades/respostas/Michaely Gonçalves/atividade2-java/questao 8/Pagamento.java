public class Pagamento {
 private double valor;

 public Pagamento(double valor) {
 this.valor = valor;
    }

 public void processarPagamento() {
 System.out.println("Processando pagamento...");
    }

 public void exibirComprovante() {
 System.out.println("Valor: R$ " + valor);
    }

 public double getValor() {
 return valor;
    }
}
