public class Televisao {

    String marca;
    int volume;
    int canal;

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("O volume já está no máximo!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("O volume já está no mínimo!");
        }
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }
}
