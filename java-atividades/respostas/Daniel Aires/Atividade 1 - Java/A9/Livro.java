public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean aberto;

    // Construtor padrão (o livro começa fechado)
    public Livro() {
        this.aberto = false;
    }

    // Getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas > 0) {
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("Número de páginas inválido.");
        }
    }

    public boolean isAberto() {
        return aberto;
    }

    // Métodos
    public void abrirLivro() {
        if (aberto) {
            System.out.println("\"" + titulo + "\": o livro já está aberto.");
        } else {
            aberto = true;
            System.out.println("\"" + titulo + "\": livro aberto.");
        }
    }

    public void fecharLivro() {
        if (!aberto) {
            System.out.println("\"" + titulo + "\": o livro já está fechado.");
        } else {
            aberto = false;
            System.out.println("\"" + titulo + "\": livro fechado.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Situação: " + (aberto ? "Aberto" : "Fechado"));
        System.out.println("-----------------------------");
    }
}