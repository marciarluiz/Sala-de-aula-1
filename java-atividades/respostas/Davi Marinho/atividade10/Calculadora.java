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
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma (10 + 5): " + calc.somar(10, 5));
        System.out.println("Subtração (10 - 5): " + calc.subtrair(10, 5));
        System.out.println("Multiplicação (10 * 5): " + calc.multiplicar(10, 5));
        System.out.println("Divisão (10 / 5): " + calc.dividir(10, 5));

        // Desafio: testando divisão por zero
        System.out.println("Tentativa de divisão por zero (10 / 0): " + calc.dividir(10, 0));
    }
}
