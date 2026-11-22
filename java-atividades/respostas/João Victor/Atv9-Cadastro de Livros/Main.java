
public class Main {
    public static void main(String[] args) {

        // Primeiro livro
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        // Segundo livro
        Livro livro2 = new Livro();
        livro2.titulo = "Capitães da Areia";
        livro2.autor = "Jorge Amado";
        livro2.numeroPaginas = 280;

        // Terceiro livro
        Livro livro3 = new Livro();
        livro3.titulo = "Harry Potter";
        livro3.autor = "J.K. Rowling";
        livro3.numeroPaginas = 320;

        // Exibindo os detalhes
        System.out.println("CADASTRO DE LIVROS");

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        // Testando abrir e fechar livros
        System.out.println("ABRINDO E FECHANDO LIVROS");

        livro1.abrirLivro();
        livro1.fecharLivro();

        livro2.abrirLivro();
        livro2.fecharLivro();

        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}
