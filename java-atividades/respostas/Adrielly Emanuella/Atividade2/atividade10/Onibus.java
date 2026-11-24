public class Onibus extends Transporte {
    private double tarifa;

    public Onibus(String modelo, int capacidadePassageiros, double tarifa) {
        super(modelo, capacidadePassageiros);
        this.tarifa = tarifa;
    }

    public double getTarifa() { return tarifa; }
    public void setTarifa(double tarifa) { this.tarifa = tarifa; }

    @Override
    public void mover() {
        System.out.println("Ônibus transportando passageiros");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Ônibus");
        super.exibirInformacoes();
        System.out.printf("Tarifa: R$ %.2f%n", tarifa);
    }
}
