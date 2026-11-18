public class Revista extends MaterialBiblioteca {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() { return edicao; }

    @Override
    public int calcularPrazoEmprestimo() {
        return 7;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Edição: " + edicao);
    }
}
