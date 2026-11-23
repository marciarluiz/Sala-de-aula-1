public class Celular {

    String marca;
    String modelo;
    int bateria;

    void ligar() {
        System.out.println("O celular " + modelo + " está ligando...");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }

    void carregarBateria() {
        System.out.println("Carregando " + modelo + "...");
        while (bateria < 100) {
            bateria += 10;
            if (bateria > 100) {
                bateria = 100;
            }
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Bateria totalmente carregada!");

    }
}