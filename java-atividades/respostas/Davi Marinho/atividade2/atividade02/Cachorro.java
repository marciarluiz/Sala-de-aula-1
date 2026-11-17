public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void exibirDados() {
        System.out.println("Animal: Cachorro | Nome: " + getNome() + " | Idade: " + getIdade() + " ano(s) | Raça: " + raca);
    }
}
