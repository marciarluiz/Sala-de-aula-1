public class mainlampada {

    public static void main(String[] args) {

        lampada lampada1 = new lampada();
        lampada lampada2 = new lampada();

        lampada1.cor = "Branca";
        lampada1.potencia = 15;
        lampada1.ligada = true;

        lampada2.cor = "Amarela";
        lampada2.potencia = 20;
        lampada2.ligada = false;

        lampada1.mostrarestado();

        System.out.println();

        lampada2.mostrarestado();
    }
}