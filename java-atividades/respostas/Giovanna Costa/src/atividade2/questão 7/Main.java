public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 1899, "Machado de Assis");
        Livro livro2 = new Livro("O Hobbit", 1937, "J. R. R. Tolkien");

        Revista revista1 = new Revista("Ciência Hoje", 2024, 350);
        Revista revista2 = new Revista("Superinteressante", 2025, 480);

        livro1.exibirInformacoes();
        System.out.println();

        livro2.exibirInformacoes();
        System.out.println();

        revista1.exibirInformacoes();
        System.out.println();

        revista2.exibirInformacoes();
    }
}