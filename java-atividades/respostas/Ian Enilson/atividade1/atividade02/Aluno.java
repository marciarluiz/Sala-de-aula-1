///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private String matricula;

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
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ian Enilson", 22, "Análise e Desenvolvimento de Sistemas", "2026001");
        Aluno aluno2 = new Aluno("Leonardo Euler", 21, "Ciência da Computação", "2026002");
        Aluno aluno3 = new Aluno("João Batista", 20, "Engenharia de Software", "2026003");

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////