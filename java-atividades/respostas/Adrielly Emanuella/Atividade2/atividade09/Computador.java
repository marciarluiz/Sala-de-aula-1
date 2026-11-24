public class Computador extends Dispositivo {
    private String sistemaOperacional;

    public Computador(String marca, boolean ligado, String sistemaOperacional) {
        super(marca, ligado);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() { return sistemaOperacional; }
    public void setSistemaOperacional(String sistemaOperacional) { this.sistemaOperacional = sistemaOperacional; }

    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("Computador iniciando o sistema operacional");
    }

    @Override
    public void exibirEstado() {
        System.out.println("Tipo: Computador");
        super.exibirEstado();
        System.out.println("Sistema operacional: " + sistemaOperacional);
    }
}
