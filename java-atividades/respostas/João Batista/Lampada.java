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
                + (ligada ? "ligada." : "desligada."));
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada("branca", 9, true);
        Lampada lampada2 = new Lampada("amarela", 15, false);

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

        
        lampada1.desligar();
        lampada2.ligar();
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
