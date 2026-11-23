public class ArCondicionado {

    String marca;
    int temperatura; // entre 16 e 30
    boolean ligado;

    ArCondicionado(String marca, int temperatura) {
        this.marca = marca;
        this.temperatura = temperatura;
        this.ligado = false;
    }

    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }

    void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura máxima (30 °C) atingida.");
        }
    }

    void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura mínima (16 °C) atingida.");
        }
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("LG", 24);

        ar.aumentarTemperatura(); // desligado
        ar.ligar();

        System.out.println("\nAumentando até passar do limite:");
        for (int i = 0; i < 8; i++) {
            ar.aumentarTemperatura();
        }

        System.out.println("\nDiminuindo até passar do limite:");
        for (int i = 0; i < 16; i++) {
            ar.diminuirTemperatura();
        }

        System.out.println();
        ar.desligar();
    }
}
