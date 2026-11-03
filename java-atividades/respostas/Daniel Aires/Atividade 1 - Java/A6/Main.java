public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Rex");
        cachorro1.setRaca("Pastor Alemão");
        cachorro1.setIdade(5);

        Cachorro cachorro2 = new Cachorro();
        cachorro2.setNome("Mel");
        cachorro2.setRaca("Golden Retriever");
        cachorro2.setIdade(3);

        Cachorro cachorro3 = new Cachorro();
        cachorro3.setNome("Thor");
        cachorro3.setRaca("Bulldog");
        cachorro3.setIdade(1);

        System.out.println("=== Executando os métodos ===");
        cachorro1.latir();
        cachorro1.brincar();
        cachorro2.latir();
        cachorro2.brincar();
        cachorro3.latir();
        cachorro3.brincar();

        System.out.println("\n=== Dados dos cachorros ===");
        cachorro1.exibirDados();
        cachorro2.exibirDados();
        cachorro3.exibirDados();
    }
}