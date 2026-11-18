public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    // desafio: divisão por zero. Retorna NaN quando a operação não pode ser feita.
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double a = 10, b = 4;

        System.out.println(a + " + " + b + " = " + calc.somar(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtrair(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + calc.dividir(a, b));

        System.out.println("Testando divisão por zero:");
        calc.dividir(a, 0);
    }
}
