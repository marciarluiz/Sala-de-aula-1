package Resposta6;

public class Main {
    void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex" , "Golden retriver" , 4);
        cachorro1.latir();
        cachorro1.brincar();
        cachorro1.exibirInformacoes();
        
        System.out.println();

        Cachorro cachorro2 = new Cachorro("Duque" , "Pastor Alemão" , 5);
        cachorro2.latir();
        cachorro2.brincar();
        cachorro2.exibirInformacoes();  

        System.out.println();

        Cachorro cachorro3 = new Cachorro("Mel" , "Poddle" , 3);
        cachorro3.latir();
        cachorro3.brincar();
        cachorro3.exibirInformacoes();  
    }
}
