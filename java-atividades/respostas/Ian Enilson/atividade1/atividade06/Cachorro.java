///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + (idade == 1 ? " ano" : " anos"));
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", "Pastor Alemão", 4);
        Cachorro c2 = new Cachorro("Mel", "Golden Retriever", 2);
        Cachorro c3 = new Cachorro("Thor", "Vira-lata", 6);

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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////