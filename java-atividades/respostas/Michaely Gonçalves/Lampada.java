
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
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        }
    }

    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();

        l1.cor = "Branca";
        l1.potencia = 12;
        l1.ligar();

        l2.cor = "Amarela";
        l2.potencia = 9;
        l2.desligar();

        l1.mostrarEstado();
        l2.mostrarEstado();
    }
}
