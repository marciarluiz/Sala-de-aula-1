package Resposta8;

public class Main {
    void main(String args[]) {
        Lampada lampada1 = new Lampada("Azul" , 60 , "desligada");
        lampada1.exibirEstado();
        lampada1.ligar();

        System.out.println();

        Lampada lampada2 = new Lampada("Amarela" , 60, "ligada");
        lampada2.exibirEstado();
        lampada2.desligar();
    }
}
