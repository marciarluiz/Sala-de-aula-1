public class atividade8 {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.cor ="vermelho";
        lampada1.potencia = 0;
        lampada1.ligada = false;

        lampada2.cor ="azul";
        lampada2.potencia = 50;
        lampada2.ligada = true;

        lampada1.ligar();
        lampada1.desligar();
        lampada1.mostrarEstado();

        lampada2.desligar();
        lampada2.ligar();
        lampada2.mostrarEstado();

    }

}

class Lampada{
    String cor;
    int potencia;
    Boolean ligada = false;

    void ligar(){
        if(ligada == false){
            System.out.println("A luz esta ligada agora.");
            ligada = true;
            potencia = 100;
        }else{
            System.out.println("A luz ja esta ligada.");
        }
    }

    void desligar(){
        if(ligada == true){
            System.out.println("A luz esta desligada agora.");
            ligada = false;
            potencia = 0;
        }else{
            System.out.println("A luz ja esta desligada.");
        }
    }

    void mostrarEstado(){
        if(ligada == true){
            System.out.println("A luz " + cor + " esta com " + potencia + " de potencia e esta ligado");
        }else{
            System.out.println("A luz " + cor + " esta com " + potencia + " de potencia e esta desligado");
        }
    }

}



