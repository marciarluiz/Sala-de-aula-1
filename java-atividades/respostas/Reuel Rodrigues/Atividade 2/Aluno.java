public class Aluno {

    String nome;
    int idade;
    String curso;
    String matricula;
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana Souza";
        aluno1.idade = 19;
        aluno1.curso = "Engenharia de Software";
        aluno1.matricula = "2025001";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Carlos Lima";
        aluno2.idade = 22;
        aluno2.curso = "Ciência da Computação";
        aluno2.matricula = "2025002";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Beatriz Costa";
        aluno3.idade = 20;
        aluno3.curso = "Sistemas de Informação";
        aluno3.matricula = "2025003";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}