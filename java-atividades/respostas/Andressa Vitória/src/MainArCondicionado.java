public class MainArCondicionado {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Consul";
        ar.temperatura = 29;
        ar.ligado = false;

        ar.ligar();
        ar.aumentarTemperatura();
        ar.aumentarTemperatura(); // passa de 30, deve avisar

        ar.temperatura = 17;
        ar.diminuirTemperatura();
        ar.diminuirTemperatura(); // passa de 16, deve avisar

        ar.desligar();

    }
}