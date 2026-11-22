public class Main {
    public static void main(String[] args) {

        // Primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 9.0;

        // Segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Fernanda";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        // Exibindo os resultados
        System.out.println("RESULTADO DOS ALUNOS");

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
