public class Celular {

    String marca;
    String modelo;
    int bateria;

    void ligar() {
        System.out.println(modelo + " ligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("==================");
    }

    void carregarBateria() {
        System.out.println("Carregando " + modelo + "...");
        bateria = 100; 
        System.out.println("Bateria carregada: " + bateria + "%");
    }

    public static void main(String[] args) {
        
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy A54";
        celular1.bateria = 40;

        Celular celular2 = new Celular();
        celular2.marca = "Motorola";
        celular2.modelo = "Moto G";
        celular2.bateria = 75;

        celular1.ligar();
        celular2.ligar();
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        celular1.carregarBateria();
        celular2.carregarBateria();
    }
}
