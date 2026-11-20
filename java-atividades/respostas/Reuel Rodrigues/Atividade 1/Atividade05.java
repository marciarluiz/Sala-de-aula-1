class Celular {
    String marca;
    String modelo;
    int bateria; // 0 a 100

    void ligar() {
        System.out.println(marca + " " + modelo + " ligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }

    void carregarBateria() {
        System.out.println("Carregando " + marca + " " + modelo + "...");
        while (bateria < 100) {
            bateria += 10;
            if (bateria > 100) {
                bateria = 100;
            }
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Bateria completa!");
    }
}

public class Atividade05 {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Samsung";
        c1.modelo = "Galaxy S23";
        c1.bateria = 40;

        Celular c2 = new Celular();
        c2.marca = "Apple";
        c2.modelo = "iPhone 14";
        c2.bateria = 75;

        c1.ligar();
        c1.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();

        System.out.println();
        c1.carregarBateria();
        System.out.println();
        c2.carregarBateria();
    }
}