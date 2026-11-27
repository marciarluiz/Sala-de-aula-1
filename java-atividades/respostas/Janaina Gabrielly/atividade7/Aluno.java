public class Aluno {
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
        System.out.println();
    }
}
