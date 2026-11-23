package Atividade1.Temperatura;

public class Main {
    public static void main(String[]args){

        ArCondicionado arcondicionado1 = new ArCondicionado();

        arcondicionado1.marca = "Samsung";
        arcondicionado1.temperatura = 22;
        arcondicionado1.ligado = true;
        arcondicionado1.desligar();
        arcondicionado1.ligar();
        arcondicionado1.aumentarTemperatura();
        arcondicionado1.diminuirTemperatura();

        System.out.println("Marca: " + arcondicionado1.marca);
        System.out.println("Temperatura: " + arcondicionado1.temperatura + " °C");
        System.out.println("Ligado: " + arcondicionado1.ligado);

    }
}
