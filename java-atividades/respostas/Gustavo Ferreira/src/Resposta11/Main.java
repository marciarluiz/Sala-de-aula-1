package Resposta11;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung", 99, 5);

        tv.exibirStatus();
        tv.aumentarVolume();
        tv.aumentarVolume(); 
        tv.diminuirVolume();
        tv.mudarCanal(12);
        tv.exibirStatus();
    }
}