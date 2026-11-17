public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public void exibirResultado() {
        System.out.println("Círculo (Raio: " + raio + ") -> Área: " + String.format("%.2f", calcularArea()));
    }
}
