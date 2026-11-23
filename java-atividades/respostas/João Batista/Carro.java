///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Carro {

    private String modelo;
    private String marca;
    private int ano;
    private boolean ligado;

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        if (ligado) {
            System.out.println(modelo + " já está ligado.");
        } else {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado.");
        } else {
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + (ligado ? "sim" : "não"));
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Civic", "Honda", 2020);
        Carro carro2 = new Carro("Onix", "Chevrolet", 2022);

        carro1.exibirInformacoes();
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
