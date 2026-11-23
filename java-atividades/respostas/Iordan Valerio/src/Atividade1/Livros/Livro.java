package Atividade1.Livros;

public class Livro {
    String titulo;
    String autor;
    int numeroPaginas;

    public void abrirLivro(){
        System.out.println("O livro foi aberto");
    }

    public void fecharLivro(){
        System.out.println("O livro foi fechado");
    }

    public void mostrarDetalhes(){
        System.out.println("\nDetalhes do livvro\n");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
    
}
