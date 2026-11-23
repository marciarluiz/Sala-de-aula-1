package Resposta3;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2020;
        carro1.ligado = false;

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.desligar();

        Carro carro2 = new Carro();
        carro2.modelo = "Corolla";
        carro2.marca = "Toyota";
        carro2.ano = 2021;
        carro2.ligado = true;
        
        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.desligar();
    }
}
