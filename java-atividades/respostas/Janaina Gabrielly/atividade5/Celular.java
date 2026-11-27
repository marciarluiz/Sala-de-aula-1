public class Celular {
    String marca;
    String modelo;
    int bateria;

    void ligar() {
        System.out.println(modelo + " ligado");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println();
    }

    void carregarBateria() {
        System.out.println("Carregando " + modelo + "...");
        while (bateria < 100) {
            bateria = bateria + 10;
            System.out.println("Bateria em " + bateria + "%");
        }
        System.out.println("Carregado!");
    }
}
