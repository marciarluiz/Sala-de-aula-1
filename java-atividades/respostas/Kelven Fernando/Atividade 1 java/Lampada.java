/**
 * Atividade 8 — Classe Lampada
 * Representa uma lâmpada com cor, potência e estado de acendimento.
 */
public class Lampada {
    // Atributos privados (encapsulamento)
    private String cor;
    private int potencia; // potência em Watts
    private boolean ligada;

    // Construtor padrão
    public Lampada() {
        this.cor = "Branca";
        this.potencia = 60;
        this.ligada = false;
    }

    // Construtor com parâmetros
    public Lampada(String cor, int potencia, boolean ligada) {
        this.cor = cor;
        this.potencia = potencia;
        this.ligada = ligada;
    }

    // Método para ligar a lâmpada
    public void ligar() {
        if (!this.ligada) {
            this.ligada = true;
            System.out.println("A lâmpada foi ligada.");
        } else {
            System.out.println("A lâmpada já estava ligada.");
        }
    }

    // Método para desligar a lâmpada
    public void desligar() {
        if (this.ligada) {
            this.ligada = false;
            System.out.println("A lâmpada foi desligada.");
        } else {
            System.out.println("A lâmpada já estava desligada.");
        }
    }

    // Método para exibir o estado e características da lâmpada
    public void mostrarEstado() {
        System.out.println("----- Estado da Lâmpada -----");
        System.out.println("Cor: " + this.cor);
        System.out.println("Potência: " + this.potencia + "W");
        System.out.println("Estado: " + (this.ligada ? "Ligada (acesa)" : "Desligada (apagada)"));
        System.out.println("-----------------------------");
    }

    // Getters e Setters
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
        this.potencia = potencia;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    // Método principal para testes
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe Lampada ===");

        // Criação de 2 lâmpadas: uma ligada e outra desligada
        Lampada lampada1 = new Lampada("Amarela", 100, true);
        Lampada lampada2 = new Lampada("Branca Neutra", 60, false);

        // Exibindo estados iniciais
        System.out.println("\n--- Estados Iniciais ---");
        System.out.println("Lâmpada 1:");
        lampada1.mostrarEstado();

        System.out.println("Lâmpada 2:");
        lampada2.mostrarEstado();

        // Demonstração da alteração de estados
        System.out.println("\n--- Alterando Estados ---");
        System.out.println("Desligando Lâmpada 1:");
        lampada1.desligar();

        System.out.println("\nLigando Lâmpada 2:");
        lampada2.ligar();

        // Exibindo estados atualizados
        System.out.println("\n--- Estados Atualizados ---");
        System.out.println("Lâmpada 1:");
        lampada1.mostrarEstado();

        System.out.println("Lâmpada 2:");
        lampada2.mostrarEstado();
    }
}
