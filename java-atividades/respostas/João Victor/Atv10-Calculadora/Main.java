public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.somar(10, 5));

        System.out.println("Subtração: " + calculadora.subtrair(20, 5));

        System.out.println("Multiplicação: " + calculadora.multiplicar(15, 5));

        System.out.println("Divisão: " + calculadora.dividir(20, 5));

        // Testando a divisão por zero
        System.out.println("Divisão: " + calculadora.dividir(10, 0));
    }
}
