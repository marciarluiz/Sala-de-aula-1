public class MainControletv {
    public static void main(String[] args) {
        ControleTv controle = new ControleTv();
        controle.marca = "Sansung";
        controle.canal = 4;
        controle.volume = 48;
        System.out.println("=== INFORMAÇÕES INICIAIS ===");
        controle.exibirInformações();

         // Aumentando o volume
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();

        // Diminuindo o volume
        controle.diminuirVolume();

        // Mudando o canal
        controle.mudarCanal(10);

        System.out.println("\n=== INFORMAÇÕES ATUALIZADAS ===");
        controle.exibirInformações();
    }
}
