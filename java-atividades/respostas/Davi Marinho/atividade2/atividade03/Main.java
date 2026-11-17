public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2023, 4);
        Moto moto = new Moto("Honda", "CB 500", 2024, 500);

        carro.exibirInformacoes();
        carro.ligar();
        System.out.println("-----------------------------------");

        moto.exibirInformacoes();
        moto.ligar();
    }
}
