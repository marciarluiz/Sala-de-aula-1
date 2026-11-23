package Atividade1.Lampada;

public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    public void ligar(){
        System.out.println("A luz foi ligada.");
    }

    public void desligar(){
        System.out.println("A luz foi desligada.");
    }

    public void mostrarEstado(){
        if (ligada == true){
            System.out.println("A luz está ligada.");
        }else{
            System.out.println("A luz está desligada");
        }

    }
}
