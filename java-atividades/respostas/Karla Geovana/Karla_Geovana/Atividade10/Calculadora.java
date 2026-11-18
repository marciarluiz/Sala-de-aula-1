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
            System.out.println("Erro: não é possível dividir por zero!");
            return 0;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); 

        System.out.println("10 + 5 = " + calc.somar(10, 5));
        System.out.println("10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("10 x 5 = " + calc.multiplicar(10, 5));
        System.out.println("10 / 5 = " + calc.dividir(10, 5));
        System.out.println("10 / 0 = " + calc.dividir(10, 0));
    }
}
