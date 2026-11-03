public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setNumeroPaginas(256);

        Livro livro2 = new Livro();
        livro2.setTitulo("O Pequeno Príncipe");
        livro2.setAutor("Antoine de Saint-Exupéry");
        livro2.setNumeroPaginas(96);

        Livro livro3 = new Livro();
        livro3.setTitulo("1984");
        livro3.setAutor("George Orwell");
        livro3.setNumeroPaginas(416);

        System.out.println("=== Livros cadastrados ===");
        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        System.out.println("=== Abrindo os livros ===");
        livro1.abrirLivro();
        livro2.abrirLivro();
        livro3.abrirLivro();

        System.out.println("\n=== Tentando abrir o livro 1 novamente ===");
        livro1.abrirLivro();

        System.out.println("\n=== Situação atual ===");
        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        System.out.println("=== Fechando os livros ===");
        livro1.fecharLivro();
        livro2.fecharLivro();
        livro3.fecharLivro();

        System.out.println("\n=== Tentando fechar o livro 3 novamente ===");
        livro3.fecharLivro();
    }
}