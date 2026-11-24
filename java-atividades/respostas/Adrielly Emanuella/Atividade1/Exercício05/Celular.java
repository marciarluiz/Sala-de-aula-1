public class Celular {
    String marca;
    String modelo;
    int bateria;

    // Liga o celular
    void ligar() {
        if (bateria > 0) {
            System.out.println(modelo + " ligado!");
        } else {
            System.out.println("Bateria descarregada!");
        }
    }

    // Mostra as informacoes
    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("--------------------");
    }

    // Carrega a bateria
    void carregarBateria() {
        bateria = 100;
        System.out.println(modelo + " carregado!");
    }

    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy A";
        celular1.bateria = 30;

        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone";
        celular2.bateria = 50;

        celular1.exibirInformacoes();
        celular1.carregarBateria();
        celular1.ligar();

        celular2.exibirInformacoes();
        celular2.carregarBateria();
        celular2.ligar();
    }
}