/**
 * Atividade 2 - Programação Orientada a Objetos (POO)
 * Classe que representa um aluno universitário/escolar.
 */
public class Aluno {

    // Atributos do aluno
    private String nome;
    private int idade;
    private String curso;
    private String matricula; // Atributo do Desafio

    /**
     * Construtor completo para inicializar todos os dados do aluno.
     *
     * @param nome      Nome do aluno
     * @param idade     Idade do aluno
     * @param curso     Curso em que o aluno está matriculado
     * @param matricula Código de matrícula institucional (desafio)
     */
    public Aluno(String nome, int idade, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Exibe todos os dados cadastrados do aluno de forma estruturada.
     */
    public void exibirDados() {
        System.out.println("========================================");
        System.out.printf("Matrícula : %s%n", matricula);
        System.out.printf("Nome      : %s%n", nome);
        System.out.printf("Idade     : %d anos%n", idade);
        System.out.printf("Curso     : %s%n", curso);
        System.out.println("========================================");
    }

    /**
     * Método principal para teste da classe Aluno.
     */
    public static void main(String[] args) {
        System.out.println("=== Cadastro de Alunos ===");

        // Criação de 3 objetos com dados distintos
        Aluno aluno1 = new Aluno("Ana Beatriz Silva", 20, "Ciência da Computação", "CC2024-001");
        Aluno aluno2 = new Aluno("Bruno Costa Souza", 22, "Engenharia de Software", "ES2023-042");
        Aluno aluno3 = new Aluno("Carla Mendes Lima", 19, "Sistemas de Informação", "SI2024-118");

        // Exibição dos dados de cada aluno
        System.out.println("\n--- Aluno 1 ---");
        aluno1.exibirDados();

        System.out.println("\n--- Aluno 2 ---");
        aluno2.exibirDados();

        System.out.println("\n--- Aluno 3 ---");
        aluno3.exibirDados();
    }
}
