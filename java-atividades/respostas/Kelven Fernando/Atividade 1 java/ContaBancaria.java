/**
 * Atividade 1 - Programação Orientada a Objetos (POO)
 * Classe que representa uma conta bancária simples.
 */
public class ContaBancaria {

    // Atributos da conta bancária
    private String titular;
    private String numeroConta;
    private double saldo;

    /**
     * Construtor para inicializar a conta com titular, número e saldo inicial.
     *
     * @param titular      Nome do titular da conta
     * @param numeroConta  Número identificador da conta
     * @param saldoInicial Saldo com o qual a conta será iniciada
     */
    public ContaBancaria(String titular, String numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = Math.max(0.0, saldoInicial);
    }

    /**
     * Construtor padrão que inicializa a conta com saldo zerado.
     *
     * @param titular     Nome do titular da conta
     * @param numeroConta Número identificador da conta
     */
    public ContaBancaria(String titular, String numeroConta) {
        this(titular, numeroConta, 0.0);
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     * Realiza um depósito na conta, caso o valor seja positivo.
     *
     * @param valor Quantia a ser depositada
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso na conta %s.%n", valor, numeroConta);
        } else {
            System.out.println("Valor de depósito inválido! O valor deve ser positivo.");
        }
    }

    /**
     * Realiza um saque na conta, caso haja saldo suficiente e valor válido.
     *
     * @param valor Quantia a ser sacada
     * @return true se o saque foi realizado com sucesso, false caso contrário
     */
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido! O valor deve ser positivo.");
            return false;
        }

        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso na conta %s.%n", valor, numeroConta);
            return true;
        } else {
            System.out.printf("Saldo insuficiente para saque de R$ %.2f. Saldo atual: R$ %.2f%n", valor, saldo);
            return false;
        }
    }

    /**
     * Exibe os dados básicos e o saldo atual da conta.
     */
    public void exibirSaldo() {
        System.out.println("----------------------------------------");
        System.out.printf("Titular: %s%n", titular);
        System.out.printf("Número da Conta: %s%n", numeroConta);
        System.out.printf("Saldo Atual: R$ %.2f%n", saldo);
        System.out.println("----------------------------------------");
    }

    /**
     * Método principal para teste da classe ContaBancaria.
     */
    public static void main(String[] args) {
        System.out.println("=== Teste da Classe ContaBancaria ===");

        // Criação de um objeto ContaBancaria
        ContaBancaria conta = new ContaBancaria("Carlos Eduardo", "12345-6", 500.0);

        // Exibe o saldo inicial
        conta.exibirSaldo();

        // Realiza um depósito
        conta.depositar(250.0);
        conta.exibirSaldo();

        // Realiza um saque permitido
        conta.sacar(150.0);
        conta.exibirSaldo();

        // Tentativa de saque superior ao saldo disponível
        conta.sacar(1000.0);
        conta.exibirSaldo();
    }
}
