package Atividade1.Celular;

public class Celular {
    String marca;
    String modelo;
    int bateria;


    public void ligar(){
        System.out.println("O " + modelo + " está ligando.");
    }

    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria);
    }

    public void carregarBateria(){
        System.out.println("Seu celular está carregando: " + bateria + "%");

    }
}
