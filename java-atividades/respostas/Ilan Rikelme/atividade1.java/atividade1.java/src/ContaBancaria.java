public class ContaBancaria {
//Atributos//
    String titular;
    int numeroConta;
    double saldo;
//Metodos//
    void depositar(double valor) {
        saldo = saldo + valor;
    }
    void sacar(double valor1) {
        if (valor1 > 0 && valor1 <= saldo) {
            saldo = saldo - valor1;
        } else {
            System.out.println("erro"); 
        }

    } void exibirSaldo() {
        System.out.println(saldo);

    }
        }