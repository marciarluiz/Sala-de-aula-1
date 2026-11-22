public class Main {
    public static void main(String[] args) {

        // Primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 19;
        aluno1.curso = "ADS";
        aluno1.matricula = 2201;

        // Segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.nome = "Fernanda";
        aluno2.idade = 20;
        aluno2.curso = "Ciencias de Dados";
        aluno2.matricula = 1812;

        // Terceiro aluno
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Vinicius";
        aluno3.idade = 22;
        aluno3.curso = "Ciência da Computação";
        aluno3.matricula = 10808;

        // Exibindo os dados
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }
}
