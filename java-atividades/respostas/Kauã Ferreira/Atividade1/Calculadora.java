/**
 * ATIVIDADE 10 - CALCULADORA - COM TRATAMENTO DE DIVISÃO POR 0 
 * Calculadora
 */

public class Calculadora {
    double somar(double a, double b){
        return  a + b;
    }
    double subtrair(double a, double b){
        return a - b;
    }
    double multiplicar(double a, double b){
        return a*b;
    }
    //Desafio: se divisor for 0 não realiza a divisão e retorna NaN ( não é número)
    double dividir( double a, double b){
        if(b==0){
            System.out.println("Erro: não é possivel dividir por zero.");
            return Double.NaN;
        }
        return a/b;
    }
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        System.out.println("20 + 5 = " + calc.somar(20, 5));
        System.out.println("10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("2 x 5 = " + calc.multiplicar(2, 5));
        System.out.println("10 / 5 = " + calc.dividir(10, 5));

        //Teste da divisão poe zero
        double resultado = calc.dividir(10, 0);
        if(!Double.isNaN(resultado)){
            System.out.println("10 / 0 = " + resultado);
        }
    }
}
