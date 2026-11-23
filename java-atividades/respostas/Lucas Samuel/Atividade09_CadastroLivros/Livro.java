public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.aberto = false;
    }

    void abrirLivro() {
        if (aberto) {
            System.out.println("O livro \"" + titulo + "\" já está aberto.");
        } else {
            aberto = true;
            System.out.println("Você abriu o livro \"" + titulo + "\".");
        }
    }

    void fecharLivro() {
        if (!aberto) {
            System.out.println("O livro \"" + titulo + "\" já está fechado.");
        } else {
            aberto = false;
            System.out.println("Você fechou o livro \"" + titulo + "\".");
        }
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 310);
        Livro livro3 = new Livro("Clean Code", "Robert C. Martin", 464);

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();
        System.out.println();

        livro1.abrirLivro();
        livro1.abrirLivro(); // já aberto
        livro1.fecharLivro();
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro3.fecharLivro(); // já fechado
    }
}
