public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando!");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 3;

        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Luna";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 2;

        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Max";
        cachorro3.raca = "Vira-lata";
        cachorro3.idade = 4;

        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();

        cachorro2.exibirDados();
        cachorro2.latir();

        cachorro3.exibirDados();
    }
}