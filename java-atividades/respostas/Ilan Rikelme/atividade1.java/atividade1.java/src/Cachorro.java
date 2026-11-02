public class Cachorro {

    // Atributos
    String nome;
    String raça;
    int idade;
    boolean latir;

    // Métodos
    void latir() {
        if (latir == true) {
            System.out.println(nome + " está latindo: é cachorro au au!");
        } else {
            System.out.println(nome + " não está latindo, então " + nome + " é gato, miau miau.");
        }
    }

    void brincar() {
        System.out.println(nome + " está brincando!");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raça);
        System.out.println("Idade: " + idade);
    }
    
}