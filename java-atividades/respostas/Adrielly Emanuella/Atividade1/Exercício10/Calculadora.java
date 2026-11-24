public class Calculadora {

    // Soma dois numeros
    double somar(double a, double b) {
        return a + b;
    }

    // Subtrai dois numeros
    double subtrair(double a, double b) {
        return a - b;
    }

    // Multiplica dois numeros
    double multiplicar(double a, double b) {
        return a * b;
    }

    // Divide dois numeros
    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Nao e possivel dividir por zero!");
            return 0;
        }

        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.somar(10, 5));
        System.out.println("Subtracao: " + calculadora.subtrair(10, 5));
        System.out.println("Multiplicacao: " + calculadora.multiplicar(10, 5));
        System.out.println("Divisao: " + calculadora.dividir(10, 5));

        // Testa a divisao por zero
        calculadora.dividir(10, 0);
    }
}