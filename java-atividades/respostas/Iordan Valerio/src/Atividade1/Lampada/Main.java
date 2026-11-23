package Atividade1.Lampada;

public class Main {
    public static void main(String[] args){

    Lampada lampada1 = new Lampada();

    lampada1.cor = "Azul";
    lampada1.potencia = 40;
    lampada1.ligada = true;
    lampada1.ligar();
    lampada1.desligar();
    lampada1.mostrarEstado();


    Lampada lampada2 = new Lampada();

    lampada2.cor = "Amarela";
    lampada2.potencia = 20;
    lampada2.ligada = false;
    lampada2.ligar();
    lampada2.desligar();
    lampada2.mostrarEstado();

    }
}
