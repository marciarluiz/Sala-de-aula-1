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
        System.out.println("Ar-condicionado ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura >= 30) {
            System.out.println("Temperatura já está no máximo (30 °C).");
        } else {
            temperatura++;
        }
    }

    public void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura <= 16) {
            System.out.println("Temperatura já está no mínimo (16 °C).");
        } else {
            temperatura--;
        }
    }

    public void exibirEstado() {
        System.out.println(marca + " | " + (ligado ? "ligado" : "desligado")
                + " | Temperatura: " + temperatura + " °C");
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado("Samsung", 24);
        ar.exibirEstado();

        ar.aumentarTemperatura(); // desligado: deve avisar
        ar.ligar();
        ar.exibirEstado();

        for (int i = 0; i < 10; i++) {
            ar.aumentarTemperatura(); // passa de 30, deve ser barrado
        }
        ar.exibirEstado();

        for (int i = 0; i < 20; i++) {
            ar.diminuirTemperatura(); // passa de 16, deve ser barrado
        }
        ar.exibirEstado();

        ar.desligar();
        ar.exibirEstado();
    }
}
