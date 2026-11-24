// Atividade 06

public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 3;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Luna";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 5;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Toby";
        cachorro3.raca = "Beagle";
        cachorro3.idade = 2;

        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();
        System.out.println();

        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();
        System.out.println();

        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();
    }
}
