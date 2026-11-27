public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.idade = 19;
        aluno1.curso = "ADS";
        aluno1.matricula = "2026001";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Joao";
        aluno2.idade = 22;
        aluno2.curso = "Ciencia da Computacao";
        aluno2.matricula = "2026002";

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Ana";
        aluno3.idade = 20;
        aluno3.curso = "Sistemas de Informacao";
        aluno3.matricula = "2026003";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
