public class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao = (media >= 7.0) ? "Aprovado" : "Reprovado";
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2);
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Situação: " + situacao);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro Henrique";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 7.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Juliana Lima";
        aluno2.nota1 = 5.5;
        aluno2.nota2 = 6.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
