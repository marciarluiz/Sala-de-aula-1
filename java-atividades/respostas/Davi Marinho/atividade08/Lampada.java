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
        String estado = ligada ? "Ligada" : "Desligada";
        System.out.println("Lâmpada [Cor: " + cor + " | Potência: " + potencia + "W | Estado: " + estado + "]");
    }

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca Fria";
        lampada1.potencia = 9;
        lampada1.ligar();

        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela Quente";
        lampada2.potencia = 12;
        lampada2.desligar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
