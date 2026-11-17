public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void abrirLivro() {
        System.out.println("O livro \"" + titulo + "\" foi aberto.");
    }

    void fecharLivro() {
        System.out.println("O livro \"" + titulo + "\" foi fechado.");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "Código Limpo";
        livro2.autor = "Robert C. Martin";
        livro2.numeroPaginas = 425;

        Livro livro3 = new Livro();
        livro3.titulo = "O Senhor dos Anéis";
        livro3.autor = "J.R.R. Tolkien";
        livro3.numeroPaginas = 1200;

        livro1.mostrarDetalhes();
        livro1.abrirLivro();
        livro1.fecharLivro();
        System.out.println("-----------------------------------");

        livro2.mostrarDetalhes();
        livro2.abrirLivro();
        livro2.fecharLivro();
        System.out.println("-----------------------------------");

        livro3.mostrarDetalhes();
        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}
