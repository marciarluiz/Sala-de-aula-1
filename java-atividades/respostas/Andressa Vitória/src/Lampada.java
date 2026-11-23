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
        String estado;
        if (ligada) {
            estado = "ligada";
        } else {
            estado = "desligada";
        }
        System.out.println("Lâmpada " + cor + " de " + potencia + "W está " + estado + ".");

    }
}