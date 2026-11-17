public class Celular {
    String marca;
    String modelo;
    int bateria;

    void ligar() {
        if (bateria > 0) {
            System.out.println("O celular " + marca + " " + modelo + " está ligando...");
        } else {
            System.out.println("Bateria descarregada! Não é possível ligar o " + marca + " " + modelo + ".");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }

    void carregarBateria() {
        bateria = 100;
        System.out.println("Carregando " + marca + " " + modelo + "... Bateria totalmente carregada (100%)!");
    }

    void carregarBateria(int carga) {
        bateria += carga;
        if (bateria > 100) {
            bateria = 100;
        }
        System.out.println("Carregando " + marca + " " + modelo + "... Bateria atual: " + bateria + "%");
    }

    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S23";
        celular1.bateria = 45;

        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 15";
        celular2.bateria = 20;

        System.out.println("=== Informações Iniciais ===");
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        System.out.println("\n=== Ligando e Carregando ===");
        celular1.ligar();
        celular1.carregarBateria();
        celular1.exibirInformacoes();

        System.out.println();
        celular2.ligar();
        celular2.carregarBateria();
        celular2.exibirInformacoes();
    }
}
