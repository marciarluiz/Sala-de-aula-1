
public class Livro {

    // Atributos
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto;

    // Métodos
    void abrirLivro() {
        aberto = true;
        System.out.println("O livro foi aberto!");
    }

    void fecharLivro() {
        aberto = false;
        System.out.println("O livro foi fechado!");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);

        if (aberto == true) {
            System.out.println("Estado: Aberto");
        } else {
            System.out.println("Estado: Fechado");
        }

        System.out.println("--------------------");
    }
}

