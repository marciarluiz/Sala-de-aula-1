public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    @Override
    public void ligar() {
        System.out.println("Carro ligado!");
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Carro");
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}
