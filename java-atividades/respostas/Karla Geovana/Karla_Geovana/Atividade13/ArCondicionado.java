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
            temperatura = temperatura + 1;
        } else {
            System.out.println("Temperatura já está no máximo (30).");
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {   
            temperatura = temperatura - 1;
        } else {
            System.out.println("Temperatura já está no mínimo (16).");
        }
    }

    void exibirEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Ligado: " + ligado);
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("================");
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Springer";
        ar.temperatura = 24;
        ar.ligado = false;

        ar.exibirEstado();

        ar.ligar();
        ar.exibirEstado();

        ar.temperatura = 29;
        ar.aumentarTemperatura(); 
        ar.aumentarTemperatura(); 
        ar.exibirEstado();

        ar.temperatura = 17;
        ar.diminuirTemperatura(); 
        ar.diminuirTemperatura(); 
        ar.exibirEstado();

        ar.desligar();
        ar.exibirEstado();
    }
}
