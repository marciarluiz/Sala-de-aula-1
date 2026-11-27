/**
 * ATIVIDADE 8 - LÂMPADA INTELIGENTE
 */

public class Lampada {
    //Atributos
    String cor;
    int potencia; //em watts
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostraEstado(){
        System.out.println("Lâmpada " + cor + " de " + potencia + " W está " + (ligada ? " LIGADA" : "DESLIGADA"));
    }
    public  static void main(String[] args){
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.potencia = 8;
        l1.ligar();//primeira lâmpada ligada

        Lampada l2 = new Lampada();
        l2.cor = "Amarela";
        l2.potencia = 10;
        l2.desligar(); //segunda desligada

        l1.mostraEstado();
        l2.mostraEstado();
    }
}
