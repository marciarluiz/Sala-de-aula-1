public class mainaluno {

    public static void main(String[] args) {

        aluno aluno1 = new aluno();
        aluno aluno2 = new aluno();
        aluno aluno3 = new aluno();

        aluno1.nome = "Ana";
        aluno1.idade = 20;
        aluno1.curso = "ADS";
        aluno1.matricula = "2026001";

        aluno2.nome = "Carlos";
        aluno2.idade = 22;
        aluno2.curso = "ADS";
        aluno2.matricula = "2026002";

        aluno3.nome = "Mariana";
        aluno3.idade = 19;
        aluno3.curso = "Sistemas de Informacao";
        aluno3.matricula = "2026003";

        aluno1.exibirdados();
        aluno2.exibirdados();
        aluno3.exibirdados();
    }
}