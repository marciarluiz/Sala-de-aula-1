package Atividade1.Carro;

public class Main {
    public static void main(String[] args) {

        // Criação do PRIMEIRO objeto da classe Carro
        Carro carro1 = new Carro();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        carro1.Ligar();
        carro1.Desligar();
        carro1.exibirInformacoes();

        // Criação do SEGUNDO objeto da classe Carro
        Carro carro2 = new Carro();

        carro2.marca = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2019;

        carro2.Ligar();
        carro2.Desligar();
        carro2.exibirInformacoes();

        // Criação do TERCEIRO objeto da classe Carro
        Carro carro3 = new Carro();
        
        carro3.marca = "Volkswagen";
        carro3.modelo = "Polo";
        carro3.ano = 2021;

        carro3.Ligar();
        carro3.Desligar();
        carro3.exibirInformacoes();
    }
    
}
