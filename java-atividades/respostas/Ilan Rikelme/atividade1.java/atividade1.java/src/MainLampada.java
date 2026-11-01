public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        lampada1.potencia = 30;
        lampada1.cor = "Branca";
        lampada1.ligar();

        lampada2.potencia = 50;
        lampada2.cor = "Amarela";
        lampada2.desligar();
        lampada1.exibirResultados();
        lampada2.exibirResultados();


        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
