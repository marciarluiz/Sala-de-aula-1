public class Cachorro {

    String nome;
    String raca;
    int idade;

    Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando com a bolinha.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", "Pastor Alemão", 4);
        Cachorro c2 = new Cachorro("Bolt", "Labrador", 2);
        Cachorro c3 = new Cachorro("Mel", "Poodle", 6);

        c1.exibirDados();
        c1.latir();
        c1.brincar();
        System.out.println();

        c2.exibirDados();
        c2.latir();
        c2.brincar();
        System.out.println();

        c3.exibirDados();
        c3.latir();
        c3.brincar();
    }
}
