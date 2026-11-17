public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println("O carro " + marca + " " + modelo + " já está ligado!");
        } else {
            ligado = true;
            System.out.println("O carro " + marca + " " + modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println("O carro " + marca + " " + modelo + " já está desligado!");
        } else {
            ligado = false;
            System.out.println("O carro " + marca + " " + modelo + " foi desligado.");
        }
    }

    void exibirInformacoes() {
        String estado = ligado ? "Ligado" : "Desligado";
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano + " | Estado: " + estado);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2023;
        carro1.ligado = false;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;
        carro2.ligado = false;

        System.out.println("=== Testando Carro 1 ===");
        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar(); // Desafio: tentando ligar duas vezes consecutivas
        carro1.exibirInformacoes();
        carro1.desligar();
        carro1.exibirInformacoes();

        System.out.println("\n=== Testando Carro 2 ===");
        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.exibirInformacoes();
        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
