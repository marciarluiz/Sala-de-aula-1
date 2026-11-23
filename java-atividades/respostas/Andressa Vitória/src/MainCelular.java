public class MainCelular {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Samsung";
        c1.modelo = "Galaxy S23";
        c1.bateria = 60;

        Celular c2 = new Celular();
        c2.marca = "Apple";
        c2.modelo = "iPhone 14";
        c2.bateria = 30;

        c1.ligar();
        c1.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();

        System.out.println();
        c1.carregarBateria();
        System.out.println();
        c2.carregarBateria();

    }
}