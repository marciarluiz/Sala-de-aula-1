public class atividade11 {
    public static void main(String[] args) {
    Televisao televisao1 = new Televisao();

    televisao1.marca = "LG";
    televisao1.volume = 20;
    televisao1.canal = 1;

    televisao1.aumentarVolume();
    televisao1.aumentarVolume();
    televisao1.aumentarVolume();


    televisao1.diminuirVolume();
    televisao1.diminuirVolume();
    televisao1.diminuirVolume();

    televisao1.mudarCanal(5);
    televisao1.mudarCanal(10);
    televisao1.mudarCanal(25);

    }

}

class Televisao{
    String marca;
    int volume;
    int canal;

    void aumentarVolume(){
        if(volume <= 90){
            volume += 10;
            System.out.println("Volume aumentado pra: " + volume);
        }else{
            System.out.println("Volume no maximo");
        }
    }

    void diminuirVolume(){
        if(volume > 0){
            volume -= 10;
            System.out.println("Volume diminuido pra: " + volume);
        }else{
            System.out.println("Volume no minimo");
        }
    }

    void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);

    }

}



