package Resposta6;

public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println("O(a) " + nome + " latiu");
    }

    void brincar() {
        System.out.println("O(a) " + nome + " está brincando");
    }

    public Cachorro(String nome , String raca , int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    void exibirInformacoes() {
        System.out.println("O nome do cachorro é " + nome + " a raça que ele pertence é a " + raca + " e ele tem " + idade + " anos.");
    }

}
