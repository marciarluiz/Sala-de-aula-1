public class Celular {

    // Atributos
    String marca;
    String modelo;
    int bateria;

    // Método para ligar
    public void ligar() {
        if (bateria > 0) {
            System.out.println("O celular está ligado!");
        } else {
            System.out.println("Bateria descarregada! Carregue o celular.");
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("-------------------------");
    }

    // Método para carregar bateria
    public void carregarBateria() {
        bateria = 100;
        System.out.println("Celular carregado!");
    }
}