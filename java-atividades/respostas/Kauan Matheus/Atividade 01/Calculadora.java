// Atividade 10

public class Calculadora {

    double somar(double a, double b) {
        return a + b;
    }

    double subtrair(double a, double b) {
        return a - b;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double numero1 = 10;
        double numero2 = 5;

        System.out.println("Soma: " + calculadora.somar(numero1, numero2));
        System.out.println("Subtração: " + calculadora.subtrair(numero1, numero2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(numero1, numero2));
        System.out.println("Divisão: " + calculadora.dividir(numero1, numero2));
    }
}
