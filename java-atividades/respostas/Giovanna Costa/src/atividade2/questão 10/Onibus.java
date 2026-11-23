public class Onibus extends Transporte {
    private double tarifa;

    public Onibus(String modelo, int capacidadePassageiros, double tarifa) {
        super(modelo, capacidadePassageiros);
        this.tarifa = tarifa;
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está circulando pela estrada.");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== ÔNIBUS ===");
        super.exibirInformacoes();
        System.out.println("Tarifa: R$ " + tarifa);
    }
}