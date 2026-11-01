public class ArCondicionado {

    // Atributos
    String marca;
    int temperatura;
    boolean ligado;

    // Métodos
    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado!");
    }

    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada!");
        } else {
            System.out.println("Temperatura máxima atingida!");
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura diminuída!");
        } else {
            System.out.println("Temperatura mínima atingida!");
        }
    }
}
