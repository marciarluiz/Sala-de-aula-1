public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;

    void abrirLivro() {
        System.out.println("Você abriu o livro \"" + titulo + "\".");
    }

    void fecharLivro() {
        System.out.println("Você fechou o livro \"" + titulo + "\".");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);

    }
}