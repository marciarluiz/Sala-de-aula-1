public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Gol";
        carro1.marca = "Volkswagen";
        carro1.ano = 2018;

        Carro carro2 = new Carro();
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2022;

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar();
        carro1.exibirInformacoes();
        carro1.desligar();

        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.exibirInformacoes();
        carro2.desligar();
    }
}
