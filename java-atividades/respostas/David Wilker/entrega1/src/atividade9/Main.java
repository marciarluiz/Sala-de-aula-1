package atividade9;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("Patinando no amor", "Lynn Painter", 416);
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96);

        livro1.abrirLivro();
        livro1.fecharLivro();
        livro1.mostrarDetalhes();
        livro2.abrirLivro();
        livro2.fecharLivro();
        livro2.mostrarDetalhes();
        livro3.abrirLivro();
        livro3.fecharLivro();
        livro3.mostrarDetalhes();
    }
}
