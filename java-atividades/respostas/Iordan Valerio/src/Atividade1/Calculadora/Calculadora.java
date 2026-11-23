package Atividade1.Calculadora;

public class Calculadora {
    public void somar(double a, double b){
        double soma = (a + b);
        System.out.println(soma);
    }
    public void subtrair(double a, double b){
        double subtrai = (a - b);
        System.out.println(subtrai);
    }
    public void multiplicar(double a, double b){
        double mult = (a * b);
        System.out.println(mult);
    }
    public void dividir(double a, double b){
        if (b == 0){
            System.out.println("É impossível realizar a divisão quando o demonimador é 0. Escolha outro denominador.");
        }else{
            double divide = (a / b);
            System.out.println(divide);
        }
    }
}
