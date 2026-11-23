public class Celular {

    String marca;
    String modelo;
    int bateria; // 0 a 100
    boolean ligado;

    Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.ligado = false;
    }

    void ligar() {
        if (bateria > 0) {
            ligado = true;
            System.out.println(marca + " " + modelo + " ligado.");
        } else {
            System.out.println(marca + " " + modelo + " sem bateria, não foi possível ligar.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }

    void carregarBateria() {
        System.out.println("Carregando " + marca + " " + modelo + "...");
        while (bateria < 100) {
            bateria = Math.min(bateria + 25, 100);
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Carregamento completo!");
    }

    public static void main(String[] args) {
        Celular c1 = new Celular("Samsung", "Galaxy S23", 40);
        Celular c2 = new Celular("Apple", "iPhone 14", 0);

        c1.exibirInformacoes();
        c2.exibirInformacoes();
        System.out.println();

        c1.ligar();
        c2.ligar(); // sem bateria
        System.out.println();

        c1.carregarBateria();
        System.out.println();
        c2.carregarBateria();
        System.out.println();

        c2.ligar();
        c1.exibirInformacoes();
        c2.exibirInformacoes();
    }
}
