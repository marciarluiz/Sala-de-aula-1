package Atividade1.Alunos;

public class Main {
    
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Iordan";
        aluno1.idade = 19;
        aluno1.curso = "Análise e Desenvolvimento de Sistemas";
        aluno1.exibirDados();

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Pamella";
        aluno2.idade = 20;
        aluno2.curso = "Administração";
        aluno2.exibirDados();


        Aluno aluno3 = new Aluno();

        aluno3.nome = "Alan";
        aluno3.idade = 19;
        aluno3.curso = "Matemática";
        aluno3.exibirDados();

    }
}
