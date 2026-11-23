public class contabancaria {

    String titular;
    int numeroconta;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }

    public void exibirsaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroconta);
        System.out.println("Saldo: R$ " + saldo);
    }
}