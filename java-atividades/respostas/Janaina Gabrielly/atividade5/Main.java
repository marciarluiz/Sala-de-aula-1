public class Main {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.marca = "Samsung";
        cel1.modelo = "Galaxy A54";
        cel1.bateria = 60;

        Celular cel2 = new Celular();
        cel2.marca = "Motorola";
        cel2.modelo = "Moto G84";
        cel2.bateria = 30;

        cel1.exibirInformacoes();
        cel2.exibirInformacoes();

        cel1.ligar();
        cel2.ligar();

        cel1.carregarBateria();
        cel2.carregarBateria();

        cel1.exibirInformacoes();
        cel2.exibirInformacoes();
    }
}
