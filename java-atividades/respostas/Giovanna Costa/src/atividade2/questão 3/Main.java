public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2024, 4);
        Moto moto = new Moto("Honda", "CG 160", 2023, 160);

        carro.exibirInformacoes();
        carro.ligar();

        System.out.println();

        moto.exibirInformacoes();
        moto.ligar();
    }
}