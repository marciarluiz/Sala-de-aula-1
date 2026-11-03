public class Lampada {

    // Atributos
    private String cor;
    private int potencia; // em watts
    private boolean ligada;

    // Construtor padrão (a lâmpada começa desligada)
    public Lampada() {
        this.ligada = false;
    }

    // Getters e setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        } else {
            System.out.println("Potência inválida.");
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    // Métodos
    public void ligar() {
        if (ligada) {
            System.out.println("Lâmpada " + cor + ": já está ligada.");
        } else {
            ligada = true;
            System.out.println("Lâmpada " + cor + ": ligada.");
        }
    }

    public void desligar() {
        if (!ligada) {
            System.out.println("Lâmpada " + cor + ": já está desligada.");
        } else {
            ligada = false;
            System.out.println("Lâmpada " + cor + ": desligada.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Estado: " + (ligada ? "Ligada" : "Desligada"));
        System.out.println("-----------------------------");
    }
}