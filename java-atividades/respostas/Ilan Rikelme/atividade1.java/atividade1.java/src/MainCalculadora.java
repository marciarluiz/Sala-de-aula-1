public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();
        double n1= 45;
        double n2= 5;

        System.out.println("Soma: " + calculadora1.somar(n1, n2));

        System.out.println("Subtração: " + calculadora1.subtração(n1, n2));

        System.out.println("Multiplicação: " + calculadora1.multiplicar(n1, n2));

        System.out.println("Divisão: " + calculadora1.divisão(n1, n2));


        //testando divisão por 0//
        System.out.println("Divisão por 0: " + calculadora1.divisão(n1, 0));

    }
}
