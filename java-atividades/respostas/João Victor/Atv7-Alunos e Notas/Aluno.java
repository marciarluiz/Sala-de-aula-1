public class Aluno {

    // Atributos
    String nome;
    double nota1;
    double nota2;

    // Método para calcular a média
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para exibir o resultado
    public void exibirResultado() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + calcularMedia());

        if (calcularMedia() >= 7.0) {
            System.out.println("Situação: Aprovado!");
        } else {
            System.out.println("Situação: Reprovado!");
        }

        System.out.println("-------------------------");
    }
}

