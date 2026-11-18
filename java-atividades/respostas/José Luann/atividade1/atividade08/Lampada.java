public class Lampada {
    private String cor;
    private int potencia;
    private boolean ligada;

    public Lampada(String cor, int potencia, boolean ligada) {
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        System.out.println("Lâmpada " + cor + " de " + potencia + "W está "
                + (ligada ? "LIGADA" : "DESLIGADA"));
    }

    public static void main(String[] args) {
        Lampada l1 = new Lampada("branca", 12, true);
        Lampada l2 = new Lampada("amarela", 9, false);

        l1.mostrarEstado();
        l2.mostrarEstado();

        System.out.println("Alternando os estados...");
        l1.desligar();
        l2.ligar();
        l1.mostrarEstado();
        l2.mostrarEstado();
    }
}
