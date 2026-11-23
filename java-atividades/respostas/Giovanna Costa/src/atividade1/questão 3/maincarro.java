public class maincarro {

    public static void main(String[] args) {

        carro carro1 = new carro();
        carro carro2 = new carro();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;

        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2023;

        carro1.exibirinformacoes();
        carro1.ligar();
        carro1.ligar();
        carro1.desligar();

        System.out.println();

        carro2.exibirinformacoes();
        carro2.ligar();
        carro2.desligar();
    }
}