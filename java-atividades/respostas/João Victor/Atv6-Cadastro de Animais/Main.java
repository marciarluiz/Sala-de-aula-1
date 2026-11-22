public class Main {
    public static void main(String[] args) {

        // Primeiro cachorro
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Panqueca";
        cachorro1.raca = "Vira-Lata";
        cachorro1.idade = 2;

        // Segundo cachorro
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Belinha";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 2;

        // Terceiro cachorro
        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Zeus";
        cachorro3.raca = "Golden Retriever";
        cachorro3.idade = 5;

        // Primeiro cachorro
        System.out.println("PRIMEIRO CACHORRO");
        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();

        // Segundo cachorro
        System.out.println("\nSEGUNDO CACHORRO");
        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();

        // Terceiro cachorro
        System.out.println("\nTERCEIRO CACHORRO");
        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();
    }
}
