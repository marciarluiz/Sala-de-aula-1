public class Televisao {
    String marca;
    int volume;
    int canal;

    // Aumenta o volume sem ultrapassar 100
    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    // Diminui o volume sem ficar abaixo de zero
    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    // Muda o canal
    void mudarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
        } else {
            System.out.println("Canal invalido!");
        }
    }

    // Mostra as informacoes atuais
    void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "Samsung";
        tv.volume = 20;
        tv.canal = 5;

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(10);

        tv.mostrarInformacoes();
    }
}