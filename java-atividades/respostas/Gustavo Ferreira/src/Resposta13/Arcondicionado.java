package Resposta13;

public class Arcondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    public Arcondicionado(String marca, int temperatura, boolean ligado) {
        this.marca = marca;
        if (temperatura < 16) {
            this.temperatura = 16;
        } else if (temperatura > 30) {
            this.temperatura = 30;
        } else {
            this.temperatura = temperatura;
        }
        this.ligado = ligado;
    }

    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Ar-condicionado " + marca + " ligado.");
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Ar-condicionado " + marca + " desligado.");
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o ar-condicionado antes de alterar a temperatura.");
            return;
        }
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada para: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura já está no limite máximo (30 °C).");
        }
    }

    void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o ar-condicionado antes de alterar a temperatura.");
            return;
        }
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura diminuída para: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura já está no limite mínimo (16 °C).");
        }
    }
}
