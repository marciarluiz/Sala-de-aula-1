public class ContaBancaria {

    String titular;
    String numeroConta;
    double saldo;

    void depositar(double deposito){
        saldo = saldo + deposito;
    System.out.println("Deposito realizado com sucesso! O novo saldo é: R$" + saldo);

    }

    void sacar(double saque) {
        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso! O novo saldo é: R$" + saldo);
        } else{
            System.out.println("Saldo indisponível! Não foi possível concluir o saque.");
        }
    }

    void exibirSaldo(){
    System.out.println("Olá " + titular + " portador da conta número: " + numeroConta + " seu saldo atual é: R$" + saldo);
    }
}
