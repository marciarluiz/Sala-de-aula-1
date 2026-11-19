/**
 * Atividade 4 - Programação Orientada a Objetos (POO)
 * Classe que representa um produto em estoque.
 */
public class Produto {

    // Atributos do produto
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * Construtor para inicializar todos os dados do produto.
     *
     * @param nome       Nome ou descrição do produto
     * @param preco      Preço unitário do produto
     * @param quantidade Quantidade disponível em estoque
     */
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = Math.max(0.0, preco);
        this.quantidade = Math.max(0, quantidade);
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
        this.preco = Math.max(0.0, preco);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = Math.max(0, quantidade);
    }

    /**
     * Calcula o valor total deste produto presente em estoque.
     *
     * @return Valor monetário total (preço unitário * quantidade)
     */
    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    /**
     * Aplica um desconto percentual sobre o preço unitário do produto (Desafio).
     *
     * @param percentual Porcentagem de desconto (ex: 10.0 para 10%)
     */
    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.printf("[ERRO] Percentual de desconto inválido (%.2f%%). Deve estar entre 0%% e 100%%.%n", percentual);
            return;
        }

        double desconto = preco * (percentual / 100.0);
        preco -= desconto;
        System.out.printf("[DESCONTO] Desconto de %.1f%% aplicado ao produto '%s'. Novo preço: R$ %.2f%n",
                percentual, nome, preco);
    }

    /**
     * Exibe os detalhes completos do produto, incluindo o valor total em estoque.
     */
    public void exibirProduto() {
        System.out.println("----------------------------------------");
        System.out.printf("Produto       : %s%n", nome);
        System.out.printf("Preço Unitário: R$ %.2f%n", preco);
        System.out.printf("Quantidade    : %d unidades%n", quantidade);
        System.out.printf("Valor Total   : R$ %.2f%n", calcularValorEstoque());
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para teste da classe Produto.
     */
    public static void main(String[] args) {
        System.out.println("=== Gestão de Estoque - Produtos ===");

        // Cadastro de 3 produtos distintos
        Produto prod1 = new Produto("Notebook Dell Inspiron", 3500.00, 8);
        Produto prod2 = new Produto("Mouse Sem Fio Logitech", 120.00, 25);
        Produto prod3 = new Produto("Monitor Gamer 24'' 144Hz", 950.00, 12);

        // Exibição dos dados dos produtos cadastrados
        System.out.println("\n--- Produto 1 ---");
        prod1.exibirProduto();

        System.out.println("\n--- Produto 2 ---");
        prod2.exibirProduto();

        System.out.println("\n--- Produto 3 ---");
        prod3.exibirProduto();

        // Demonstração do método aplicarDesconto (Desafio)
        System.out.println("\n=== Teste de Aplicação de Desconto ===");
        System.out.printf("Preço anterior do %s: R$ %.2f%n", prod1.getNome(), prod1.getPreco());
        prod1.aplicarDesconto(15.0); // Aplica 15% de desconto
        prod1.exibirProduto();

        System.out.println("Tentativa de desconto inválido (ex: 150%):");
        prod2.aplicarDesconto(150.0); // Teste de validação
    }
}
