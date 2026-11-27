package atividade11;

public class Main {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao("Samsung", 0, 10);
        tv1.exibirInformacoes();
        tv1.aumentarVolume();
        tv1.diminuirVolume();
        tv1.diminuirVolume();
        tv1.mudarCanal(20);
        tv1.exibirInformacoes();
    }
}
