public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar ligado");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar desligado");
    }

    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura);
        } else {
            System.out.println("Ja esta no maximo (30)");
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura: " + temperatura);
        } else {
            System.out.println("Ja esta no minimo (16)");
        }
    }
}
