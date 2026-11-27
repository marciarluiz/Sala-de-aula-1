public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    void abrirLivro() {
        System.out.println("Abrindo o livro " + titulo);
    }

    void fecharLivro() {
        System.out.println("Fechando o livro " + titulo);
    }

    void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println();
    }
}
