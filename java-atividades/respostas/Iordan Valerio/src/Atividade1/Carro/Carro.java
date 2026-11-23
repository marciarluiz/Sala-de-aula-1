package Atividade1.Carro;

public class Carro {
    String marca;
    String modelo;
    int ano;

    void Ligar(){
        System.out.println("O " + marca + " " + modelo + " " + ano + " está ligando");
    }

    void Desligar(){
        System.out.println("O " + marca + " " + modelo + " " + ano + " está desligando");
    }
    
    void exibirInformacoes(){
        System.out.println("\nDados do carro\n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
