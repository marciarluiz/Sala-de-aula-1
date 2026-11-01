
public class atividade3 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Corolla";
        carro1.marca = "Toyota";
        carro1.ano = 2022;
        carro1.ligado = false;

        carro2.modelo = "Civic";
        carro2.marca = "Honda";
        carro2.ano = 2024;
        carro2.ligado = true;

        carro1.exibirInformacoes();
        carro1.ligado();
        carro1.ligado();

        System.out.println("--//--//--//--//--//--//--//--//--//--//--//--// ");
        carro2.exibirInformacoes();
        carro2.ligado();
    }

}

class Carro{
    String modelo;
    String marca;
    int ano;
    boolean ligado = false;

    void ligado(){
        if(ligado == false){
            System.out.println("Agora o carro esta ligado");
            ligado = true;
        }else{
            System.out.println("O carro já esta ligado");
        }
    }

    void desligar(){
        if(ligado == true){
            System.out.println("Agora o carro esta desligado");
            ligado = false;
        }else{
            System.out.println("O carro já esta desligado");
        }
    }

    void exibirInformacoes(){
        System.out.println("Modelo: " + modelo);
        System.out.println("marca: " + marca);
        System.out.println("ano: " + ano);
        if (ligado == true) {
            System.out.println("Esta ligado.");
        }else{
            System.out.println("Esta Desligado.");
        }

    }
}



