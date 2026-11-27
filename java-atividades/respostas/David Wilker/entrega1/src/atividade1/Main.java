package atividade1;

public class Main {
    public static void main(String[] args) {

        //Cria o objeto de classe
        ContaBancaria conta1 = new ContaBancaria();

        //atribuir os valores
        conta1.titular = "Carlos";
        conta1.numeroConta = 1001;
        conta1.saldo = 500.00;

        //Teste das funções
        conta1.exibirSaldo();
        conta1.depositar(250.00);
        conta1.sacar(300.00);
        conta1.exibirSaldo();
    }
}
