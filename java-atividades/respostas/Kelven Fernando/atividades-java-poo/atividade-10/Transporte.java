public class Transporte {
    private String modelo;
    private int capacidadePassageiros;

    public Transporte(String modelo, int capacidadePassageiros) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getModelo() { return modelo; }

    public int getCapacidadePassageiros() { return capacidadePassageiros; }

    public void mover() {
        System.out.println("Transporte em movimento");
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade: " + capacidadePassageiros + " passageiro(s)");
    }
}
