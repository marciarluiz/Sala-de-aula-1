/**
 * ATIVIDADE 7 - ALUNOS NOTAS
 * Alunonotas
 */

public class Alunonotas {
    //Atributos
    String nome;
    double nota1;
    double nota2;

    //Média aritmética das duas notas
    double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
    //Mostra nome, média e sintuação (aprovado se média >= 7,0)
    void exibirResultado(){
        double media = calcularMedia();
        String sintuacao = (media >= 7.0) ? "Aprovado" : "Reprovado";
        System.out.println("Aluno: " + nome + " | Média: " + String.format("%.1f", media) + " | Sintuação: " + sintuacao);
    }
    public static void main(String[] args){
        Alunonotas a1 = new Alunonotas();
        a1.nome = "Lucas";
        a1.nota1 = 9.0;
        a1.nota2 = 8.0;

        Alunonotas a2 = new Alunonotas();
        a2.nome = "José";
        a2.nota1 = 3.0;
        a2.nota2 = 6.0;
        
        a1.exibirResultado();
        a2.exibirResultado();



    }
}
