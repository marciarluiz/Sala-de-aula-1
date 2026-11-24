public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    // Abre o livro
    void abrirLivro() {
        aberto = true;
        System.out.println(titulo + " foi aberto.");
    }

    // Fecha o livro
    void fecharLivro() {
        aberto = false;
        System.out.println(titulo + " foi fechado.");
    }

    // Mostra os detalhes
    void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numeroPaginas);
        System.out.println("Aberto: " + aberto);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "O Pequeno Principe";
        livro2.autor = "Antoine de Saint-Exupery";
        livro2.numeroPaginas = 96;

        Livro livro3 = new Livro();
        livro3.titulo = "A Hora da Estrela";
        livro3.autor = "Clarice Lispector";
        livro3.numeroPaginas = 88;

        livro1.mostrarDetalhes();
        livro1.abrirLivro();
        livro1.fecharLivro();

        livro2.mostrarDetalhes();
        livro2.abrirLivro();
        livro2.fecharLivro();

        livro3.mostrarDetalhes();
        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}