/**
 * ATIVIDADE 9 - CADASTRO DE LIVROS
 * Livro
 */

public class Livro {
    //Atributos 
    String titulo;
    String autor;
    int numeroPaginas;
    boolean aberto; //controla se o livro está aberto

    void abrirLivro(){
        if(aberto){
            System.out.println("\"" + titulo + "\" já está aberto.");
        }else{
            aberto = true;
            System.out.println("Você abriu \"" + titulo + "\".");
        }
    }
    void fecharLivro(){
        if(!aberto){
            System.out.println("\"" + titulo + "\" já está fechado.");
        }else{
            aberto = false;
            System.out.println("Você fechou \"" + titulo + "\".");
        }
    }
    void mostraDetalhes(){
        System.out.println("Titulo: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }
    public static void main(String[] args){
        Livro l1 = new Livro();
        l1.titulo = "Quarto de Despejo";
        l1.autor = "Carolina Maria de Jesus";
        l1.numeroPaginas = 182;

        Livro l2 = new Livro();
        l2.titulo = "Dom Casmurro";
        l2.autor = "Machado de Assis";
        l2.numeroPaginas = 256;

        Livro l3 = new Livro();
        l3.titulo = "Capitães de Areia";
        l3.autor = "Jorge Amado";
        l3.numeroPaginas = 280;

        l1.mostraDetalhes();
        l2.mostraDetalhes();
        l3.mostraDetalhes();

        System.out.println();
        l1.abrirLivro();
        l1.fecharLivro();
        l2.abrirLivro();
        l3.fecharLivro();//já está fechado
    }
}
