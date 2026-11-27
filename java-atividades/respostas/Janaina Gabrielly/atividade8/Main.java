public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 10;

        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 15;

        lampada1.ligar();
        lampada2.desligar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
