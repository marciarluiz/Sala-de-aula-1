public class Carro {

    String modelo;
    String marca;
    int ano;
    boolean ligado; 

    void ligar() {
        if (ligado == true) {   
            System.out.println(modelo + "está ligado!");
        } else {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println(modelo + " foi desligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2015;
        carro1.ligado = false;
        
        Carro carro2 = new Carro();
        carro2.marca = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.ano = 2020;
        carro2.ligado = false;
   
        carro1.ligar();
        carro1.ligar(); 
        carro1.exibirInformacoes();
        carro1.desligar();

        carro2.ligar();
        carro2.exibirInformacoes();
        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
