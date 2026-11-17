public class Televisao {
    String marca;
    int volume;
    int canal;

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

    void exibirInformacoes() {
        System.out.println("TV " + marca + " | Canal atual: " + canal + " | Volume atual: " + volume);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.volume = 99;
        tv.canal = 12;

        tv.exibirInformacoes();
        tv.aumentarVolume(); // Vai para 100
        tv.aumentarVolume(); // Testa limite máximo (100)
        tv.diminuirVolume(); // Vai para 99
        tv.mudarCanal(45);
        tv.exibirInformacoes();
    }
}
