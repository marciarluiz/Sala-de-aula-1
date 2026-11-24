public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public void processarPagamento() {
        System.out.println("Pagamento realizado");
    }

    public void exibirComprovante() {
        System.out.printf("Valor: R$ %.2f%n", valor);
    }
}
