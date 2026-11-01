
public class MainCarro {
    public static void main(String[] args) {

        // Primeiro carro
        Carro carro1 = new Carro();
        carro1.modelo = "Corolla";
        carro1.marca = "Toyota";
        carro1.ano = 2013;
        carro1.ligado = false;

        carro1.ligar();
        carro1.ligar();
        carro1.exibirInformacoes();

        carro1.desligar();
        carro1.exibirInformacoes();

        System.out.println();

        // Segundo carro
        Carro carro2 = new Carro();
        carro2.modelo = "Civic";
        carro2.marca = "Honda";
        carro2.ano = 2011;
        carro2.ligado = false;

        carro2.ligar();
        carro2.exibirInformacoes();

        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
