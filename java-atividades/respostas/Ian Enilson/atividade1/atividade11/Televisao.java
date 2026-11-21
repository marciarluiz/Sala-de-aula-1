///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Televisao {

    private String marca;
    private int volume;
    private int canal;

    public Televisao(String marca, int volume, int canal) {
        this.marca = marca;
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume já está no máximo (100).");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume já está no mínimo (0).");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal < 1) {
            System.out.println("Canal inválido.");
        } else {
            canal = novoCanal;
        }
    }

    public void exibirInformacoes() {
        System.out.println("TV " + marca + " | Volume: " + volume + " | Canal: " + canal);
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung", 98, 5);
        tv.exibirInformacoes();

        
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume(); 
        tv.exibirInformacoes();

        tv.mudarCanal(12);
        tv.exibirInformacoes();

        
        Televisao tv2 = new Televisao("LG", 1, 3);
        tv2.diminuirVolume();
        tv2.diminuirVolume(); 
        tv2.exibirInformacoes();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////