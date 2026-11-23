public class MainEstudante {

    public static void main(String[] args) {
        Estudante a1 = new Estudante();
        a1.nome = "Ana";
        a1.nota1 = 8.0;
        a1.nota2 = 7.5;

        Estudante a2 = new Estudante();
        a2.nome = "Bruno";
        a2.nota1 = 5.0;
        a2.nota2 = 6.0;

        a1.exibirResultado();
        a2.exibirResultado();

    }
}