public class mainaluno {

    public static void main(String[] args) {

        aluno aluno1 = new aluno();
        aluno aluno2 = new aluno();

        aluno1.nome = "Joao";
        aluno1.nota1 = 8;
        aluno1.nota2 = 9;

        aluno2.nome = "Pedro";
        aluno2.nota1 = 5;
        aluno2.nota2 = 6;

        aluno1.exibirresultado();
        aluno2.exibirresultado();
    }
}