public class Lampada {

    String cor;
    int potencia;
    boolean ligada;

    Lampada(String cor, int potencia, boolean ligada) {
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        System.out.println("Lâmpada " + cor + " de " + potencia + "W está "
                + (ligada ? "ligada." : "desligada."));
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada("branca", 60, true);   // ligada
        Lampada lampada2 = new Lampada("amarela", 40, false); // desligada

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

        System.out.println("\nAlterando os estados...");
        lampada1.desligar();
        lampada2.ligar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
