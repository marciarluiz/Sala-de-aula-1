package atividade10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        //Receber os valores do usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        //Mostrar as opções de operação e receber a escolha do usuário
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        int opcao = scanner.nextInt();

        //Realizar a operação escolhida e mostrar o resultado
        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = Calculadora.somar(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case 4:
                try {
                resultado = Calculadora.dividir(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();}
}