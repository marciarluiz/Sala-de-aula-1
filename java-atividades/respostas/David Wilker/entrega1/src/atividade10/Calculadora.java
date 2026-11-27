package atividade10;

public class Calculadora {
    public static double somar(double a, double b) {
        return (double)(a + b);
    }
    public static double subtrair(double a, double b) {
        return (double)(a - b);
    }
    public static double multiplicar(double a, double b) {
        return (double)(a * b);
    }
    public static double dividir(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double)(a / b);
    }
}
