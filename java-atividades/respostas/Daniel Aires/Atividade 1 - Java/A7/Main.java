public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ana Souza");
        aluno1.setNota1(8.5);
        aluno1.setNota2(7.0);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Carlos Lima");
        aluno2.setNota1(5.0);
        aluno2.setNota2(6.5);

        System.out.println("=== Resultado dos alunos ===");
        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}