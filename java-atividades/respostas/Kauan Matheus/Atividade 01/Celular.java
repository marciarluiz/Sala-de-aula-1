// Atividade 05

public class Celular {
    String marca;
    String modelo;
    int bateria;

    void ligar() {
        System.out.println(modelo + " está ligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }

    void carregarBateria() {
        bateria = 100;
        System.out.println(modelo + " foi carregado.");
    }

    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy";
        celular1.bateria = 40;

        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone";
        celular2.bateria = 25;

        celular1.exibirInformacoes();
        celular1.carregarBateria();
        celular1.exibirInformacoes();

        System.out.println();

        celular2.exibirInformacoes();
        celular2.carregarBateria();
        celular2.exibirInformacoes();
    }
}
