public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() { return valor; }

    public void processarPagamento() {
        System.out.println("Pagamento processado.");
    }

    public void exibirComprovante() {
        System.out.println("----- COMPROVANTE -----");
        System.out.printf("Valor: R$ %,.2f%n", valor);
    }
}
