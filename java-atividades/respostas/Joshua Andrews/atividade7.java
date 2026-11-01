
public class atividade7 {
    public static void main(String[] args) {
        AlunoM aluno1 = new AlunoM();
        AlunoM aluno2 = new AlunoM();

        aluno1.nome = "João";
        aluno1.nota1 = 7;
        aluno1.nota2 = 2;

        aluno2.nome = "Maria";
        aluno2.nota1 = 9;
        aluno2.nota2 = 7;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}

class AlunoM {
    String nome;
    float nota1;
    float nota2;

    float calcularMedia() {
        float media = (nota1 + nota2) / 2;
        return media;
    }

    void exibirResultado() {
        float media = calcularMedia();
        System.out.println("A media do aluno: " + nome + " é: " + media);
    }
}
