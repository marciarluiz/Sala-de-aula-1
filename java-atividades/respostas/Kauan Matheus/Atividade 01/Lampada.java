// Atividade 08

public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + " W");

        if (ligada) {
            System.out.println("Estado: ligada");
        } else {
            System.out.println("Estado: desligada");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 10;
        lampada1.ligar();

        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 15;
        lampada2.desligar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
