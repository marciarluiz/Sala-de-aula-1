package Atividade1.Notas;

public class Main {
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Arthur";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 4.2;
        aluno1.calcularMedia();
        aluno1.exibirResultado();

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Lirilly";
        aluno2.nota1 = 10;
        aluno2.nota2 = 8.7;
        aluno2.calcularMedia();
        aluno2.exibirResultado();
    }
}
