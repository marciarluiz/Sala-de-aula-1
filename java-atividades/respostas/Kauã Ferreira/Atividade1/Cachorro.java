/**
 * ATIVIDADE 6 - CADASTRO DE ANIMAIS 
 */

public class Cachorro {
    //Atributos
    String nome;
    String raca;
    int idade;

    void latir(){
        System.out.println(nome + " diz: Au, au!");
    }
    void brincar(){
        System.out.println(nome + " está bricando com a bola.");
    }
    void exibirDados(){
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + "anos");
    }

    public static void main(String[] args){
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.raca = "Pastor Alemão";
        c1.idade = 6; 

        Cachorro c2 = new Cachorro();
        c2.nome = "Thor";
        c2.raca = "Labrador";
        c2.idade = 4; 

        Cachorro c3 = new Cachorro();
        c3.nome = "Mel";
        c3.raca = "Poodle";
        c3.idade = 5; 

        //Executa os métodos de cada objeto
        c1.latir(); c1.brincar(); c1.exibirDados();
        System.out.println();
        c2.latir(); c2.brincar(); c2.exibirDados();
        System.out.println();
        c3.latir(); c3.brincar(); c3.exibirDados();
        System.out.println();
    }
}
