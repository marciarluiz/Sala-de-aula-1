class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    void abrirLivro() {
        if (aberto) {
            System.out.println("\"" + titulo + "\" já está aberto.");
        } else {
            aberto = true;
            System.out.println("\"" + titulo + "\" foi aberto.");
        }
    }

    void fecharLivro() {
        if (!aberto) {
            System.out.println("\"" + titulo + "\" já está fechado.");
        } else {
            aberto = false;
            System.out.println("\"" + titulo + "\" foi fechado.");
        }
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }
}

public class Atividade09 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "Dom Casmurro";
        l1.autor = "Machado de Assis";
        l1.numeroPaginas = 256;

        Livro l2 = new Livro();
        l2.titulo = "O Cortiço";
        l2.autor = "Aluísio Azevedo";
        l2.numeroPaginas = 312;

        Livro l3 = new Livro();
        l3.titulo = "Capitães da Areia";
        l3.autor = "Jorge Amado";
        l3.numeroPaginas = 280;

        l1.mostrarDetalhes();
        l2.mostrarDetalhes();
        l3.mostrarDetalhes();

        System.out.println();
        l1.abrirLivro();
        l1.fecharLivro();
        l2.abrirLivro();
        l3.fecharLivro();
    }
}