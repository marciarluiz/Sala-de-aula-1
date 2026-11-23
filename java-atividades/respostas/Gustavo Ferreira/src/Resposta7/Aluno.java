package Resposta7;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;
    String situacao;

    void calcularMedia() {
        media = (nota1 + nota2)/2;
    }

    void exibirResultado() {
        if (media < 7) {
            situacao = "reprovado";
        } else if (media >= 7) {
            situacao = "aprovado";
        };

        System.out.println("Aluno(a): " + nome);
        System.out.println("Nota 1 = " + nota1);
        System.out.println("Nota 2 = " + nota2);
        System.out.println("Media = " + media);
        System.out.println("Situação: " + situacao);

    }

    public Aluno(String nome, double nota1 , double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

}
