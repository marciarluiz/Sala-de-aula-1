public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 4, "Pastor Alemão");
        Gato gato = new Gato("Mingau", 2, "Branco");

        cachorro.exibirDados();
        cachorro.emitirSom();
        System.out.println("-----------------------------------");

        gato.exibirDados();
        gato.emitirSom();
    }
}
