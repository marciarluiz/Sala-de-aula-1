
public class Celular {

    private String marca;
    private String modelo;
    private double bateria; 
    private int saudebateria;
    private boolean ligado;

    public Celular(String marca, String modelo, double bateria, int saudebateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.saudebateria = saudebateria;
        this.ligado = false;
    }

    public void ligar() {
        if (bateria == 0) {
            System.out.println(modelo + " ZzZZzzz... (sem bateria)");
        } else {
            ligado = true;
            System.out.println(modelo + " ligado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Saúde da Bateria: " + saudebateria + "%");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("=======================");
    }

    // Simula o carregamento de 10 em 10 até chegar a 100%
    public void carregandoBateria() {
        System.out.println("Carregando " + modelo + "...");
        while (bateria < 100) {
            bateria = Math.min(bateria + 10, 100);
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Carregamento completo!");
    }

    public static void main(String[] args) {
        Celular c1 = new Celular(
            "Iphone", 
            "Iphone 14 Pro Max", 
            40.25,
            79
        );

        Celular c2 = new Celular(
            "Iphone", 
            "Iphone 15", 
            75.99,
            85
        );

        c1.ligar();
        c2.ligar();
        c1.exibirInformacoes();
        c2.exibirInformacoes();

        c1.carregandoBateria();
        c2.carregandoBateria();

        c1.exibirInformacoes();
        c2.exibirInformacoes();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////