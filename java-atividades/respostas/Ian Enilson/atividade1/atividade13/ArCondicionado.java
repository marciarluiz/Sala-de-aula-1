///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class ArCondicionado {

    private String marca;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(String marca, int temperatura) {
        this.marca = marca;
        this.temperatura = temperatura;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura >= 30) {
            System.out.println("Temperatura máxima (30 °C) atingida.");
        } else {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + " °C");
        }
    }

    public void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura <= 16) {
            System.out.println("Temperatura mínima (16 °C) atingida.");
        } else {
            temperatura--;
            System.out.println("Temperatura: " + temperatura + " °C");
        }
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("Consul", 24);

        ar.aumentarTemperatura();
        ar.ligar();

        
        for (int i = 0; i < 8; i++) {
            ar.aumentarTemperatura();
        }

        
        for (int i = 0; i < 16; i++) {
            ar.diminuirTemperatura();
        }

        ar.desligar();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////