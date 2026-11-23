package Atividade1.Alunos;

public class Aluno {
    String nome;
    int idade;
    String curso;

    public void exibirDados() {
        System.out.println("\nDados do aluno\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }
}
