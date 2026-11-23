public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void exibirDados() {
        System.out.println("=== CACHORRO ===");
        super.exibirDados();
        System.out.println("Raça: " + raca);
    }
}