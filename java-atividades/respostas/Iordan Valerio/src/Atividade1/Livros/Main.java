package Atividade1.Livros;

public class Main {
    public static void main(String[] args) {

        // Criação do PRIMEIRO objeto da classe Livro
        Livro livro1 = new Livro();

        livro1.titulo = "Noites Brancas";
        livro1.autor = "Fiódor Dostoiévsk";
        livro1.numeroPaginas = 96;
        livro1.abrirLivro();
        livro1.fecharLivro();
        livro1.mostrarDetalhes();

        Livro livro2 = new Livro();

        livro2.titulo = "O Estrangeiro";
        livro2.autor = "Albert Camus";
        livro2.numeroPaginas = 128;
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro2.mostrarDetalhes();
    }
}