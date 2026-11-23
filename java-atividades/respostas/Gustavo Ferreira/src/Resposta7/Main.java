package Resposta7;

public class Main {
   void main(String[] args) { 
    Aluno aluno1 = new Aluno("Gustavo" , 7, 8);
    aluno1.calcularMedia();
    aluno1.exibirResultado();
    
    System.out.println();

    Aluno aluno2 = new Aluno("João" , 7, 10);
    aluno2.calcularMedia();
    aluno2.exibirResultado();
   }
}
