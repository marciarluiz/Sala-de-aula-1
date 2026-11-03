public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        double a = 20;
        double b = 4;

        System.out.println("=== Operações com " + a + " e " + b + " ===");
        System.out.println("Soma: " + calc.somar(a, b));
        System.out.println("Subtração: " + calc.subtrair(a, b));
        System.out.println("Multiplicação: " + calc.multiplicar(a, b));

        double divisao = calc.dividir(a, b);
        if (!Double.isNaN(divisao)) {
            System.out.println("Divisão: " + divisao);
        }

        // Desafio: tentando dividir por zero
        System.out.println("\n=== Divisão por zero (desafio) ===");
        double resultado = calc.dividir(a, 0);
        if (!Double.isNaN(resultado)) {
            System.out.println("Divisão: " + resultado);
        }
    }
}