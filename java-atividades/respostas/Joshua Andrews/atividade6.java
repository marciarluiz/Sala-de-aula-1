public class atividade6 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Cachorro cachorro3 = new Cachorro();

        cachorro1.nome = "Pedrin";
        cachorro1.raca = "ruim";
        cachorro1.idade = 67;

       cachorro1.latir();
       cachorro1.brincar();
       cachorro1.exibirDados();

        cachorro2.nome = "toto";
        cachorro2.raca = "viralata";
        cachorro2.idade = 5;

        cachorro2.latir();
        cachorro2.brincar();
        cachorro2.exibirDados();

        cachorro3.nome = "Ambrosio";
        cachorro3.raca = "pincher";
        cachorro3.idade = 2;

        cachorro3.latir();
        cachorro3.brincar();
        cachorro3.exibirDados();

    }

}

class Cachorro{
    String nome;
    String raca;
    int idade;

    void latir(){
        System.out.println(nome + " diz auau");
    }

    void brincar(){
        System.out.println(nome + " esta brincando");
    }

    void exibirDados(){
        System.out.println("Nome do chachorro: " + nome);
        System.out.println("Raça do chachorro: " + raca);
        System.out.println("Idade do chachorro: " + idade);
    }

}



