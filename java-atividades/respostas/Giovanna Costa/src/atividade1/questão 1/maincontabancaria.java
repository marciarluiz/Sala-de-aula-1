public class maincontabancaria {

    public static void main(String[] args) {

        contabancaria conta1 = new contabancaria();

        conta1.titular = "Maria";
        conta1.numeroconta = 12345;
        conta1.saldo = 500;

        conta1.exibirsaldo();

        conta1.depositar(200);
        conta1.sacar(100);

        System.out.println("\nSaldo atualizado:");
        conta1.exibirsaldo();
    }
}