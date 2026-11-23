public class lampada {

    String cor;
    int potencia;
    boolean ligada;

    public void ligar() {
        ligada = true;
        System.out.println("Lampada ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("Lampada desligada.");
    }

    public void mostrarestado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potencia: " + potencia + "W");

        if (ligada) {
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        }
    }
}
