// Atividade 03
public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println(modelo + " está ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println(modelo + " está desligado.");
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
        System.out.println();
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2022;

        carro1.ligar();
        carro1.exibirInformacoes();
        carro1.desligar();

        carro2.ligar();
        carro2.exibirInformacoes();
        carro2.desligar();
    }
}
