package Resposta13;

public class Main {
    public static void main(String[] args) {
        Arcondicionado ar = new Arcondicionado("LG Dual Inverter", 17, false);

        ar.diminuirTemperatura();
        ar.ligar();
        ar.diminuirTemperatura(); 
        ar.diminuirTemperatura(); 
        ar.aumentarTemperatura(); 
        ar.desligar();
    }
}
