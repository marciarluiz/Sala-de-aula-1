public class Carro {

    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println("O " + modelo + " já está ligado!");
        } else {
            ligado = true;
            System.out.println("O " + modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println("O " + modelo + " já está desligado!");
        } else {
            ligado = false;
            System.out.println("O " + modelo + " foi desligado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + " | Marca: " + marca + " | Ano: " + ano + " | Ligado: " + ligado);

    }
}