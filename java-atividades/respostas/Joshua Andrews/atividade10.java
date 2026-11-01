public class atividade10 {
    public static void main(String[] args) {
        Calculadora calculadora1 = new Calculadora();

        calculadora1.a = 3;
        calculadora1.b = 5;

        calculadora1.soma();
        calculadora1.subtrair();
        calculadora1.multiplicar();
        calculadora1.dividir();

    }

}

class Calculadora{
    double a;
    double b;

    void soma(){
        System.out.println("A soma de: " + a + " e " + b + " é igual a " + (a+b));
    }
    void subtrair(){
        System.out.println("A subtração de: " + a + " e " + b + " é igual a " + (a-b));
    }
    void multiplicar(){
        System.out.println("A multiplicação de: " + a + " e " + b + " é igual a " + (a*b));
    }
    void dividir(){
        if(b != 0){
            System.out.println("A divisão de: " + a + " e " + b + " é igual a " + (a/b));
        }else{
            System.out.println("Divisão pra 0 não existe");
        }
    }
}



