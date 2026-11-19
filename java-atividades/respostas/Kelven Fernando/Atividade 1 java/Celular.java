/**
 * Atividade 5 — Classe Celular
 * Representa um aparelho celular com marca, modelo e nível de bateria.
 */
public class Celular {
    // Atributos privados (encapsulamento)
    private String marca;
    private String modelo;
    private int bateria; // percentual de 0 a 100

    // Construtor padrão
    public Celular() {
        this.marca = "Desconhecida";
        this.modelo = "Padrão";
        this.bateria = 100;
    }

    // Construtor com parâmetros
    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        setBateria(bateria); // Valida o valor da bateria entre 0 e 100
    }

    // Método para simular a realização de uma ligação
    public void ligar() {
        if (this.bateria > 0) {
            System.out.println("Realizando ligação a partir do " + this.modelo + "...");
            this.bateria = Math.max(0, this.bateria - 1); // Consome 1% de bateria
        } else {
            System.out.println("Não é possível realizar a ligação: bateria esgotada!");
        }
    }

    // Método para exibir as informações do celular
    public void exibirInformacoes() {
        System.out.println("----- Informações do Celular -----");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Nível de Bateria: " + this.bateria + "%");
        System.out.println("----------------------------------");
    }

    // Método para carregar a bateria (aumenta a bateria até o limite de 100%)
    public void carregarBateria(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade de carga inválida.");
            return;
        }
        this.bateria = Math.min(100, this.bateria + quantidade);
        System.out.println("Bateria carregada em +" + quantidade + "%. Nível atual: " + this.bateria + "%");
    }

    // Sobrecarga para recarga completa
    public void carregarBateria() {
        this.bateria = 100;
        System.out.println("Bateria totalmente carregada (100%).");
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria < 0) {
            this.bateria = 0;
        } else if (bateria > 100) {
            this.bateria = 100;
        } else {
            this.bateria = bateria;
        }
    }

    // Método principal para testes
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe Celular ===");

        // Criação de 2 objetos Celular
        Celular celular1 = new Celular("Samsung", "Galaxy S23", 25);
        Celular celular2 = new Celular("Apple", "iPhone 15", 5);

        // Exibição das informações iniciais
        System.out.println("\n--- Informações Iniciais ---");
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        // Testando realização de ligações
        System.out.println("\n--- Testando Ligações ---");
        celular1.ligar();
        celular2.ligar();

        // Simulando carregamento de bateria
        System.out.println("\n--- Simulando Carregamento ---");
        System.out.println("Carregando Celular 1:");
        celular1.carregarBateria(40);

        System.out.println("\nCarregando Celular 2:");
        celular2.carregarBateria(100); // Testando limite máximo de 100%

        // Exibindo informações finais após o carregamento
        System.out.println("\n--- Informações Finais ---");
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();
    }
}
