
public class Televisao {
    String marca;
    int volume;
    int canal;

    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    void mudarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao();

        tv.marca = "Samsung";
        tv.volume = 50;
        tv.canal = 5;

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();

        tv.mudarCanal(10);

        tv.exibirInformacoes();
    }
}

