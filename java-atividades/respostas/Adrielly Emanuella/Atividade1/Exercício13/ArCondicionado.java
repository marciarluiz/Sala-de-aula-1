public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    // Liga o aparelho
    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    // Desliga o aparelho
    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado!");
    }

    // Aumenta a temperatura ate 30 graus
    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
        } else {
            System.out.println("Temperatura maxima atingida!");
        }
    }

    // Diminui a temperatura ate 16 graus
    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
        } else {
            System.out.println("Temperatura minima atingida!");
        }
    }

    // Mostra o estado do aparelho
    void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + " C");
        System.out.println("Ligado: " + ligado);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "LG";
        ar.temperatura = 22;
        ar.ligado = false;

        ar.mostrarInformacoes();

        ar.ligar();
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.diminuirTemperatura();

        ar.mostrarInformacoes();

        ar.desligar();
        ar.mostrarInformacoes();
    }
}