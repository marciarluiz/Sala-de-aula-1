public class Aluno {

    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
        System.out.println("========================");
    }

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
