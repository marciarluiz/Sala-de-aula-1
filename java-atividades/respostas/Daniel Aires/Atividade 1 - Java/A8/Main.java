public class Main {
    public static void main(String[] args) {

        Lampada lampada1 = new Lampada();
        lampada1.setCor("Branca");
        lampada1.setPotencia(60);

        Lampada lampada2 = new Lampada();
        lampada2.setCor("Amarela");
        lampada2.setPotencia(40);

        // Configurando: lâmpada 1 ligada, lâmpada 2 desligada
        lampada1.ligar();
        lampada2.desligar();

        System.out.println("\n=== Estado das lâmpadas ===");
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

        // Demonstração de funcionamento: invertendo os estados
        System.out.println("=== Invertendo os estados ===");
        lampada1.desligar();
        lampada2.ligar();

        System.out.println("\n=== Estado após a inversão ===");
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}