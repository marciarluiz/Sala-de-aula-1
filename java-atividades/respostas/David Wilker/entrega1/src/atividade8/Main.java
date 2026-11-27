package atividade8;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto de classe
        Lampada lampada1 = new Lampada("Branca", 10, true);
        lampada1.ligar();
        lampada1.desligar();
        lampada1.mostrarEstado();

        Lampada lampada2 = new Lampada("Amarela", 15, false);
        lampada2.ligar();
        lampada2.mostrarEstado();
    }
}
