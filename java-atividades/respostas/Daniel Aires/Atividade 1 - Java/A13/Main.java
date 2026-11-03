public class Main {
    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();
        ar.setMarca("Midea");
        ar.setTemperatura(29);

        System.out.println("=== Estado inicial ===");
        ar.exibirInformacoes();

        System.out.println("=== Tentando alterar com o aparelho desligado ===");
        ar.aumentarTemperatura();

        System.out.println("\n=== Ligando o aparelho ===");
        ar.ligar();
        ar.ligar();   // já está ligado

        System.out.println("\n=== Aumentando a temperatura até o limite ===");
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();   // já está em 30, não passa

        System.out.println("\n=== Diminuindo a temperatura ===");
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();

        System.out.println("\n=== Testando o limite mínimo ===");
        ar.setTemperatura(17);
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();   // já está em 16, não passa

        System.out.println("\n=== Informações atualizadas ===");
        ar.exibirInformacoes();

        System.out.println("=== Desligando o aparelho ===");
        ar.desligar();
        ar.desligar();   // já está desligado
        ar.exibirInformacoes();
    }
}