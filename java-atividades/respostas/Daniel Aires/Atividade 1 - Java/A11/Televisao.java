public class Televisao {

    // Constantes dos limites de volume
    private static final int VOLUME_MINIMO = 0;
    private static final int VOLUME_MAXIMO = 100;

    // Atributos
    private String marca;
    private int volume;
    private int canal;

    // Construtor padrão
    public Televisao() {
        this.canal = 1;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= VOLUME_MINIMO && volume <= VOLUME_MAXIMO) {
            this.volume = volume;
        } else {
            System.out.println("Volume inválido (use de 0 a 100).");
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal > 0) {
            this.canal = canal;
        } else {
            System.out.println("Canal inválido.");
        }
    }

    // Métodos
    public void aumentarVolume() {
        if (volume < VOLUME_MAXIMO) {
            volume++;
            System.out.println(marca + ": volume aumentado para " + volume + ".");
        } else {
            System.out.println(marca + ": volume já está no máximo (" + VOLUME_MAXIMO + ").");
        }
    }

    public void diminuirVolume() {
        if (volume > VOLUME_MINIMO) {
            volume--;
            System.out.println(marca + ": volume diminuído para " + volume + ".");
        } else {
            System.out.println(marca + ": volume já está no mínimo (" + VOLUME_MINIMO + ").");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println(marca + ": canal alterado para " + canal + ".");
        } else {
            System.out.println(marca + ": canal inválido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("-----------------------------");
    }
}