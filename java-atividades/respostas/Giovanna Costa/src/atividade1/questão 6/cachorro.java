public class cachorro {

    String nome;
    String raca;
    int idade;

    public void latir() {
        System.out.println(nome + " esta latindo: Au au!");
    }

    public void brincar() {
        System.out.println(nome + " esta brincando.");
    }

    public void exibirdados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raca: " + raca);
        System.out.println("Idade: " + idade + " anos");
    }
}