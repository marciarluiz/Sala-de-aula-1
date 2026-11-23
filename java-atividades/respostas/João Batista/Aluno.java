public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private String matricula;
    private String instituição;

    public Aluno(String nome, int idade, String curso, String matricula, String instituição) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matricula = matricula;
        this.instituição = instituição;
    }


    public void exibirDados() {
        System.out.println("Nome Completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Instituição: " + instituição);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(
        "João Batista", 
        21, 
        "Análise e Desenvolvimento de Sistemas", 
        "2026106520058",
        "Universidade Estadual da Paraíba"
    );
        
        Aluno aluno2 = new Aluno(
        "David Fellipe", 
        20, 
        "Sistemas de Informação", 
        "202610135FCS",
        "Unifacisa"
    );

        Aluno aluno3 = new Aluno(
        "Pedro Luis", 
        25, 
        "Engenharia Quimica", 
        "2026106520060",
        "Universidade Federal de Campina Grande"
    );

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
