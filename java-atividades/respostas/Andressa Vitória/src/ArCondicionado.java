public class ArCondicionado {

    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }

    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + "°C");
        } else {
            System.out.println("Temperatura já está no máximo (30°C).");
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura: " + temperatura + "°C");
        } else {
            System.out.println("Temperatura já está no mínimo (16°C).");

        }
    }
}