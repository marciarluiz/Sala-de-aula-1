package Atividade1.Televisao;

public class Main {
    public static void main(String[]args){

        Televisao televisao1 = new Televisao();

        televisao1.marca = "Samsung";
        televisao1.volume = 28;
        //televisao1.canal = 109;   NÃO PRECISA DESSA LINHA, POIS POSSE DEFINIR O CANAL EM "mudarCanal".
        televisao1.aumentarVolume(8);
        televisao1.diminuirVolume(9);
        televisao1.mudarCanal(98);
        televisao1.infoAtualizadas();
    }
}
