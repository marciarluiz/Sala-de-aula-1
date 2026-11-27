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
        System.out.println("Potencia: " + potencia + "W");
        if (ligada) {
            System.out.println("Estado: ligada");
        } else {
            System.out.println("Estado: desligada");
        }
        System.out.println();
    }
}
