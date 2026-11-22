
public class Main {
    public static void main(String[] args) {

        // Primeiro carro
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2026;

        // Segundo carro
        Carro carro2 = new Carro();
        carro2.modelo = "Opala";
        carro2.marca = "Chevrolet";
        carro2.ano =  1992;

        // Testando o primeiro carro
        System.out.println("PRIMEIRO CARRO");
        carro1.exibirInformacoes();

        carro1.ligar();
        carro1.ligar(); // Tentativa de ligar novamente
        carro1.exibirInformacoes();

        carro1.desligar();
        carro1.exibirInformacoes();

        // Testando o segundo carro
        System.out.println("SEGUNDO CARRO");
        carro2.exibirInformacoes();

        carro2.ligar();
        carro2.exibirInformacoes();

        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
