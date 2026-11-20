class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println(modelo + " já está ligado.");
        } else {
            ligado = true;
            System.out.println(modelo + " ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado.");
        } else {
            ligado = false;
            System.out.println(modelo + " desligado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano
                + " | " + (ligado ? "Ligado" : "Desligado"));
    }
}

public class Atividade03 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.ano = 2020;

        Carro c2 = new Carro();
        c2.modelo = "Onix";
        c2.marca = "Chevrolet";
        c2.ano = 2022;

        c1.exibirInformacoes();
        c1.ligar();
        c1.ligar(); // tentativa de ligar duas vezes
        c1.exibirInformacoes();
        c1.desligar();

        c2.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();
        c2.desligar();
        c2.desligar();
    }
}