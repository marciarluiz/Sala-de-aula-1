/**
 * Atividade 6 — Classe Cachorro
 * Representa um cachorro com nome, raça e idade, além de comportamentos como latir e brincar.
 */
public class Cachorro {
    // Atributos privados (encapsulamento)
    private String nome;
    private String raca;
    private int idade;

    // Construtor padrão
    public Cachorro() {
        this.nome = "Sem nome";
        this.raca = "Vira-lata";
        this.idade = 0;
    }

    // Construtor com parâmetros
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Método para fazer o cachorro latir
    public void latir() {
        System.out.println(this.nome + " diz: Au au!");
    }

    // Método para simular a brincadeira do cachorro
    public void brincar() {
        System.out.println(this.nome + " está correndo atrás da bolinha todo feliz!");
    }

    // Método para exibir todos os dados do cachorro
    public void exibirDados() {
        System.out.println("----- Dados do Cachorro -----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade + " ano(s)");
        System.out.println("-----------------------------");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser negativa.");
        }
    }

    // Método principal para testes
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe Cachorro ===");

        // Criação de 3 objetos Cachorro
        Cachorro cachorro1 = new Cachorro("Rex", "Pastor Alemão", 4);
        Cachorro cachorro2 = new Cachorro("Mel", "Golden Retriever", 2);
        Cachorro cachorro3 = new Cachorro("Pipoca", "Poodle", 6);

        // Executando os métodos para cada um dos objetos
        System.out.println("\n--- Cachorro 1 ---");
        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();

        System.out.println("\n--- Cachorro 2 ---");
        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();

        System.out.println("\n--- Cachorro 3 ---");
        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();
    }
}
