public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirResultado() {
        double media = calcularMedia();
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.printf("Aluno: %s | Média: %.1f | Situação: %s%n", nome, media, situacao);
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 8.5, 7.0);
        Aluno a2 = new Aluno("Bruno", 5.0, 6.5);

        a1.exibirResultado();
        a2.exibirResultado();
    }
}
