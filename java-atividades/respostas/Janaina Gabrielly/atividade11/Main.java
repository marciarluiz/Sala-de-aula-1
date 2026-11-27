public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "Samsung";
        tv.volume = 98;
        tv.canal = 4;

        tv.exibirInformacoes();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume(); // ja passou do limite
        tv.mudarCanal(13);
        tv.exibirInformacoes();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.mudarCanal(7);
        tv.exibirInformacoes();

        // testando o limite de baixo
        tv.volume = 1;
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.exibirInformacoes();
    }
}
