public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }

    public void exibirComprovante() {
        System.out.println("Comprovante -> Valor pago: R$ " + String.format("%.2f", valor));
    }
}
