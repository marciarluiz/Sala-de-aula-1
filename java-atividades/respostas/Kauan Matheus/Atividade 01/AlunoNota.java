// Atividade 07
public class AlunoNota {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        AlunoNota aluno1 = new AlunoNota();
        aluno1.nome = "Ana";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 9.0;

        AlunoNota aluno2 = new AlunoNota();
        aluno2.nome = "Kauan";
        aluno2.nota1 = 6.0;
        aluno2.nota2 = 5.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
