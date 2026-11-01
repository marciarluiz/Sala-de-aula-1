public class atividade2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        aluno1.nome = "João";
        aluno1.idade = 22;
        aluno1.curso = "ADS - Analise e desenvolvimento de sistema";
        aluno1.matricula = 20260000 + (int)(Math.random() * 10000);

        aluno2.nome = "Emily";
        aluno2.idade = 19;
        aluno2.curso = "Farmacia";
        aluno2.matricula = 20260000 + (int)(Math.random() * 10000);

        aluno3.nome = "Sabrina";
        aluno3.idade = 25;
        aluno3.curso = "Historia";
        aluno3.matricula = 20260000 + (int)(Math.random() * 10000);

        aluno1.exibirDados();
        System.out.println("--//--//--//--//--//--//--//--//--//--//--//--// ");
        aluno2.exibirDados();
        System.out.println("--//--//--//--//--//--//--//--//--//--//--//--// ");
        aluno3.exibirDados();

    }

}

class Aluno{
    String nome;
    int idade;
    String curso;
    int matricula;

    void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matricula: " + matricula);
    }
}



