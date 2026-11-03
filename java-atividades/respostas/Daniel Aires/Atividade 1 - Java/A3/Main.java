public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2022);

        Carro carro2 = new Carro();
        carro2.setMarca("Volkswagen");
        carro2.setModelo("Gol");
        carro2.setAno(2018);

        System.out.println("=== Estado inicial ===");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

        System.out.println("=== Ligando os carros ===");
        carro1.ligar();
        carro2.ligar();

        System.out.println("\n=== Tentando ligar o carro 1 novamente (desafio) ===");
        carro1.ligar();

        System.out.println("\n=== Situação atual ===");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

        System.out.println("=== Desligando os carros ===");
        carro1.desligar();
        carro2.desligar();

        System.out.println("\n=== Tentando desligar o carro 2 novamente ===");
        carro2.desligar();

        System.out.println("\n=== Situação final ===");
        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
    }
}