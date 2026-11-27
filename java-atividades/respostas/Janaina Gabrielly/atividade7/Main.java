public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 7.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.5;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
