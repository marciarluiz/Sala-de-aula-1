
public class Alunos {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);

        if (media >= 7.0) {
            System.out.println("Situacao: Aprovado");
        } else {
            System.out.println("Situacao: Reprovado");
        }
    }

    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        Alunos aluno2 = new Alunos();

        aluno1.nome = "Ana";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 9.0;

        aluno2.nome = "Pedro";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
