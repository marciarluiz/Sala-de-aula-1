public class Estudante {

    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao;

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Aluno: " + nome + " | Média: " + media + " | Situação: " + situacao);

    }
}