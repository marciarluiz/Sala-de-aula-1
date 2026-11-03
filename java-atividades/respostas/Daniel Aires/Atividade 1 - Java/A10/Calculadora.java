public class Calculadora {

    // Construtor padrão
    public Calculadora() {
    }

    // Métodos
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Desafio: não realiza a divisão quando o divisor é zero
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
            return Double.NaN; // "Not a Number": indica que não há resultado
        }
        return a / b;
    }
}