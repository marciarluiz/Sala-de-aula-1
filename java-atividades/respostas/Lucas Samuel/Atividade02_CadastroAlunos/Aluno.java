public class Aluno {

    String nome;
    int idade;
    String curso;
    String matricula; // desafio

    Aluno(String nome, int idade, String curso, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas Samuel", 20, "Sistemas de Informação", "2024001");
        Aluno aluno2 = new Aluno("Maria Silva", 19, "Engenharia de Software", "2024002");
        Aluno aluno3 = new Aluno("João Pereira", 22, "Ciência da Computação", "2024003");

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
