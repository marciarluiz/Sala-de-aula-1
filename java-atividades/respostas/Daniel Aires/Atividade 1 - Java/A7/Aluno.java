public class Aluno {

    // Atributos
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor padrão
    public Aluno() {
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota 1 inválida (use de 0 a 10).");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota 2 inválida (use de 0 a 10).");
        }
    }

    // Métodos
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirResultado() {
        double media = calcularMedia();
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println("Aluno: " + nome);
        System.out.printf("Média: %.1f%n", media);
        System.out.println("Situação: " + situacao);
        System.out.println("-----------------------------");
    }
}