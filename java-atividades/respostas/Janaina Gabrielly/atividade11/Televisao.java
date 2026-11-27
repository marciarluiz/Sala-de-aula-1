public class Televisao {
    String marca;
    int volume;
    int canal;

    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume no maximo");
        }
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume no minimo");
        }
    }

    void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println();
    }
}
