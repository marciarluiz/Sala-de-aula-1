
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
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisao por zero!");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtracao: " + calc.subtrair(10, 5));
        System.out.println("Multiplicacao: " + calc.multiplicar(10, 5));
        System.out.println("Divisao: " + calc.dividir(10, 5));
    }
}

