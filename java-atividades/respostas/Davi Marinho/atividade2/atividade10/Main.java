public class Main {
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Mercedes-Benz Torino", 45, 4.50);
        Onibus onibus2 = new Onibus("Marcopolo Paradiso", 50, 12.00);

        Bicicleta bike1 = new Bicicleta("Caloi Explorer", 1, "Mountain Bike");
        Bicicleta bike2 = new Bicicleta("Sense Urban", 1, "Urbana");

        onibus1.exibirInformacoes();
        onibus1.mover();
        System.out.println("-----------------------------------");

        onibus2.exibirInformacoes();
        onibus2.mover();
        System.out.println("-----------------------------------");

        bike1.exibirInformacoes();
        bike1.mover();
        System.out.println("-----------------------------------");

        bike2.exibirInformacoes();
        bike2.mover();
    }
}
