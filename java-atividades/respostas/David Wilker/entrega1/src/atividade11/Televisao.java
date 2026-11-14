package atividade11;

public class Televisao {
    String marca;
    int volume;
    int canal;

    Televisao(String marca, int volume, int canal) {
        this.marca = marca;
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        }
        else {
            System.out.println("Volume já está no máximo.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        }
        else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 999) {
            canal = novoCanal;
            System.out.println("Canal mudado para: " + canal);
        }
        else {
            System.out.println("Canal inválido. Escolha um canal entre 1 e 999.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume atual: " + volume);
        System.out.println("Canal atual: " + canal + "\n");

    }
}
