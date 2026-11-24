// Atividade 02
public class Aluno {
    String nome;
    int idade;
    String curso;

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println();
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.idade = 20;
        aluno1.curso = "Informática";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Kauan";
        aluno2.idade = 19;
        aluno2.curso = "ADS";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "João";
        aluno3.idade = 19;
        aluno3.curso = "Matemática";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
