/**
 * Atividade 12 - Programação Orientada a Objetos (POO)
 * Classe para controle de estoque de produtos com validação de saldo não negativo.
 */
public class ProdutoEstoque {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * Construtor padrão.
     */
    public ProdutoEstoque() {
        this.quantidade = 0;
    }

    /**
     * Construtor completo.
     *
     * @param nome       Nome do produto
     * @param preco      Preço unitário do produto
     * @param quantidade Quantidade inicial em estoque (não negativa)
     */
    public ProdutoEstoque(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco >= 0 ? preco : 0.0;
        this.quantidade = quantidade >= 0 ? quantidade : 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("[Erro] O preço não pode ser negativo.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Adiciona unidades ao estoque do produto.
     *
     * @param qtd Quantidade a ser adicionada (deve ser positiva)
     */
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
            System.out.printf("[Entrada] +%d unidades adicionadas a \"%s\". Novo estoque: %d unidades.%n",
                    qtd, nome, this.quantidade);
        } else {
            System.out.println("[Erro] Quantidade a adicionar deve ser maior que zero!");
        }
    }

    /**
     * Retira unidades do estoque do produto.
     * Regra: A quantidade em estoque não pode ficar negativa.
     *
     * @param qtd Quantidade a ser retirada
     */
    public void retirarEstoque(int qtd) {
        if (qtd <= 0) {
            System.out.println("[Erro] Quantidade a retirar deve ser maior que zero!");
            return;
        }

        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
            System.out.printf("[Saída] -%d unidades retiradas de \"%s\". Estoque restante: %d unidades.%n",
                    qtd, nome, this.quantidade);
        } else {
            System.out.printf("[Aviso] Estoque insuficiente para \"%s\"! Tentativa de retirada: %d, Disponível: %d. A quantidade não pode ficar negativa.%n",
                    nome, qtd, this.quantidade);
        }
    }

    /**
     * Exibe as informações detalhadas do estoque e valor patrimonial total.
     */
    public void mostrarEstoque() {
        double valorTotal = this.preco * this.quantidade;
        System.out.println("----------------------------------------");
        System.out.printf("Produto       : %s%n", nome);
        System.out.printf("Preço Unitário: R$ %.2f%n", preco);
        System.out.printf("Quantidade    : %d unidades%n", quantidade);
        System.out.printf("Valor Total   : R$ %.2f%n", valorTotal);
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para teste da classe ProdutoEstoque.
     */
    public static void main(String[] args) {
        System.out.println("=== Atividade 12: Controle de Estoque de Produtos ===\n");

        // Criação de 2 objetos ProdutoEstoque
        ProdutoEstoque p1 = new ProdutoEstoque("Notebook Gamer", 4500.00, 10);
        ProdutoEstoque p2 = new ProdutoEstoque("Mouse Sem Fio", 89.90, 25);

        // Situação inicial
        System.out.println("--- Estoque Inicial ---");
        p1.mostrarEstoque();
        p2.mostrarEstoque();

        // Operações no Produto 1 (Notebook)
        System.out.println("\n--- Operações em Produto 1 (" + p1.getNome() + ") ---");
        p1.adicionarEstoque(5);       // Entrada de 5 unidades -> total 15
        p1.retirarEstoque(3);         // Saída de 3 unidades -> total 12
        p1.retirarEstoque(20);        // Tentativa de retirada excedente (teste de saldo negativo)

        // Operações no Produto 2 (Mouse)
        System.out.println("\n--- Operações em Produto 2 (" + p2.getNome() + ") ---");
        p2.adicionarEstoque(10);      // Entrada de 10 unidades -> total 35
        p2.retirarEstoque(35);        // Retirada exata -> total 0
        p2.retirarEstoque(1);         // Tentativa de retirada com estoque zerado

        // Situação final
        System.out.println("\n--- Estoque Final Atualizado ---");
        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}
