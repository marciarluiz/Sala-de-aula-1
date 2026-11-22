public class Main {
    public static void main(String[] args) {

        Televisao tv = new Televisao();

        tv.marca = "PHILCO";
        tv.volume = 50;
        tv.canal = 3;

        System.out.println("=== TELEVISÃO ===");
        System.out.println("Marca: " + tv.marca);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Canal: " + tv.canal);

        System.out.println("\n=== CONTROLES ===");

        tv.aumentarVolume();
        tv.aumentarVolume();

        tv.diminuirVolume();

        tv.mudarCanal(9);

        System.out.println("\n=== INFORMAÇÕES ATUALIZADAS ===");
        System.out.println("Marca: " + tv.marca);
        System.out.println("Volume: " + tv.volume);
        System.out.println("Canal: " + tv.canal);
    }
}

