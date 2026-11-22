public class Main {
    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();

        ar.marca = "Samsung";
        ar.temperatura = 18;
        ar.ligado = false;

        System.out.println("Marca: " + ar.marca);
        System.out.println("Temperatura inicial: " + ar.temperatura + " °C");

        ar.ligar();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        ar.diminuirTemperatura();

        System.out.println("Temperatura atual: " + ar.temperatura + " °C");

        ar.desligar();
    }
}
