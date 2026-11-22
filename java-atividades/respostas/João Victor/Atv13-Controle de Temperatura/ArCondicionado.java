public class ArCondicionado {

    String marca;
    int temperatura;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado!");
    }

    public void aumentarTemperatura() {
        if (ligado == true) {
            if (temperatura < 30) {
                temperatura++;
                System.out.println("Temperatura aumentada para: " + temperatura + " °C");
            } else {
                System.out.println("Temperatura máxima atingida!");
            }
        } else {
            System.out.println("Ligue o aparelho primeiro!");
        }
    }

    public void diminuirTemperatura() {
        if (ligado == true) {
            if (temperatura > 16) {
                temperatura--;
                System.out.println("Temperatura diminuída para: " + temperatura + " °C");
            } else {
                System.out.println("Temperatura mínima atingida!");
            }
        } else {
            System.out.println("Ligue o aparelho primeiro!");
        }
    }
}
