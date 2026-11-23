public class maincalculadora {

    public static void main(String[] args) {

        calculadora calc = new calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));

        System.out.println("Subtracao: " + calc.subtrair(10, 5));

        System.out.println("Multiplicacao: " + calc.multiplicar(10, 5));

        try {
            System.out.println("Divisao: " + calc.dividir(10, 5));

            System.out.println("Outra divisao: " + calc.dividir(10, 0));

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}