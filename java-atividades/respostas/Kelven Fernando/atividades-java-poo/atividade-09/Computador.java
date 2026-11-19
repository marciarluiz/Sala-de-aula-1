public class Computador extends Dispositivo {
    private String sistemaOperacional;

    public Computador(String marca, boolean ligado, String sistemaOperacional) {
        super(marca, ligado);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() { return sistemaOperacional; }

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Computador iniciando o sistema operacional: " + sistemaOperacional);
    }

    @Override
    public void exibirEstado() {
        super.exibirEstado();
        System.out.println("Sistema operacional: " + sistemaOperacional);
    }
}
