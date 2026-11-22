public class Cachorro {

    // Atributos
    String nome;
    String raca;
    int idade;

    // Método para latir
    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    // Método para brincar
    public void brincar() {
        System.out.println(nome + " está brincando!");
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("-------------------------");
    }
}
