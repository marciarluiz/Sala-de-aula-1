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
        System.out.println(nome + " Late: Au au!");
    }

    public void brincar() {
        System.out.println(nome + " Está brincando com a agua.");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + (idade == 1 ? " ano" : " anos"));
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Volêi", "Shih tzu", 6);
        Cachorro c2 = new Cachorro("Mel", "Shih tzu", 7);
        Cachorro c3 = new Cachorro("Teddy", "Shih tzu", 9);

        c1.latir();
        c1.brincar();
        c2.latir();
        c2.brincar();
        c3.latir();
        c3.brincar();
        System.out.println("---------------------");

        c1.exibirDados();
        c2.exibirDados();
        c3.exibirDados();
    }
}
