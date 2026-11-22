public class Lampada {

    // Atributos
    String cor;
    int potencia;
    boolean ligada;

    // Método para ligar
    public void ligar() {
        ligada = true;
        System.out.println("Lâmpada ligada!");
    }

    // Método para desligar
    public void desligar() {
        ligada = false;
        System.out.println("Lâmpada desligada!");
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + "W");

        if (ligada == true) {
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        }

        System.out.println("-------------------------");
    }
}
