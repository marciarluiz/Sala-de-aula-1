public class Main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Consul";
        ar.temperatura = 24;
        ar.ligado = false;

        ar.ligar();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        ar.diminuirTemperatura();

        // testando os limites
        ar.temperatura = 29;
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        ar.temperatura = 17;
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();

        ar.desligar();
    }
}
