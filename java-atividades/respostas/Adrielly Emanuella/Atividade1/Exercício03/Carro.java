public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    // Liga o carro
    void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(modelo + " foi ligado!");
        } else {
            System.out.println(modelo + " ja esta ligado!");
        }
    }

    // Desliga o carro
    void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(modelo + " foi desligado!");
        } else {
            System.out.println(modelo + " ja esta desligado!");
        }
    }

    // Mostra as informacoes
    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2020;
        carro1.ligado = false;

        Carro carro2 = new Carro();
        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2022;
        carro2.ligado = false;

        carro1.ligar();
        carro1.ligar(); // Testa se impede ligar duas vezes
        carro1.exibirInformacoes();
        carro1.desligar();

        carro2.ligar();
        carro2.exibirInformacoes();
        carro2.desligar();
    }
}