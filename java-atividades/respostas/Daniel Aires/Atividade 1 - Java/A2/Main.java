public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ana Souza");
        aluno1.setIdade(19);
        aluno1.setCurso("Ciência da Computação");
        aluno1.setMatricula("2025001");

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Carlos Lima");
        aluno2.setIdade(22);
        aluno2.setCurso("Engenharia Civil");
        aluno2.setMatricula("2025002");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Beatriz Alves");
        aluno3.setIdade(20);
        aluno3.setCurso("Administração");
        aluno3.setMatricula("2025003");

        System.out.println("=== Cadastro de Alunos ===");
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}