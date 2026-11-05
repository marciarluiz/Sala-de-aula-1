
public class Celular {
    String marca;
    String modelo;
    int bateria;

    void ligar() {
        System.out.println("Celular ligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }

    void carregarBateria() {
        bateria = 100;
        System.out.println("Bateria carregada!");
    }

    public static void main(String[] args) {
        Celular c1 = new Celular();
        Celular c2 = new Celular();

        c1.marca = "Samsung";
        c1.modelo = "Galaxy A15";
        c1.bateria = 50;

        c2.marca = "Motorola";
        c2.modelo = "Moto G84";
        c2.bateria = 30;

        c1.ligar();
        c1.exibirInformacoes();
        c1.carregarBateria();

        c2.ligar();
        c2.exibirInformacoes();
        c2.carregarBateria();
    }
}

