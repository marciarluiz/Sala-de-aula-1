public class AlunosNotas {
    //atributos//
    String nome;
    double n1;
    double n2 ;
double calcularMedia() {
    return (n1 + n2) / 2;
}
void exibirResultado() {
    if ( calcularMedia() > 7 ) {
        System.out.println( "Aprovado!!, " + nome + " Sua média geral foi de " + calcularMedia());
    }else if( calcularMedia() >= 4 && calcularMedia() < 7 ) {
        System.out.println( "Recuperação!!, " + nome + " Sua média geral foi de " + calcularMedia());
    }else{
        System.out.println( "Reprovado!!, " + nome + " Sua média geral foi de " + calcularMedia());
    }

}
}
