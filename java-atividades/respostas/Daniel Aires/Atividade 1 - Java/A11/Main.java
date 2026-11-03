public class Main {
    public static void main(String[] args) {

        Televisao tv = new Televisao();
        tv.setMarca("Samsung");
        tv.setVolume(98);
        tv.setCanal(5);

        System.out.println("=== Estado inicial ===");
        tv.exibirInformacoes();

        System.out.println("=== Aumentando o volume até passar do limite ===");
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();   // já está em 100, não passa

        System.out.println("\n=== Diminuindo o volume ===");
        tv.diminuirVolume();
        tv.diminuirVolume();

        System.out.println("\n=== Mudando de canal ===");
        tv.mudarCanal(12);
        tv.mudarCanal(-3);     // inválido

        System.out.println("\n=== Testando o limite mínimo ===");
        tv.setVolume(1);
        tv.diminuirVolume();
        tv.diminuirVolume();   // já está em 0, não passa

        System.out.println("\n=== Informações atualizadas ===");
        tv.exibirInformacoes();
    }
}