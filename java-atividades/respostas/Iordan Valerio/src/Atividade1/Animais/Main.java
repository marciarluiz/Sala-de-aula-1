package Atividade1.Animais;

public class Main {
    public static void main(String[] ars) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Bob";
        cachorro1.raca = "Vira-Lata";
        cachorro1.idade = 4;
        cachorro1.latir();
        cachorro1.brincar();
        cachorro1.exibirDados();

        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "Rex";
        cachorro2.raca = "Pitbull";
        cachorro2.idade = 5;
        cachorro2.latir();
        cachorro2.brincar();
        cachorro2.exibirDados();

        Cachorro cachorro3 = new Cachorro();

        cachorro3.nome = "Scooby";
        cachorro3.raca = "Pastor Alemão";
        cachorro3.idade = 3;
        cachorro3.latir();
        cachorro3.brincar();
        cachorro3.exibirDados();
    }
    
}
