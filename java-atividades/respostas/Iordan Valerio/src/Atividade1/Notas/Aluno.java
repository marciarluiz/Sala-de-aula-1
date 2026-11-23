package Atividade1.Notas;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    public void calcularMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
    }

    public void exibirResultado(){
        System.out.println("Nome: " + nome);
        System.out.println("Media: " + media);
        if (media > 7){
            System.out.println("Situação: Aprovado(a)");
        }else{
            System.out.println("Situação: Reprovado(a)");
        }
    }
}
