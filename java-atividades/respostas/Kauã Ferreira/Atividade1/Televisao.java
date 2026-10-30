/**
 * ATIVIDADE 11 -  CONTROLE DE TELEVISÃO
 * Televisao
 */

public class Televisao {
    //Atributos 
    String marca;
    int volume;
    int canal;

    void aumentarVolume(){
        if(volume < 100){
            volume ++;
        }else{
            System.out.println("Volume já está no máximo (100).");
        }
    }
    void diminuirVolume(){
        if(volume > 0 ){
            volume--;
        }else{
            System.out.println("Volume já está no minimo (0).");
        }
    }
    void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para " + canal +".");
    }
    void exibirInformacoes(){
        System.out.println("TV " + marca + " | Volume: " + volume +" | Canal: " + canal);
    }
    public static void main(String[] args){
        Televisao tv = new Televisao();
        tv.marca = "Samsung";
        tv.volume = 98; //perto do limite para testar a regra
        tv.canal = 5;

        tv.exibirInformacoes();

        tv.aumentarVolume(); // 99
        tv.aumentarVolume(); // 100
        tv.aumentarVolume(); // bloqueado
        tv.mudarCanal(13);
        tv.exibirInformacoes();

        //Zero o volume para testar o limite inferior
        for (int i = 0; i < 101; i++){
            tv.diminuirVolume();
        }
        tv.exibirInformacoes();
    }

}
