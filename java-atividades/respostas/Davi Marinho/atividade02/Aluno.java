public class Aluno {
    String nome;
    int idade;
    String curso;
    String matricula;

    void exibirDados() {
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.matricula = "2026001";
        aluno1.nome = "Ana Beatriz";
        aluno1.idade = 20;
        aluno1.curso = "Ciência da Computação";

        Aluno aluno2 = new Aluno();
        aluno2.matricula = "2026002";
        aluno2.nome = "Lucas Ferreira";
        aluno2.idade = 22;
        aluno2.curso = "Engenharia de Software";

        Aluno aluno3 = new Aluno();
        aluno3.matricula = "2026003";
        aluno3.nome = "Mariana Costa";
        aluno3.idade = 19;
        aluno3.curso = "Sistemas de Informação";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
