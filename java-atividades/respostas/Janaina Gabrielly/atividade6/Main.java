public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Thor";
        c1.raca = "Labrador";
        c1.idade = 3;

        Cachorro c2 = new Cachorro();
        c2.nome = "Mel";
        c2.raca = "Poodle";
        c2.idade = 5;

        Cachorro c3 = new Cachorro();
        c3.nome = "Caramelo";
        c3.raca = "Vira-lata";
        c3.idade = 2;

        c1.exibirDados();
        c1.latir();
        c1.brincar();
        System.out.println();

        c2.exibirDados();
        c2.latir();
        c2.brincar();
        System.out.println();

        c3.exibirDados();
        c3.latir();
        c3.brincar();
    }
}
