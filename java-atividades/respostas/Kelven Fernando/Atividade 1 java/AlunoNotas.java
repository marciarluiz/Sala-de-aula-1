/**
 * Atividade 7 — Classe AlunoNotas
 * Representa um aluno com suas respectivas notas, calculando a média e indicando aprovação.
 */
public class AlunoNotas {
    // Atributos privados (encapsulamento)
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor padrão
    public AlunoNotas() {
        this.nome = "Sem nome";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    // Construtor com parâmetros
    public AlunoNotas(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média aritmética das duas notas
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2.0;
    }

    // Método para exibir o nome, a média e a situação (Aprovado ou Reprovado)
    public void exibirResultado() {
        double media = calcularMedia();
        String situacao = (media >= 7.0) ? "Aprovado" : "Reprovado";

        System.out.println("----- Resultado do Aluno -----");
        System.out.println("Nome: " + this.nome);
        System.out.printf("Nota 1: %.1f%n", this.nota1);
        System.out.printf("Nota 2: %.1f%n", this.nota2);
        System.out.printf("Média: %.2f%n", media);
        System.out.println("Situação: " + situacao);
        System.out.println("------------------------------");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Método principal para testes
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe AlunoNotas ===");

        // Criação de 2 objetos AlunoNotas
        AlunoNotas aluno1 = new AlunoNotas("Mariana Silva", 8.5, 7.5);
        AlunoNotas aluno2 = new AlunoNotas("Carlos Souza", 5.0, 6.0);

        // Exibição dos resultados de cada aluno
        System.out.println("\n--- Aluno 1 ---");
        aluno1.exibirResultado();

        System.out.println("\n--- Aluno 2 ---");
        aluno2.exibirResultado();
    }
}
