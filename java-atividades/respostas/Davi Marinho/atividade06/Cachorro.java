public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando alegremente!");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Pastor Alemão";
        cachorro1.idade = 4;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Thor";
        cachorro2.raca = "Golden Retriever";
        cachorro2.idade = 2;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Mel";
        cachorro3.raca = "Poodle";
        cachorro3.idade = 5;

        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();
        System.out.println("-----------------------------------");

        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();
        System.out.println("-----------------------------------");

        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();
    }
}
