
    
public class MainLivro {

    public static void main(String[] args) {

        // Primeiro livro
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        // Segundo livro
        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Príncipe";
        livro2.autor = "Antoine de Saint-Exupéry";
        livro2.numeroPaginas = 96;

        // Terceiro livro
        Livro livro3 = new Livro();
        livro3.titulo = "Harry Potter";
        livro3.autor = "J. K. Rowling";
        livro3.numeroPaginas = 264;

        // Abrir os livros
        livro1.abrirLivro();
        livro2.abrirLivro();

        // Fechar um livro
        livro2.fecharLivro();

        // Mostrar detalhes
        System.out.println("\n=== LIVRO 1 ===");
        livro1.mostrarDetalhes();

        System.out.println("\n=== LIVRO 2 ===");
        livro2.mostrarDetalhes();

        System.out.println("\n=== LIVRO 3 ===");
        livro3.mostrarDetalhes();

        // Fechar os outros livros
        livro1.fecharLivro();
        livro3.fecharLivro();
    }
}

