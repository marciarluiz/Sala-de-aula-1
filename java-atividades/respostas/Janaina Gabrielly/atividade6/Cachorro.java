public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " esta latindo: Au Au!");
    }

    void brincar() {
        System.out.println(nome + " esta brincando");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raca: " + raca);
        System.out.println("Idade: " + idade);
    }
}
