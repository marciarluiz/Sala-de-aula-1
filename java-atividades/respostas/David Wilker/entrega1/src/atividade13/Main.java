package atividade13;

public class Main {
    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado("Samsung", 30.0);
        ar1.ligar();
        ar1.aumentarTemperatura();
        ar1.diminuirTemperatura();
        ar1.desligar();
        System.out.println();

        ArCondicionado ar2 = new ArCondicionado("LG", 18.0);
        ar2.desligar();
        ar2.diminuirTemperatura();
        ar2.aumentarTemperatura();
        ar2.ligar();
        ar2.aumentarTemperatura();
        ar2.aumentarTemperatura();
    }
}
