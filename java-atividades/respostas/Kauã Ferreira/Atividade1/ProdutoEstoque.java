/**
 * ATIVIDADE 12 - CONTROLE DE ESTOQUE
 * REGRA: O ESTOQUE NUNCA PODE FICAR NEGATIVO 
 * ProdutoEstoque
 */

public class ProdutoEstoque {
    //Atributos
    String nome; 
    double preco;
    int quantidade;

    //Entrada de mercadoria - somente quatidade positiva 
    void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidade +=quantidade;
            System.out.println(quantidade + " unidade(s) de " + nome + " adicionada(s).");
        }else{
            System.out.println("Quantidade inválida para entrada.");
        }
    }
    //Saida de mercadoria: bloqueia se não houver estoque suficiente
    void retiradaEstoque(int quantidade){
        if(quantidade <= 0){
            System.out.println("Quantidade inválida para saída.");
        }else if (quantidade > this.quantidade){
            System.out.println("Estoque insuficiente de " + nome + ". Disponível: "+ this.quantidade);
        }else{
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidade(s) de " + nome + " retirada(s).");
        }
    }
    void mostraEstoque(){
        System.out.println("Produto: "+ nome + " | Preço: " + String.format("%.2f", preco) + " | Estoque: " + quantidade);
    }

    public static void main(String[] args){
        ProdutoEstoque p1 = new ProdutoEstoque();
        p1.nome = "Caderno";
        p1.preco = 18.90;
        p1.quantidade = 20; 


        ProdutoEstoque p2 = new ProdutoEstoque();
        p2.nome = "Caneta";
        p2.preco = 3.59;
        p2.quantidade = 50;
        
        p1.adicionarEstoque(80);
        p1.retiradaEstoque(10);
        p1.retiradaEstoque(100); //bloqueia

        System.out.println();

        p2.retiradaEstoque(50);
        p2.retiradaEstoque(1);
        p2.adicionarEstoque(40);
        p2.mostraEstoque();
    }

}
