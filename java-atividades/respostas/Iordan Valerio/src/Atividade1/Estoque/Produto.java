package Atividade1.Estoque;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
           this.quantidade += quantidade;
        } else{
            System.out.println("Informe uma quantidade válida");
        }
    
    }
    public void retirarEstoque(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
        }else{
            System.out.println("Informe uma quantidade válide");
        }

    }
    public void mostrarEstoque(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
