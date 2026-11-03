public class Cachorro {

    // Atributos
    private String nome;
    private String raca;
    private int idade;

    // Construtor padrão
    public Cachorro() {
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    // Métodos
    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    public void brincar() {
        System.out.println(nome + " está brincando com a bolinha.");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + (idade == 1 ? " ano" : " anos"));
        System.out.println("-----------------------------");
    }
}