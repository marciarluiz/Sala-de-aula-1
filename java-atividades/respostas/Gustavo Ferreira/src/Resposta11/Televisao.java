package Resposta11;

public class Televisao {
    String marca;
    int volume;
    int canal;

    public Televisao(String marca, int volume, int canal) {
        this.marca = marca;
        if (volume < 0) {
            this.volume = 0;
        } else if (volume > 100) {
            this.volume = 100;
        } else {
            this.volume = volume;
        }
        this.canal = canal;
    }

    void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume já está no máximo (100).");
        }
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo (0).");
        }
    }

    void mudarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }

    void exibirStatus() {
        System.out.println("TV: " + marca + "\n" + "Canal: " + canal + "\n" + "Volume: " + volume);
    }
}
