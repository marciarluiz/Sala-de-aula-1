public abstract class FormaGeometrica {

    public abstract double calcularArea();

    public void exibirResultado() {
        System.out.println("Área calculada: " + String.format("%.2f", calcularArea()));
    }
}
