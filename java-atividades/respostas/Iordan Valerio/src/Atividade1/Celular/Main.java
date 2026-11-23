package Atividade1.Celular;

public class Main {

    public static void main(String[] args) {
    
        Celular celular1 = new Celular();

        celular1.marca = "Apple";
        celular1.modelo = "iPhone16";
        celular1.bateria = 51;
        celular1.exibirInformacoes();
        celular1.ligar();
        celular1.carregarBateria();


        Celular celular2 = new Celular();

        celular2.marca = "Sansung";
        celular2.modelo = "Galaxy A17";
        celular2.bateria = 88;
        celular2.exibirInformacoes();
        celular2.ligar();
        celular2.carregarBateria();
    }
}
