///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Celular {

    private String marca;
    private String modelo;
    private int bateria; // porcentagem de 0 a 100
    private boolean ligado;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.ligado = false;
    }

    public void ligar() {
        if (bateria == 0) {
            System.out.println(modelo + " está sem bateria e não pode ligar.");
        } else {
            ligado = true;
            System.out.println(modelo + " ligado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Ligado: " + (ligado ? "sim" : "não"));
        System.out.println("---------------------");
    }

    // Simula o carregamento de 10 em 10 até chegar a 100%
    public void carregarBateria() {
        System.out.println("Carregando " + modelo + "...");
        while (bateria < 100) {
            bateria = Math.min(bateria + 10, 100);
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Carregamento completo!");
    }

    public static void main(String[] args) {
        Celular c1 = new Celular("Samsung", "Galaxy A54", 40);
        Celular c2 = new Celular("Motorola", "Moto G73", 75);

        c1.ligar();
        c2.ligar();
        c1.exibirInformacoes();
        c2.exibirInformacoes();

        c1.carregarBateria();
        c2.carregarBateria();

        c1.exibirInformacoes();
        c2.exibirInformacoes();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////