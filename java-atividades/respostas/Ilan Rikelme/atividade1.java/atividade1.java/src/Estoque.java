public class Estoque {
    //Atributos//
    String nome;
    double preço;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }
    void retirarEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade = this.quantidade - quantidade;
            System.out.println("Estoque Atualizado.");
        }else{
            System.out.println("Estoque insuficiente!");
        }
    }
    void mostrarEstoque() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preço);
        System.out.println("Quantidade: " + quantidade);

    }
    }
