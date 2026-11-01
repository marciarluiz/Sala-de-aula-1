public class atividade12 {
    public static void main(String[] args) {
    Produto prod1 = new Produto();
    Produto prod2 = new Produto();

    prod1.nome = "Macarrão";
    prod1.preco = 12.3;
    prod1.quantidade = 30;

    prod2.nome = "Arroz";
    prod2.preco = 22.2;
    prod2.quantidade = 10;

    prod1.mostrarEstoque();
    prod1.adicionarEstoque(30);
    prod1.mostrarEstoque();

    prod2.mostrarEstoque();
    prod2.retirarEstoque(11);
    prod2.mostrarEstoque();
    }

}

class Produto{
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidadeAdd){
        System.out.println("foi adicionado mais produtos.");
        quantidade += quantidadeAdd;

    }

    void retirarEstoque(int quantidadeAdd){
        if(quantidadeAdd <= quantidade){
            System.out.println("foi removido alguns produtos.");
            quantidade -= quantidadeAdd;
        }else{
            System.out.println("Estoque insuficiente para essa operação.");
        }


    }

    void mostrarEstoque(){
        System.out.println("\nProduto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + quantidade);
    }


}



