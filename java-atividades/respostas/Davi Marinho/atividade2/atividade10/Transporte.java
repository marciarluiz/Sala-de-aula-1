public class Transporte {
    private String modelo;
    private int capacidadePassageiros;

    public Transporte(String modelo, int capacidadePassageiros) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public void mover() {
        System.out.println("Transporte em movimento");
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + " | Capacidade: " + capacidadePassageiros + " passageiro(s)");
    }
}
