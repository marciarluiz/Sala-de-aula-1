public class Livro {

    String titulo;
    String autor;
    int numeroPaginas;

    void abrirLivro() {
        System.out.println("O livro " + titulo + " foi aberto.");
    }

    void fecharLivro() {
        System.out.println("O livro " + titulo + " foi fechado.");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "O Cortiço";
        livro2.autor = "Aluísio Azevedo";
        livro2.numeroPaginas = 280;

        Livro livro3 = new Livro();
        livro3.titulo = "Capitães da Areia";
        livro3.autor = "Jorge Amado";
        livro3.numeroPaginas = 280;

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        livro1.abrirLivro();
        livro1.fecharLivro();
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}
