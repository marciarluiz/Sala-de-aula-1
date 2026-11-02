public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    // Liga a lampada
    void ligar() {
        ligada = true;
        System.out.println("Lampada ligada!");
    }

    // Desliga a lampada
    void desligar() {
        ligada = false;
        System.out.println("Lampada desligada!");
    }

    // Mostra o estado atual
    void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potencia: " + potencia + " W");
        System.out.println("Ligada: " + ligada);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 12;
        lampada1.ligada = true;

        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 9;
        lampada2.ligada = false;

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}