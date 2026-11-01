public class Calculadora {
    //metodo somar//
    double somar(double a,double b) {
        return a+b;
    }
     //metodo subtrair//
    double subtração(double a,double b) {
        return a-b;
    }
     //metodo multiplicar//
    double multiplicar(double a,double b) {
        return a*b;
    }
     //metodo divisão//
    double divisão(double a,double b) {
        if(b == 0) {
            System.out.println("Erro: Não é possivel dividir por 0!");
            return 0;
        }else{
            return a/b;
        }
    }
}
