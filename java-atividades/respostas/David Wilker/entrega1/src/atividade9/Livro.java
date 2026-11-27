package atividade9;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    void abrirLivro() {
        System.out.println("O livro '" + titulo + "' foi aberto.");
    }

    void fecharLivro() {
        System.out.println("O livro '" + titulo + "' foi fechado.");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}
