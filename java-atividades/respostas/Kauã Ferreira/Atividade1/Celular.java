/**
 * ATIVIDADE 5 - CADASTRO DE CELULARES
 */

public class Celular {
    //Atributos
    String marca;
    String modelo;
    int bateria; //porcentagem de 0 a 100

    void ligar(){
        System.out.println(marca + "" + modelo + "ligado.");
    }

    void exibirInformacoes(){
        System.out.println("Marca: " + marca +  " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }

    //Simulando o carregamento: sobe de 10 até chegar em 100%
    void carregarBateria(){
        System.out.println("Carregando " +  modelo + "...");
        while (bateria < 100) {
            bateria += 10;
            if (bateria > 100){
                bateria = 100; //nunca passa de 100%
            }
            System.out.println(" Bateria: " + bateria + "%");
        }
        System.out.println("Bateria completa!");
    }
    
        public static void main(String[] args){
            Celular c1 = new Celular();
            c1.marca = "Samsung";
            c1.modelo = "Galaxy s25";
            c1.bateria = 85;

            Celular c2 = new Celular();
            c2.marca = "Apple";
            c2.modelo = "Iphone 15";
            c2.bateria = 65;

            c1.ligar();
            c1.exibirInformacoes();
            c2.ligar();
            c2.exibirInformacoes();

            System.out.println();
            c1.carregarBateria();
            c2.carregarBateria();
        }
    
}
