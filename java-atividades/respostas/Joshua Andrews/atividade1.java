import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "João";
        conta1.numeroConta = 209;
        conta1.saldo = 100;

        while (true){
            System.out.println("Operação que deseja realizar: ");
            System.out.println("1 - Depositar: ");
            System.out.println("2 - Sacar: ");
            System.out.println("3 - exibir saldo: ");
            System.out.println("4 - Sair: ");

            Scanner entrada = new Scanner(System.in);
            int op = entrada.nextInt();

            if (op == 1){
                conta1.depositar();
            }else if(op == 2){
                conta1.sacar();
            }else if(op== 3){
                conta1.exibirSaldo();
            }else if(op == 4){
                System.out.println("volte sempre: ");
                break;
            }else{
                System.out.println("Valor invalido, por favor, repita a operação. ");
            }


        }
        //conta1.depositar();
        //conta1.sacar();
        //conta1.exibirSaldo();
    }
}

class ContaBancaria {

    String titular;
    int numeroConta;
    double saldo;

    void depositar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor a depositar: ");
        double valor = entrada.nextDouble();
        saldo = saldo + valor;

        System.out.println("Deposito concluido. Saldo atual:  " + saldo);
    }

    void sacar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor a sacar: ");
        double valor = entrada.nextDouble();

        if (saldo <= 0 || saldo < valor) {
            System.out.println("saldo insuficiente ");
        }
        else{
            saldo = saldo - valor;
            System.out.println("Saque concluido. Saldo atual: " + saldo);
        }
    }

    void exibirSaldo(){
        System.out.println("Saldo da conta: " + saldo);
    }
}