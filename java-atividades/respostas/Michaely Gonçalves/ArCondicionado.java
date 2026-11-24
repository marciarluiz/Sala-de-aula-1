
public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar condicionado ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar condicionado desligado.");
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

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + " C");
        System.out.println("Ligado: " + ligado);
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();

        ar.marca = "LG";
        ar.temperatura = 22;
        ar.ligado = false;

        ar.ligar();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        ar.diminuirTemperatura();

        ar.exibirInformacoes();

        ar.desligar();
    }
}
