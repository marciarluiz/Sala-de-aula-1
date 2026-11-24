public class Aluno {

    // Dados do aluno
    String nome;
    int idade;
    String curso;
    int matricula;

    // Mostra os dados do aluno
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matricula: " + matricula);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        // Cria o primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Adrielly";
        aluno1.idade = 20;
        aluno1.curso = "ADS";
        aluno1.matricula = 101;

        // Cria o segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 21;
        aluno2.curso = "Computacao";
        aluno2.matricula = 102;

        // Cria o terceiro aluno
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Joao";
        aluno3.idade = 19;
        aluno3.curso = "ADS";
        aluno3.matricula = 103;

        // Mostra os dados dos alunos
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
