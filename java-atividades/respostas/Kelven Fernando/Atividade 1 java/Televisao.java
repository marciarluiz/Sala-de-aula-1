/**
 * Atividade 11 - Programação Orientada a Objetos (POO)
 * Classe que simula o funcionamento de uma Televisão com controle de volume e canais.
 */
public class Televisao {

    // Constantes de limites de volume
    public static final int VOLUME_MIN = 0;
    public static final int VOLUME_MAX = 100;

    // Atributos
    private String marca;
    private int volume;
    private int canal;

    /**
     * Construtor padrão com valores iniciais seguros.
     */
    public Televisao() {
        this.marca = "Genérica";
        this.volume = 15;
        this.canal = 1;
    }

    /**
     * Construtor com especificação da marca.
     *
     * @param marca Marca da televisão
     */
    public Televisao(String marca) {
        this.marca = marca;
        this.volume = 15;
        this.canal = 1;
    }

    /**
     * Construtor completo.
     *
     * @param marca  Marca da televisão
     * @param volume Volume inicial (entre 0 e 100)
     * @param canal  Canal inicial (maior que 0)
     */
    public Televisao(String marca, int volume, int canal) {
        this.marca = marca;
        // Validação do volume inicial
        if (volume < VOLUME_MIN) {
            this.volume = VOLUME_MIN;
        } else if (volume > VOLUME_MAX) {
            this.volume = VOLUME_MAX;
        } else {
            this.volume = volume;
        }
        this.canal = canal > 0 ? canal : 1;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    /**
     * Aumenta o volume da TV em 1 unidade, respeitando o limite máximo de 100.
     */
    public void aumentarVolume() {
        if (this.volume < VOLUME_MAX) {
            this.volume++;
            System.out.printf("[%s] Volume aumentado para: %d%n", marca, this.volume);
        } else {
            System.out.printf("[%s] Volume já está no máximo (%d)!%n", marca, VOLUME_MAX);
        }
    }

    /**
     * Diminui o volume da TV em 1 unidade, respeitando o limite mínimo de 0.
     */
    public void diminuirVolume() {
        if (this.volume > VOLUME_MIN) {
            this.volume--;
            System.out.printf("[%s] Volume diminuído para: %d%n", marca, this.volume);
        } else {
            System.out.printf("[%s] Volume já está no mínimo (%d / Mudo)!%n", marca, VOLUME_MIN);
        }
    }

    /**
     * Muda o canal da TV para o canal informado.
     *
     * @param novoCanal Número do novo canal (deve ser maior que zero)
     */
    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0) {
            this.canal = novoCanal;
            System.out.printf("[%s] Canal alterado para: %d%n", marca, this.canal);
        } else {
            System.out.printf("[%s] Canal inválido: %d. O canal deve ser maior que zero!%n", marca, novoCanal);
        }
    }

    /**
     * Exibe o estado atual da televisão.
     */
    public void exibirInformacoes() {
        System.out.println("----------------------------------------");
        System.out.printf("Televisão Marca : %s%n", marca);
        System.out.printf("Canal Atual     : %d%n", canal);
        System.out.printf("Volume Atual    : %d / %d%n", volume, VOLUME_MAX);
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para simulação da classe Televisao.
     */
    public static void main(String[] args) {
        System.out.println("=== Atividade 11: Demonstração da Classe Televisao ===\n");

        // Criação do objeto Televisão
        Televisao tv = new Televisao("LG OLED 55\"", 98, 4);

        System.out.println("--- Estado Inicial ---");
        tv.exibirInformacoes();

        // Simulação de alteração de canal
        System.out.println("\n--- Mudança de Canal ---");
        tv.mudarCanal(7);
        tv.mudarCanal(12);
        tv.mudarCanal(-1); // Tentativa de canal inválido

        // Simulação de aumento de volume até o limite máximo
        System.out.println("\n--- Aumentando Volume (testando limite máximo de 100) ---");
        tv.aumentarVolume(); // 99
        tv.aumentarVolume(); // 100
        tv.aumentarVolume(); // Tentativa além do limite máximo

        // Simulação de diminuição de volume
        System.out.println("\n--- Diminuindo Volume ---");
        tv.diminuirVolume(); // 99
        tv.diminuirVolume(); // 98

        // Teste de TV no limite mínimo (volume 0)
        System.out.println("\n--- Teste de Limite Mínimo (Volume 0) ---");
        Televisao tvQuarto = new Televisao("Samsung", 1, 10);
        tvQuarto.diminuirVolume(); // 0
        tvQuarto.diminuirVolume(); // Tentativa abaixo de 0

        System.out.println("\n--- Estado Final da TV Principal ---");
        tv.exibirInformacoes();
    }
}
