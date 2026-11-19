public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 4, "Labrador");
        Gato gato = new Gato("Mimi", 2, "Cinza");

        System.out.println("=== Cachorro ===");
        cachorro.exibirDados();
        System.out.print("Som: ");
        cachorro.emitirSom();

        System.out.println();
        System.out.println("=== Gato ===");
        gato.exibirDados();
        System.out.print("Som: ");
        gato.emitirSom();
    }
}
