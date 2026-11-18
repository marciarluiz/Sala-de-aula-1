public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    public void brincar() {
        System.out.println(nome + " está brincando com a bolinha.");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", "Pastor Alemão", 5);
        Cachorro c2 = new Cachorro("Bolt", "Border Collie", 3);
        Cachorro c3 = new Cachorro("Mel", "Poodle", 7);

        Cachorro[] cachorros = {c1, c2, c3};
        for (Cachorro c : cachorros) {
            c.exibirDados();
            c.latir();
            c.brincar();
            System.out.println("-----------------------");
        }
    }
}
