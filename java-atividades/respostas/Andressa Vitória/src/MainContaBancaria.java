public class MainContaBancaria {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Andresa Araújo";
        conta1.numeroConta = "2026236";
        conta1.saldo = 500.00;

        conta1.exibirSaldo();
        conta1.depositar(100);
        conta1.sacar(56);
        conta1.sacar(1000);
        conta1.exibirSaldo();

    }
}
