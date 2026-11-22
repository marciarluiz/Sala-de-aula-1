public class Main {
    public static void main(String[] args) {

        // Primeira lâmpada
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca";
        lampada1.potencia = 12;
        lampada1.ligada = true;

        // Segunda lâmpada
        Lampada lampada2 = new Lampada();
        lampada2.cor = "Amarela";
        lampada2.potencia = 9;
        lampada2.ligada = false;

        // Exibindo informações
        System.out.println("PRIMEIRA LÂMPADA");
        lampada1.mostrarEstado();

        System.out.println("SEGUNDA LÂMPADA");
        lampada2.mostrarEstado();

        // Testando os métodos
        lampada2.ligar();
        lampada1.desligar();

        // Exibindo estados atualizados
        System.out.println("\nESTADOS ATUALIZADOS");

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}
