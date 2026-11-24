public class Livro extends MaterialBiblioteca {
 private String autor;

 public Livro(String titulo, int anoPublicacao, String autor) {
 super(titulo, anoPublicacao);
 this.autor = autor;
    }

 @Override
 public int calcularPrazoEmprestimo() {
 return 14;
    }

 @Override
 public void exibirInformacoes() {
 System.out.println("=== LIVRO ===");
 super.exibirInformacoes();
 System.out.println("Autor: " + autor);
 System.out.println("Prazo: " + calcularPrazoEmprestimo() + " dias");
    }
}
