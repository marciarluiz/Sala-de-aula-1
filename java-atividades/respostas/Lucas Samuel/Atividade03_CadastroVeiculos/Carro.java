public class Carro {

    String modelo;
    String marca;
    int ano;
    boolean ligado;

    Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
    }

    void ligar() {
        if (ligado) { // desafio: não ligar duas vezes seguidas
            System.out.println(modelo + " já está ligado.");
        } else {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado.");
        } else {
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + " | Marca: " + marca + " | Ano: " + ano
                + " | Ligado: " + (ligado ? "sim" : "não"));
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Onix", "Chevrolet", 2020);
        Carro carro2 = new Carro("Civic", "Honda", 2022);

        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar(); // teste do desafio
        carro1.exibirInformacoes();
        carro1.desligar();

        System.out.println();

        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.exibirInformacoes();
        carro2.desligar();
        carro2.desligar(); // já desligado
        carro2.exibirInformacoes();
    }
}
