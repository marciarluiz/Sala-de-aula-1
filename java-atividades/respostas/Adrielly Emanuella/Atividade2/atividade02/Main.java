public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Labrador");
        Gato gato = new Gato("Mimi", 3, "Branca");

        cachorro.exibirDados();
        System.out.print("Som: ");
        cachorro.emitirSom();

        System.out.println();

        gato.exibirDados();
        System.out.print("Som: ");
        gato.emitirSom();
    }
}
