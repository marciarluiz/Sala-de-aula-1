public class Celular {
    private String marca;
    private String modelo;
    private int bateria; // 0 a 100
    private boolean ligado;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void ligar() {
        ligado = true;
        System.out.println(marca + " " + modelo + " ligado.");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo
                + " | Bateria: " + bateria + "% | " + (ligado ? "ligado" : "desligado"));
    }

    public void carregarBateria() {
        System.out.println("Carregando " + modelo + "...");
        while (bateria < 100) {
            bateria = Math.min(100, bateria + 20);
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Bateria completa!");
    }

    public static void main(String[] args) {
        Celular c1 = new Celular("Samsung", "Galaxy S23", 35);
        Celular c2 = new Celular("Apple", "iPhone 14", 60);

        c1.ligar();
        c1.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();

        c1.carregarBateria();
        c2.carregarBateria();

        c1.exibirInformacoes();
        c2.exibirInformacoes();
    }
}
