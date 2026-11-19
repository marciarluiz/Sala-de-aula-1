/**
 * Atividade 9 - Programação Orientada a Objetos (POO)
 * Classe que representa um Livro com atributos básicos e ações de leitura.
 */
public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean aberto;

    /**
     * Construtor padrão.
     */
    public Livro() {
        this.aberto = false;
    }

    /**
     * Construtor com parâmetros para inicializar o livro.
     *
     * @param titulo        Título da obra
     * @param autor         Nome do autor
     * @param numeroPaginas Total de páginas do livro
     */
    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.aberto = false;
    }

    // Getters e Setters
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
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    /**
     * Abre o livro para leitura.
     */
    public void abrirLivro() {
        if (this.aberto) {
            System.out.println("O livro \"" + titulo + "\" já está aberto.");
        } else {
            this.aberto = true;
            System.out.println("Você abriu o livro \"" + titulo + "\". Boa leitura!");
        }
    }

    /**
     * Fecha o livro.
     */
    public void fecharLivro() {
        if (!this.aberto) {
            System.out.println("O livro \"" + titulo + "\" já está fechado.");
        } else {
            this.aberto = false;
            System.out.println("Você fechou o livro \"" + titulo + "\".");
        }
    }

    /**
     * Exibe os detalhes cadastrais do livro.
     */
    public void mostrarDetalhes() {
        System.out.println("----------------------------------------");
        System.out.println("Título           : " + titulo);
        System.out.println("Autor            : " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Estado Atual     : " + (aberto ? "Aberto" : "Fechado"));
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para teste da classe Livro.
     */
    public static void main(String[] args) {
        System.out.println("=== Atividade 9: Demonstração da Classe Livro ===\n");

        // Criação de 3 objetos com dados distintos
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96);
        Livro livro3 = new Livro("1984", "George Orwell", 336);

        // Exibição dos detalhes de cada um
        System.out.println("--- Detalhes dos Livros Cadastrados ---");
        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        // Demonstração das ações de abrir e fechar
        System.out.println("\n--- Ações com Livro 1 (\"" + livro1.getTitulo() + "\") ---");
        livro1.abrirLivro();
        livro1.abrirLivro(); // Teste de repetição
        livro1.fecharLivro();
        livro1.fecharLivro(); // Teste de repetição

        System.out.println("\n--- Ações com Livro 2 (\"" + livro2.getTitulo() + "\") ---");
        livro2.abrirLivro();
        livro2.mostrarDetalhes();

        System.out.println("\n--- Ações com Livro 3 (\"" + livro3.getTitulo() + "\") ---");
        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}
