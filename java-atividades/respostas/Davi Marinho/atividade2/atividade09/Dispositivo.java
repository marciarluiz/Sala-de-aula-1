public class Dispositivo {
    private String marca;
    private boolean ligado;

    public Dispositivo(String marca, boolean ligado) {
        this.marca = marca;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Dispositivo " + marca + " ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Dispositivo " + marca + " desligado.");
    }

    public void exibirEstado() {
        String estado = ligado ? "Ligado" : "Desligado";
        System.out.println("Marca: " + marca + " | Estado: " + estado);
    }
}
