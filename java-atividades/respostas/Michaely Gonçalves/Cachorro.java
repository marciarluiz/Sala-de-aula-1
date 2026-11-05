
public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " esta latindo: Au au!");
    }

    void brincar() {
        System.out.println(nome + " esta brincando.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raca: " + raca);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Cachorro c2 = new Cachorro();
        Cachorro c3 = new Cachorro();

        c1.nome = "Rex";
        c1.raca = "Labrador";
        c1.idade = 3;

        c2.nome = "Bob";
        c2.raca = "Poodle";
        c2.idade = 2;

        c3.nome = "Luna";
        c3.raca = "Vira-lata";
        c3.idade = 4;

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
