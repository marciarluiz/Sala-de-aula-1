public class Televisao extends Dispositivo {
    private int canal;

    public Televisao(String marca, boolean ligado, int canal) {
        super(marca, ligado);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("Televisão ligada no canal informado (" + canal + ")");
    }

    @Override
    public void exibirEstado() {
        String estado = isLigado() ? "Ligada" : "Desligada";
        System.out.println("Televisão " + getMarca() + " | Estado: " + estado + " | Canal: " + canal);
    }
}
