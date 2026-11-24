public class Dispositivo {
    private String marca;
    private boolean ligado;

    public Dispositivo(String marca, boolean ligado) {
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public boolean isLigado() { return ligado; }
    protected void setLigado(boolean ligado) { this.ligado = ligado; }

    public void ligar() {
        ligado = true;
        System.out.println("Dispositivo ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Dispositivo desligado");
    }

    public void exibirEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Estado: " + (ligado ? "ligado" : "desligado"));
    }
}
