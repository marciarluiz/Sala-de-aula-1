public class Main {
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Mercedes O500", 45, 4.50);
        Onibus onibus2 = new Onibus("Marcopolo Torino", 60, 5.00);
        Bicicleta bike1 = new Bicicleta("Caloi Elite", 1, "Mountain bike");
        Bicicleta bike2 = new Bicicleta("Monark Barra Forte", 1, "Urbana");

        onibus1.exibirInformacoes();
        onibus1.mover();
        System.out.println();
        onibus2.exibirInformacoes();
        onibus2.mover();
        System.out.println();
        bike1.exibirInformacoes();
        bike1.mover();
        System.out.println();
        bike2.exibirInformacoes();
        bike2.mover();
    }
}
