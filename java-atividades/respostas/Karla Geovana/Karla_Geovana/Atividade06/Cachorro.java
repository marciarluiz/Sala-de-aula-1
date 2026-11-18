public class Cachorro {

    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("====================");
    }

    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 3;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Mel";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 5;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Thor";
        cachorro3.raca = "Vira-lata";
        cachorro3.idade = 2;

        cachorro1.latir();
        cachorro1.brincar();
        cachorro2.latir();
        cachorro2.brincar();
        cachorro3.latir();
        cachorro3.brincar();

        cachorro1.exibirDados();
        cachorro2.exibirDados();
        cachorro3.exibirDados();
    }
}
