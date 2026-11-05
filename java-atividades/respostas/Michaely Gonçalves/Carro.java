
public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " ligado.");
        } else {
            System.out.println(modelo + " ja esta ligado.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println(modelo + " desligado.");
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;

        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2023;

        carro1.ligar();
        carro1.ligar();
        carro1.desligar();

        carro2.ligar();

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
    }
}
