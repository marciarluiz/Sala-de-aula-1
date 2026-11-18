public class Televisao extends Dispositivo {
    private int canal;

    public Televisao(String marca, boolean ligado, int canal) {
        super(marca, ligado);
        this.canal = canal;
    }

    public int getCanal() { return canal; }

    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Televisão ligada no canal informado: " + canal);
    }

    @Override
    public void exibirEstado() {
        super.exibirEstado();
        System.out.println("Canal: " + canal);
    }
}
