///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean aberto;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.aberto = false;
    }

    public void abrirLivro() {
        if (aberto) {
            System.out.println("\"" + titulo + "\" já está aberto.");
        } else {
            aberto = true;
            System.out.println("\"" + titulo + "\" foi aberto.");
        }
    }

    public void fecharLivro() {
        if (!aberto) {
            System.out.println("\"" + titulo + "\" já está fechado.");
        } else {
            aberto = false;
            System.out.println("\"" + titulo + "\" foi fechado.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Estado: " + (aberto ? "aberto" : "fechado"));
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo", 208);
        Livro livro3 = new Livro("Capitães da Areia", "Jorge Amado", 280);

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        livro1.abrirLivro();
        livro1.mostrarDetalhes();
        livro1.fecharLivro();
        livro2.abrirLivro();
        livro2.abrirLivro();
        livro2.fecharLivro();
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////