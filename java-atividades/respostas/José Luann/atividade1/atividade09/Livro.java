public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean aberto;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void abrirLivro() {
        if (aberto) {
            System.out.println("\"" + titulo + "\" já está aberto.");
        } else {
            aberto = true;
            System.out.println("Você abriu \"" + titulo + "\".");
        }
    }

    public void fecharLivro() {
        if (!aberto) {
            System.out.println("\"" + titulo + "\" já está fechado.");
        } else {
            aberto = false;
            System.out.println("Você fechou \"" + titulo + "\".");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor
                + " | Páginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro l2 = new Livro("Clean Code", "Robert C. Martin", 464);
        Livro l3 = new Livro("O Hobbit", "J. R. R. Tolkien", 310);

        l1.mostrarDetalhes();
        l2.mostrarDetalhes();
        l3.mostrarDetalhes();

        l1.abrirLivro();
        l1.abrirLivro();
        l1.fecharLivro();
        l2.abrirLivro();
        l2.fecharLivro();
    }
}
