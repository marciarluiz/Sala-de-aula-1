package Atividade1.Televisao;

public class Televisao {
    String marca;
    int volume;
    int canal;
    int volumeBaixo;
    int volumeAlto;

    public void aumentarVolume(int subirVolume){
        volumeAlto = volume + subirVolume;
        System.out.println(volumeAlto);
    }

    public void diminuirVolume(int baixarVolume){
        volumeBaixo = volume - baixarVolume;
        System.out.println(volumeBaixo);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void infoAtualizadas(){
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("Novo volume após diminuir: " + volumeAlto);
        System.out.println("Novo volume após aumentar: " + volumeBaixo);
    }
}
