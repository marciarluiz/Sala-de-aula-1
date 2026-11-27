public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtracao: " + calc.subtrair(10, 5));
        System.out.println("Multiplicacao: " + calc.multiplicar(10, 5));
        System.out.println("Divisao: " + calc.dividir(10, 5));

        // testando divisao por zero
        System.out.println("Divisao por zero: " + calc.dividir(10, 0));
    }
}
