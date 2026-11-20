class Cachorro {
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
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }
}

public class Atividade06 {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.raca = "Pastor Alemão";
        c1.idade = 4;

        Cachorro c2 = new Cachorro();
        c2.nome = "Thor";
        c2.raca = "Labrador";
        c2.idade = 2;

        Cachorro c3 = new Cachorro();
        c3.nome = "Mel";
        c3.raca = "Poodle";
        c3.idade = 6;

        c1.exibirDados();
        c1.latir();
        c1.brincar();

        c2.exibirDados();
        c2.latir();
        c2.brincar();

        c3.exibirDados();
        c3.latir();
        c3.brincar();
    }
}