public abstract class FormaGeometrica {

    public abstract double calcularArea();

    public void exibirResultado() {
        System.out.printf("Área do %s: %,.2f%n", getClass().getSimpleName(), calcularArea());
    }
}
