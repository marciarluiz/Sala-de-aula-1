package atividade8;

public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    Lampada(String cor, int potencia, boolean ligada) {
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    void ligar() {
        ligada = true;
        System.out.println("A lâmpada está ligada.");
    }

    void desligar() {
        ligada = false;
        System.out.println("A lâmpada está desligada.");
    }

    void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia);
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}
