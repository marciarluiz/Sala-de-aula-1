public class Aluno {

    String nome;
    int idade;
    String curso;
    String matricula; 

    
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        // Aluno 1
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana Luiza";
        aluno1.idade = 19;
        aluno1.curso = "ADS";
        aluno1.matricula = "123";

        
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Marianna Soares";
        aluno2.idade = 20;
        aluno2.curso = "Farmacia";
        aluno2.matricula = "456";

        
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Maria Joana";
        aluno3.idade = 22;
        aluno3.curso = "Geografia";
        aluno3.matricula = "789";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
