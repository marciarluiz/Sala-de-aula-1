class Televisao {
    String marca;
    int volume;
    int canal;

    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume já está no máximo (100).");
        }
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume já está no mínimo (0).");
        }
    }

    void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    void exibirInformacoes() {
        System.out.println("TV " + marca + " | Volume: " + volume + " | Canal: " + canal);
    }
}

public class Atividade11 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.volume = 98;
        tv.canal = 5;

        tv.exibirInformacoes();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume(); 
        tv.mudarCanal(12);
        tv.exibirInformacoes();

        tv.volume = 1;
        tv.diminuirVolume();
        tv.diminuirVolume(); 
        tv.mudarCanal(7);
        tv.exibirInformacoes();
    }
}