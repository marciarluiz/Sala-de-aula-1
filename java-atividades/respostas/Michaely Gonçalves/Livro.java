
public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    void abrirLivro() {
        aberto = true;
        System.out.println("Livro aberto.");
    }

    void fecharLivro() {
        aberto = false;
        System.out.println("Livro fechado.");
    }

    void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        Livro l3 = new Livro();

        l1.titulo = "Dom Casmurro";
        l1.autor = "Machado de Assis";
        l1.numeroPaginas = 256;

        l2.titulo = "O Pequeno Principe";
        l2.autor = "Antoine de Saint-Exupery";
        l2.numeroPaginas = 96;

        l3.titulo = "A Hora da Estrela";
        l3.autor = "Clarice Lispector";
        l3.numeroPaginas = 88;

        l1.mostrarDetalhes();
        l1.abrirLivro();
        l1.fecharLivro();

        l2.mostrarDetalhes();
        l2.abrirLivro();
        l2.fecharLivro();

        l3.mostrarDetalhes();
        l3.abrirLivro();
        l3.fecharLivro();
    }
}
