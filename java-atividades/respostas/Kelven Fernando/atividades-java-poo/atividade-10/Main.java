public class Main {
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Mercedes-Benz O500", 45, 4.50);
        Onibus onibus2 = new Onibus("Marcopolo Torino", 40, 5.00);
        Bicicleta bicicleta1 = new Bicicleta("Caloi Elite", 1, "Mountain bike");
        Bicicleta bicicleta2 = new Bicicleta("Monark Barra Circular", 1, "Urbana");

        System.out.println("=== Ônibus ===");
        onibus1.exibirInformacoes();
        onibus1.mover();
        System.out.println();
        onibus2.exibirInformacoes();
        onibus2.mover();

        System.out.println();
        System.out.println("=== Bicicletas ===");
        bicicleta1.exibirInformacoes();
        bicicleta1.mover();
        System.out.println();
        bicicleta2.exibirInformacoes();
        bicicleta2.mover();
    }
}
