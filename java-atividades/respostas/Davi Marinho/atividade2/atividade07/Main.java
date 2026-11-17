public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", 1899, "Machado de Assis");
        Livro livro2 = new Livro("Código Limpo", 2008, "Robert C. Martin");

        Revista revista1 = new Revista("Superinteressante", 2025, 450);
        Revista revista2 = new Revista("Pesquisa FAPESP", 2026, 338);

        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        System.out.println("-----------------------------------");
        revista1.exibirInformacoes();
        revista2.exibirInformacoes();
    }
}
