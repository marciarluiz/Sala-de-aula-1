public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        Livro livro2 = new Livro();
        livro2.titulo = "Vidas Secas";
        livro2.autor = "Graciliano Ramos";
        livro2.numeroPaginas = 176;

        Livro livro3 = new Livro();
        livro3.titulo = "O Cortico";
        livro3.autor = "Aluisio Azevedo";
        livro3.numeroPaginas = 300;

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        livro1.abrirLivro();
        livro1.fecharLivro();
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro3.abrirLivro();
        livro3.fecharLivro();
    }
}
