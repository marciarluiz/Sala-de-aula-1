public class mainlivro {

    public static void main(String[] args) {

        livro livro1 = new livro();
        livro livro2 = new livro();
        livro livro3 = new livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeropaginas = 256;

        livro2.titulo = "O Pequeno Principe";
        livro2.autor = "Antoine de Saint-Exupery";
        livro2.numeropaginas = 96;

        livro3.titulo = "Harry Potter";
        livro3.autor = "J. K. Rowling";
        livro3.numeropaginas = 300;

        livro1.mostradetalhes();
        livro1.abrirlivro();
        livro1.fecharlivro();

        System.out.println();

        livro2.mostradetalhes();
        livro2.abrirlivro();
        livro2.fecharlivro();

        System.out.println();

        livro3.mostradetalhes();
        livro3.abrirlivro();
        livro3.fecharlivro();
    }
}