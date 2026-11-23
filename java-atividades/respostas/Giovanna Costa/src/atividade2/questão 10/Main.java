public class Main {
    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Mercedes-Benz", 50, 5.50);
        Onibus onibus2 = new Onibus("Volvo", 45, 6.00);

        Bicicleta bicicleta1 = new Bicicleta("Caloi", 1, "Mountain Bike");
        Bicicleta bicicleta2 = new Bicicleta("Trek", 1, "Urbana");

        onibus1.exibirInformacoes();
        onibus1.mover();

        System.out.println();

        onibus2.exibirInformacoes();
        onibus2.mover();

        System.out.println();

        bicicleta1.exibirInformacoes();
        bicicleta1.mover();

        System.out.println();

        bicicleta2.exibirInformacoes();
        bicicleta2.mover();
    }
}