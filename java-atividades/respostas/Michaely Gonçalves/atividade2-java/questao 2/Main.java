public class Main {
 public static void main(String[] args) {

 Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
 Gato gato = new Gato("Mimi", 2, "Branco");

 cachorro.exibirDados();
 cachorro.emitirSom();

 System.out.println();

 gato.exibirDados();
 gato.emitirSom();
    }
}
