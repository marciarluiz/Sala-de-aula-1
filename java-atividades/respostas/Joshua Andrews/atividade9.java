
public class atividade9 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        livro2.titulo = "O Pequeno Principe";
        livro2.autor = "Antoine de Saint-Exupery";
        livro2.numeroPaginas = 96;

        livro3.titulo = "1984";
        livro3.autor = "George Orwell";
        livro3.numeroPaginas = 328;

        livro1.mostrarDetalhes();
        livro1.abrirLivro();
        livro1.fecharLivro();

        livro2.mostrarDetalhes();
        livro2.abrirLivro();
        livro2.abrirLivro();

        livro3.mostrarDetalhes();
        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}

class Livro {
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    void abrirLivro() {
        if (aberto == false) {
            System.out.println("O livro foi aberto.");
            aberto = true;
        } else {
            System.out.println("O livro ja esta aberto.");
        }
    }

    void fecharLivro() {
        if (aberto == true) {
            System.out.println("O livro foi fechado.");
            aberto = false;
        } else {
            System.out.println("O livro ja esta fechado.");
        }
    }

    void mostrarDetalhes() {
        System.out.println("\nTitulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);

        if (aberto == true) {
            System.out.println("Estado: Aberto");
        } else {
            System.out.println("Estado: Fechado");
        }
    }
}
