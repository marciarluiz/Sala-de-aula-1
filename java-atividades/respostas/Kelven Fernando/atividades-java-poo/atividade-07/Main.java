public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 1899, "Machado de Assis");
        Livro livro2 = new Livro("Capitães da Areia", 1937, "Jorge Amado");
        Revista revista1 = new Revista("Superinteressante", 2025, 462);
        Revista revista2 = new Revista("Ciência Hoje", 2024, 389);

        System.out.println("=== Livros ===");
        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();

        System.out.println();
        System.out.println("=== Revistas ===");
        revista1.exibirInformacoes();
        System.out.println();
        revista2.exibirInformacoes();
    }
}
