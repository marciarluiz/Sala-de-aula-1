/**
 * Atividade 3 - Programação Orientada a Objetos (POO)
 * Classe que modela o comportamento de um automóvel.
 */
public class Carro {

    // Atributos do carro
    private String modelo;
    private String marca;
    private int ano;
    private boolean ligado;

    /**
     * Construtor para inicializar as características do veículo.
     * Por padrão, o carro é instanciado desligado.
     *
     * @param modelo Modelo do veículo
     * @param marca  Marca do fabricante
     * @param ano    Ano de fabricação
     */
    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligado = false; // Carro começa desligado
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    /**
     * Liga o carro.
     * Desafio: Impede que o carro seja ligado consecutivamente se já estiver em funcionamento.
     */
    public void ligar() {
        if (ligado) {
            System.out.printf("[AVISO] O veículo %s %s já está ligado! Não é possível ligá-lo novamente.%n", marca, modelo);
        } else {
            ligado = true;
            System.out.printf("[STATUS] O veículo %s %s foi ligado com sucesso. Motor em funcionamento.%n", marca, modelo);
        }
    }

    /**
     * Desliga o carro.
     * Verifica se o carro já está desligado antes de executar a ação.
     */
    public void desligar() {
        if (!ligado) {
            System.out.printf("[AVISO] O veículo %s %s já está desligado! Não é necessário desligar novamente.%n", marca, modelo);
        } else {
            ligado = false;
            System.out.printf("[STATUS] O veículo %s %s foi desligado.%n", marca, modelo);
        }
    }

    /**
     * Exibe os detalhes e o estado operacional atual do veículo.
     */
    public void exibirInformacoes() {
        System.out.println("----------------------------------------");
        System.out.printf("Marca : %s%n", marca);
        System.out.printf("Modelo: %s%n", modelo);
        System.out.printf("Ano   : %d%n", ano);
        System.out.printf("Estado: %s%n", (ligado ? "Ligado" : "Desligado"));
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para teste da classe Carro.
     */
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe Carro ===");

        // Criação de 2 instâncias de Carro
        Carro carro1 = new Carro("Civic", "Honda", 2022);
        Carro carro2 = new Carro("Corolla", "Toyota", 2023);

        System.out.println("\n--- Demonstração com Carro 1 ---");
        carro1.exibirInformacoes();

        System.out.println("Ligando o carro 1:");
        carro1.ligar();
        carro1.exibirInformacoes();

        System.out.println("Tentativa de ligar novamente (desafio):");
        carro1.ligar(); // Deve acionar a validação do desafio

        System.out.println("Desligando o carro 1:");
        carro1.desligar();
        carro1.exibirInformacoes();

        System.out.println("\n--- Demonstração com Carro 2 ---");
        carro2.exibirInformacoes();

        System.out.println("Tentativa de desligar com o carro já desligado:");
        carro2.desligar(); // Validação preventiva

        System.out.println("Ligando o carro 2:");
        carro2.ligar();
        carro2.exibirInformacoes();

        System.out.println("Desligando o carro 2:");
        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
