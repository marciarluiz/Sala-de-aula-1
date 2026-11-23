public class celular {

    String marca;
    String modelo;
    int bateria;

    public void ligar() {
        if (bateria > 0) {
            System.out.println(modelo + " esta ligado.");
        } else {
            System.out.println("Bateria descarregada.");
        }
    }

    public void exibirinformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }

    public void carregarbateria() {
        bateria = 100;
        System.out.println(modelo + " carregado!");
    }
}