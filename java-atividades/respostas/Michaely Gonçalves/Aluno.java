
public class Aluno {
    String nome;
    int idade;
    String curso;
    String matricula;

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matricula: " + matricula);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "Ana";
        aluno1.idade = 18;
        aluno1.curso = "ADS";
        aluno1.matricula = "001";

        aluno2.nome = "Pedro";
        aluno2.idade = 20;
        aluno2.curso = "Informatica";
        aluno2.matricula = "002";

        aluno3.nome = "Maria";
        aluno3.idade = 19;
        aluno3.curso = "Sistemas";
        aluno3.matricula = "003";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
