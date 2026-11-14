package atividade13;

public class ArCondicionado {
    String marca;
    double temperatura;
    boolean ligado;

    ArCondicionado(String marca, double temperatura) {
        this.marca = marca;
        this.temperatura = temperatura;
        this.ligado = false;
    }

    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O ar-condicionado " + marca + " foi ligado.");
        } else {
            System.out.println("O ar-condicionado " + marca + " já está ligado.");
        }
    }

    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O ar-condicionado " + marca + " foi desligado.");
        } else {
            System.out.println("O ar-condicionado " + marca + " já está desligado.");
        }
    }

    void aumentarTemperatura() {
        if (ligado) {
            if (temperatura < 30) {
                temperatura += 1;
                System.out.println("A temperatura do ar-condicionado " + marca + " foi aumentada para " + temperatura + "°C.");
            } else {
                System.out.println("A temperatura do ar-condicionado " + marca + " já está no máximo.");
            }
        } else {
            System.out.println("O ar-condicionado " + marca + " está desligado. Ligue-o antes de ajustar a temperatura.");
        }
    }

    void diminuirTemperatura() {
        if (ligado) {
            if (temperatura > 16) {
                temperatura -= 1;
                System.out.println("A temperatura do ar-condicionado " + marca + " foi diminuída para " + temperatura + "°C.");
            } else {
                System.out.println("A temperatura do ar-condicionado " + marca + " já está no mínimo.");
            }
        } else {
            System.out.println("O ar-condicionado " + marca + " está desligado. Ligue-o antes de ajustar a temperatura.");
        }
    }
}
