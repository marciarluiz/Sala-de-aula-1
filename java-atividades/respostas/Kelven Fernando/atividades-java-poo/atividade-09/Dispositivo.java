public class Dispositivo {
    private String marca;
    private boolean ligado;

    public Dispositivo(String marca, boolean ligado) {
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() { return marca; }

    public boolean isLigado() { return ligado; }

    public void ligar() {
        ligado = true;
        System.out.println("Ligando dispositivo da marca " + marca + "...");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Dispositivo da marca " + marca + " desligado.");
    }

    public void exibirEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
    }
}
