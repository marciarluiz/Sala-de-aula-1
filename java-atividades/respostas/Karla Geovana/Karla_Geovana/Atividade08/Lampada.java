public class Lampada {

    String cor;
    int potencia;
    boolean ligada;
    
    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        System.out.println("Lâmpada " + cor + " de " + potencia + "W");
        if (ligada == true) {
            System.out.println("Estado: ligada");
        } else {
            System.out.println("Estado: desligada");
        }
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        
        Lampada lampada1 = new Lampada();
        lampada1.cor = "branca";
        lampada1.potencia = 60;
        lampada1.ligar();

        Lampada lampada2 = new Lampada();
        lampada2.cor = "amarela";
        lampada2.potencia = 40;
        lampada2.desligar();

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
