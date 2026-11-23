public class MainLampada {

    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.potencia = 60;
        l1.ligada = true;

        Lampada l2 = new Lampada();
        l2.cor = "Amarela";
        l2.potencia = 40;
        l2.ligada = false;

        l1.mostrarEstado();
        l2.mostrarEstado();

        System.out.println("\nInvertendo os estados:");
        l1.desligar();
        l2.ligar();
        l1.mostrarEstado();
        l2.mostrarEstado();

    }
}