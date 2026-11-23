package Atividade1.Animais;

public class Cachorro {
    String nome;
    String raca;
    int idade;

    public void latir(){
        System.out.println(nome + " está latindo.");
    }

    public void brincar(){
        System.out.println(nome + " quer brincar!");
    }

    public void exibirDados(){
        System.out.println("\nDados do animal\n");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
    }
}
