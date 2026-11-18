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
            System.out.println(modelo + " ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado.");
        } else {
            ligado = false;
            System.out.println(modelo + " desligado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println(marca + " " + modelo + " (" + ano + ") - "
                + (ligado ? "ligado" : "desligado"));
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Civic", "Honda", 2020);
        Carro c2 = new Carro("Onix", "Chevrolet", 2022);

        c1.exibirInformacoes();
        c1.ligar();
        c1.ligar(); // desafio: não liga duas vezes seguidas
        c1.exibirInformacoes();
        c1.desligar();

        c2.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();
        c2.desligar();
        c2.desligar();
        c2.exibirInformacoes();
    }
}
