public class Aluno {

    String nome;
    double nota1;
    double nota2;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao = (media >= 7.0) ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + String.format("%.1f", media));
        System.out.println("Situação: " + situacao);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas Samuel", 8.0, 9.5);
        Aluno aluno2 = new Aluno("Maria Silva", 5.0, 6.5);

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
