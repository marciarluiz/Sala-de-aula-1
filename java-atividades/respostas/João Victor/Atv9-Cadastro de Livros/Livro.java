public class Livro {

    // Atributos
    String titulo;
    String autor;
    int numeroPaginas;

    // Método para abrir o livro
    public void abrirLivro() {
        System.out.println("O livro " + titulo + " foi aberto!");
    }

    // Método para fechar o livro
    public void fecharLivro() {
        System.out.println("O livro " + titulo + " foi fechado!");
    }

    // Método para mostrar detalhes
    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("-------------------------");
    }
}
