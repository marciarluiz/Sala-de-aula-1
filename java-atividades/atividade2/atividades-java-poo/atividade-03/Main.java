public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CG 160", 2023, 160);

        System.out.println("=== Carro ===");
        carro.exibirInformacoes();
        carro.ligar();

        System.out.println();
        System.out.println("=== Moto ===");
        moto.exibirInformacoes();
        moto.ligar();
    }
}
