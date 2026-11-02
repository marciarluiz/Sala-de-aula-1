public class MainAluno {
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno();
       aluno1.nome = "Anna";

       aluno1.curso = "enfermagem";

       aluno1.idade = 19;

       aluno1.matricula = "12";

       aluno1.exibirDados();
       Aluno aluno2 = new Aluno();
       aluno2.nome = "Ilan";

       aluno2.curso = "Analise e desenvolvimento de sistemas";

       aluno2.idade = 18;

       aluno2.matricula = "124555";

       aluno2.exibirDados();
       Aluno aluno3 = new Aluno();

       aluno3.nome = "Lourdes";

       aluno3.curso = "nutrição";

       aluno3.idade = 19;

       aluno3.matricula = "12688";
       
       aluno3.exibirDados();
    }
    
}
