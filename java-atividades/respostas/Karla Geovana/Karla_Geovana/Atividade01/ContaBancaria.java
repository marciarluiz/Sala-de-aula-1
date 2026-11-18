public class ContaBancaria {

    
    String titular;
    int numeroConta;
    double saldo;

    
    void depositar(double valor) {
        saldo = saldo + valor; 
    }

    void sacar(double valor) {
        if (valor <= saldo) {          
            saldo = saldo - valor;     
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(); 

        conta1.titular = "Geovana";   
        conta1.numeroConta = 567;
        conta1.saldo = 500;

        conta1.depositar(1000); 
        conta1.sacar(200);      
        conta1.exibirSaldo();   
    }
}
