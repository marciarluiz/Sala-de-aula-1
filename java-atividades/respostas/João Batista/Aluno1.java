public class Aluno1 {

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno1(String nome, double nota1, double nota2) {
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

        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + String.format("%.1f", media));
        System.out.println("Situação: " + situacao);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Aluno1 aluno1 = new Aluno1(
            "Ian", 
            9.0, 
            9.5);

        Aluno1 aluno2 = new Aluno1(
            "João Batista", 
            5.0, 
            6.0);


        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
