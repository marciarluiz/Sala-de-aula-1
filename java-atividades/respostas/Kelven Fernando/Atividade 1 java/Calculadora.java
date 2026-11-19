/**
 * Atividade 10 - Programação Orientada a Objetos (POO)
 * Classe que executa operações matemáticas básicas com tratamento de erros.
 */
public class Calculadora {

    /**
     * Realiza a soma de dois números reais.
     *
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da soma (a + b)
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois números reais.
     *
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da subtração (a - b)
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números reais.
     *
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da multiplicação (a * b)
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a divisão do dividendo pelo divisor.
     * Desafio: Tratar divisão por zero com verificação explícita.
     *
     * @param a Dividendo
     * @param b Divisor
     * @return Resultado da divisão, ou Double.NaN caso o divisor seja zero
     */
    public double dividir(double a, double b) {
        if (b == 0.0) {
            System.out.println("[Aviso] Erro matemático: Divisão por zero não é permitida!");
            return Double.NaN;
        }
        return a / b;
    }

    /**
     * Método principal para teste da classe Calculadora.
     */
    public static void main(String[] args) {
        System.out.println("=== Atividade 10: Demonstração da Classe Calculadora ===\n");

        // Criação do objeto Calculadora
        Calculadora calc = new Calculadora();

        double num1 = 15.0;
        double num2 = 4.0;
        double zero = 0.0;

        System.out.printf("Valores de teste: A = %.2f, B = %.2f%n%n", num1, num2);

        // Operação de Soma
        double soma = calc.somar(num1, num2);
        System.out.printf("Soma (%.2f + %.2f)          = %.2f%n", num1, num2, soma);

        // Operação de Subtração
        double subtracao = calc.subtrair(num1, num2);
        System.out.printf("Subtração (%.2f - %.2f)     = %.2f%n", num1, num2, subtracao);

        // Operação de Multiplicação
        double multiplicacao = calc.multiplicar(num1, num2);
        System.out.printf("Multiplicação (%.2f * %.2f) = %.2f%n", num1, num2, multiplicacao);

        // Operação de Divisão Normal
        double divisaoNormal = calc.dividir(num1, num2);
        System.out.printf("Divisão (%.2f / %.2f)       = %.2f%n", num1, num2, divisaoNormal);

        // Desafio: Teste de Divisão por Zero
        System.out.println("\n--- Teste do Desafio: Tentativa de divisão por zero ---");
        double divisaoZero = calc.dividir(num1, zero);
        System.out.printf("Resultado obtido da divisão por zero: %s%n",
                Double.isNaN(divisaoZero) ? "Indefinido / Erro tratado" : String.valueOf(divisaoZero));
    }
}
