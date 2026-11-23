package Resposta9;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 336);
        Livro livro3 = new Livro("Código Limpo", "Robert C. Martin", 425);

        livro1.mostrarDetalhes();
        livro1.abrirLivro();
        livro1.fecharLivro();

        System.out.println();

        livro2.mostrarDetalhes();
        livro2.abrirLivro();

        System.out.println();

        livro3.mostrarDetalhes();
        livro3.fecharLivro();
    }
}
