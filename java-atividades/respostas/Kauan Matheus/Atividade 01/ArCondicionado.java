// Atividade 13

public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }

    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
        }
    }

    public static void main(String[] args) {
        ArCondicionado aparelho = new ArCondicionado();

        aparelho.marca = "LG";
        aparelho.temperatura = 22;
        aparelho.ligado = false;

        aparelho.ligar();

        aparelho.aumentarTemperatura();
        System.out.println("Temperatura: " + aparelho.temperatura + " graus");

        aparelho.diminuirTemperatura();
        System.out.println("Temperatura: " + aparelho.temperatura + " graus");

        aparelho.desligar();
    }
}
