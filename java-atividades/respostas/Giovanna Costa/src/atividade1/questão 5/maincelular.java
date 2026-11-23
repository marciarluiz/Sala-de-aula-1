public class maincelular {

    public static void main(String[] args) {

        celular celular1 = new celular();
        celular celular2 = new celular();

        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S24";
        celular1.bateria = 30;

        celular2.marca = "Apple";
        celular2.modelo = "iPhone 15";
        celular2.bateria = 50;

        celular1.exibirinformacoes();
        celular1.ligar();
        celular1.carregarbateria();

        System.out.println();

        celular2.exibirinformacoes();
        celular2.ligar();
        celular2.carregarbateria();
    }
}