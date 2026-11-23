package Resposta9;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto = false;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    void abrirLivro() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro \"" + titulo + "\" foi aberto.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está aberto.");
        }
    }

    void fecharLivro() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro \"" + titulo + "\" foi fechado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está fechado.");
        }
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Status: " + (aberto ? "Aberto" : "Fechado"));
    }
}