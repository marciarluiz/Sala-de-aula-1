public class aluno {

    String nome;
    double nota1;
    double nota2;

    public double calcularmedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirresultado() {
        double media = calcularmedia();

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);

        if (media >= 7) {
            System.out.println("Situacao: Aprovado");
        } else {
            System.out.println("Situacao: Reprovado");
        }

        System.out.println("--------------------");
    }
}