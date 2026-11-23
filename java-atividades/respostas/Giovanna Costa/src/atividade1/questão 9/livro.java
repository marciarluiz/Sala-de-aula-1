public class livro {

    String titulo;
    String autor;
    int numeropaginas;
    boolean aberto = false;

    public void abrirlivro() {
        aberto = true;
        System.out.println(titulo + " foi aberto.");
    }

    public void fecharlivro() {
        aberto = false;
        System.out.println(titulo + " foi fechado.");
    }

    public void mostradetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeropaginas);
        System.out.println("Aberto: " + aberto);
    }
}