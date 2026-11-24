public class MaterialBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public MaterialBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public int calcularPrazoEmprestimo() {
        return 0;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Prazo de empréstimo: " + calcularPrazoEmprestimo() + " dias");
    }
}
