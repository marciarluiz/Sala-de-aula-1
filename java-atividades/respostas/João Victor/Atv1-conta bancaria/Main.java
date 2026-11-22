
public class Main {
    public static void main(String[] args) {

        // Criando o objeto
        ContaBancaria conta1 = new ContaBancaria();

        // Definindo os atributos
        conta1.titular = "João Victor";
        conta1.numeroConta = 2026220108;
        conta1.saldo = 1000;

        // Exibindo saldo inicial
        conta1.exibirSaldo();

        // Realizando depósito
        conta1.depositar(200);

        // Realizando saque
        conta1.sacar(100);

        // Exibindo saldo atualizado
        conta1.exibirSaldo();
    }
}

