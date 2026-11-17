public class Revista extends MaterialBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 7;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Revista: " + getTitulo() + " | Edição: " + edicao + " | Ano: " + getAnoPublicacao() + " | Prazo de Empréstimo: " + calcularPrazoEmprestimo() + " dias");
    }
}
