public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private String matricula; // desafio

    public Aluno(String nome, int idade, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 19, "Análise e Desenvolvimento de Sistemas", "2026001");
        Aluno a2 = new Aluno("Bruno", 21, "Engenharia de Computação", "2026002");
        Aluno a3 = new Aluno("Carla", 20, "Ciência da Computação", "2026003");

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();
    }
}
