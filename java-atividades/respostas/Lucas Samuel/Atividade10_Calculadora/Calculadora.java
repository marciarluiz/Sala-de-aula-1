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

    // desafio: trata divisão por zero (retorna NaN quando não é possível dividir)
    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double a = 20;
        double b = 4;

        System.out.println("Soma: " + a + " + " + b + " = " + calc.somar(a, b));
        System.out.println("Subtração: " + a + " - " + b + " = " + calc.subtrair(a, b));
        System.out.println("Multiplicação: " + a + " * " + b + " = " + calc.multiplicar(a, b));
        System.out.println("Divisão: " + a + " / " + b + " = " + calc.dividir(a, b));

        System.out.println("\nTeste de divisão por zero:");
        double resultado = calc.dividir(a, 0);
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
