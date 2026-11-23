public class televisao {

    String marca;
    int volume;
    int canal;

    public void aumentarvolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado: " + volume);
        } else {
            System.out.println("Volume ja esta no maximo.");
        }
    }

    public void diminuirvolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuido: " + volume);
        } else {
            System.out.println("Volume ja esta no minimo.");
        }
    }

    public void mudarcanal(int novocanal) {
        if (novocanal > 0) {
            canal = novocanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal invalido.");
        }
    }

    public void exibirinformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
}