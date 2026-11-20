class Aluno {
    String nome;
    int idade;
    String curso;
    String matricula;

    void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade
                + " | Curso: " + curso + " | Matrícula: " + matricula);
    }
}

public class Atividade02 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.idade = 20;
        a1.curso = "Engenharia";
        a1.matricula = "2024001";

        Aluno a2 = new Aluno();
        a2.nome = "Bruno";
        a2.idade = 22;
        a2.curso = "Medicina";
        a2.matricula = "2024002";

        Aluno a3 = new Aluno();
        a3.nome = "Carla";
        a3.idade = 19;
        a3.curso = "Direito";
        a3.matricula = "2024003";

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();
    }
}