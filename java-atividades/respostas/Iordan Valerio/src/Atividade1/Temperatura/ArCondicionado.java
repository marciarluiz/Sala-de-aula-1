package Atividade1.Temperatura;

public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    public void ligar(){
        ligado = true;
        System.out.println("Ar-condicionado ligado!");
    }

    public void desligar(){
        ligado = false;
        System.out.println("Ar-condicionado desligado!");
    }

    public void aumentarTemperatura(){
        if(temperatura < 30){
            temperatura++;
            System.out.println("Temperatura atual: " + temperatura + "°C");
        }else{
            System.out.println("Temperatura máxima atingida!");
        }
    }

    public void diminuirTemperatura(){
        if (temperatura > 16){
            temperatura--;
            System.out.println("Temperatura atual: " + temperatura + "°C");
        }else{
            System.out.println("Temperatura mínima atingida!");
        }
    }
}
