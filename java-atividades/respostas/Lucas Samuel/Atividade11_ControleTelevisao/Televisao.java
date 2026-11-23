public class Televisao {

    String marca;
    int volume; // 0 a 100
    int canal;

    Televisao(String marca, int volume, int canal) {
        this.marca = marca;
        this.volume = volume;
        this.canal = canal;
    }

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
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal + ".");
        } else {
            System.out.println("Canal inválido.");
        }
    }

    void exibirInformacoes() {
        System.out.println("TV " + marca + " | Volume: " + volume + " | Canal: " + canal);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung", 98, 5);
        tv.exibirInformacoes();

        System.out.println("\nAumentando o volume...");
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume(); // passa do limite
        tv.exibirInformacoes();

        System.out.println("\nMudando de canal...");
        tv.mudarCanal(12);
        tv.mudarCanal(-3); // inválido

        System.out.println("\nDiminuindo o volume...");
        for (int i = 0; i < 101; i++) { // vai além de 0 para testar o limite
            tv.diminuirVolume();
        }
        tv.exibirInformacoes();
    }
}
