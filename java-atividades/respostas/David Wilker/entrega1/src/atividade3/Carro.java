package atividade3;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    // Método para ligar o carro (com a regra do beneficio)
    void ligar() {
        if (ligado) {
            System.out.println("Aviso: O carro " + marca + " " + modelo + " já está ligado! Desligue-o antes de ligar novamente.");
        }
        else {
            ligado = true;
            System.out.println("O carro " + marca + " " + modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println("Aviso: O carro " + marca + " " + modelo + " já está desligado! ligue-o antes de ligar novamente.");
        }
        else {
            ligado = false;
            System.out.println("O carro " + marca + " " + modelo + " foi desligado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}
