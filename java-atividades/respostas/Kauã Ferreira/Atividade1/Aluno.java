/**
 * ATIVIDADE 2 - CADASTRO DE ALUNO (COM DESAFIO DA MATRICULO)
 */



public class Aluno {
    //Atributos
    String nome;
    int idade;
    String curso;
    String matricula;

    //Exibe todos os dados do aluno
    void exibirDados(){
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Curso: " + curso + " | Matricula: " + matricula);
    }
    public static void main(String[] args){
        //Três objetos, cada um com informação diferentes
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.idade = 19;
        a1.curso = "Analise e desenvolvimento de sistema";
        a1.matricula = "2026001"; 

        Aluno a2 = new Aluno();
        a2.nome = "Kauã";
        a2.idade = 18;
        a2.curso = "Analise e desenvolvimento de sistema";
        a2.matricula = "2026002"; 

        Aluno a3 = new Aluno();
        a3.nome = "Enzo";
        a3.idade = 20;
        a3.curso = "Analise e desenvolvimento de sistema";
        a3.matricula = "2026003"; 

        a1.exibirDados();
        a2.exibirDados();
        a3.exibirDados();
    }
}
