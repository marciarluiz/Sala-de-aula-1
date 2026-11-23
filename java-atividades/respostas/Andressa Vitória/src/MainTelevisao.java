public class MainTelevisao {

    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.volume = 98;
        tv.canal = 5;

        tv.exibirInformacoes();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume(); // passa do limite, deve avisar
        tv.mudarCanal(12);
        tv.exibirInformacoes();

        tv.volume = 1;
        tv.diminuirVolume();
        tv.diminuirVolume(); // passa do limite, deve avisar
        tv.exibirInformacoes();

    }
}