public class Revista extends MaterialBiblioteca {
 private int edicao;

 public Revista(String titulo, int anoPublicacao, int edicao) {
 super(titulo, anoPublicacao);
 this.edicao = edicao;
    }

 @Override
 public int calcularPrazoEmprestimo() {
 return 7;
    }

 @Override
 public void exibirInformacoes() {
 System.out.println("=== REVISTA ===");
 super.exibirInformacoes();
 System.out.println("Edição: " + edicao);
 System.out.println("Prazo: " + calcularPrazoEmprestimo() + " dias");
    }
}
