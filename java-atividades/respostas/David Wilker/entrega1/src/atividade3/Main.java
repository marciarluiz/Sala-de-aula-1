package atividade3;

public class Main {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Hilux";
        carro1.ano = 2017;
        carro1.ligado = false;

        Carro carro2 = new Carro();
        carro2.marca = "Fiat";
        carro2.modelo = "Strada";
        carro2.ano = 2024;
        carro2.ligado = true;

        System.out.println("Teste carro 1 (com desafio incluso)");
        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar();
        carro1.desligar();
        carro1.exibirInformacoes();

        System.out.println("Teste carro 2");
        carro2.desligar();
        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
