class Lampada {
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
        System.out.println("Lâmpada " + cor + " de " + potencia + "W está "
                + (ligada ? "ligada" : "desligada") + ".");
    }
}

public class Atividade08 {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.potencia = 60;
        l1.ligar();

        Lampada l2 = new Lampada();
        l2.cor = "Amarela";
        l2.potencia = 40;
        l2.desligar();

        l1.mostrarEstado();
        l2.mostrarEstado();
    }
}