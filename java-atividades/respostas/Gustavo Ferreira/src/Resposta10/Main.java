package Resposta10;

public class Main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        System.out.println("Soma: " + calcular.somar(455, 89));
        System.out.println("Subtração: " + calcular.subtrair(121, 5));
        System.out.println("Multiplicação: " + calcular.multiplicar(70, 5));
        System.out.println("Divisão: " + calcular.dividir(10, 5));
    }
}
