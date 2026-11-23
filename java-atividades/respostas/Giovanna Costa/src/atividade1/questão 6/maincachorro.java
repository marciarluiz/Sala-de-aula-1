public class maincachorro {

    public static void main(String[] args) {

        cachorro cachorro1 = new cachorro();
        cachorro cachorro2 = new cachorro();
        cachorro cachorro3 = new cachorro();

        cachorro1.nome = "Rex";
        cachorro1.raca = "Pastor Alemao";
        cachorro1.idade = 3;

        cachorro2.nome = "Thor";
        cachorro2.raca = "Golden Retriever";
        cachorro2.idade = 2;

        cachorro3.nome = "Luna";
        cachorro3.raca = "Poodle";
        cachorro3.idade = 4;

        cachorro1.exibirdados();
        cachorro1.latir();
        cachorro1.brincar();

        System.out.println();

        cachorro2.exibirdados();
        cachorro2.latir();
        cachorro2.brincar();

        System.out.println();

        cachorro3.exibirdados();
        cachorro3.latir();
        cachorro3.brincar();
    }
}