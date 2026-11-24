public abstract class FormaGeometrica {

    public abstract double calcularArea();

    public void exibirResultado() {
        System.out.printf("%s - área: %.2f%n", getClass().getSimpleName(), calcularArea());
    }
}
