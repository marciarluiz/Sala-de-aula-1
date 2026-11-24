public class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());

        if (calcularMedia() >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 8;
        aluno1.nota2 = 9;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.nota1 = 5;
        aluno2.nota2 = 6;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}