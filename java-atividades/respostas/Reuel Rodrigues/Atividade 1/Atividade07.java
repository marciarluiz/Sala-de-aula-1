class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.printf("Aluno: %s | Média: %.1f | Situação: %s%n", nome, media, situacao);
    }
}

public class Atividade07 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Lucas";
        a1.nota1 = 8.0;
        a1.nota2 = 7.5;

        Aluno a2 = new Aluno();
        a2.nome = "Julia";
        a2.nota1 = 5.0;
        a2.nota2 = 6.0;

        a1.exibirResultado();
        a2.exibirResultado();
    }
}