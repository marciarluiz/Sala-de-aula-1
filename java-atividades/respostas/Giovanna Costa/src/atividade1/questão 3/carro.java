public class carro {

    String modelo;
    String marca;
    int ano;
    boolean ligado = false;

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        } else {
            System.out.println(modelo + " ja esta ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        } else {
            System.out.println(modelo + " ja esta desligado.");
        }
    }

    public void exibirinformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
    }
}