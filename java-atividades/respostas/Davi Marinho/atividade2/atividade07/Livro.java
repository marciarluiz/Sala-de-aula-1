public class Livro extends MaterialBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 14;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Livro: " + getTitulo() + " | Autor: " + autor + " | Ano: " + getAnoPublicacao() + " | Prazo de Empréstimo: " + calcularPrazoEmprestimo() + " dias");
    }
}
