public class Main {
    public static void main(String[] args) {

        // Primeiro celular
        Celular celular1 = new Celular();
        celular1.marca = "Xiaomi";
        celular1.modelo = " Redmi Note 14 Pro";
        celular1.bateria = 30;

        // Segundo celular
        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 17";
        celular2.bateria = 49;

        // Exibindo informações
        System.out.println("PRIMEIRO CELULAR");
        celular1.exibirInformacoes();

        System.out.println("SEGUNDO CELULAR");
        celular2.exibirInformacoes();

        // Testando o método ligar
        celular1.ligar();
        celular2.ligar();

        // Carregando os celulares
        System.out.println("\nCARREGANDO CELULARES");

        celular1.carregarBateria();
        celular2.carregarBateria();

        // Exibindo informações atualizadas
        System.out.println("\nDADOS ATUALIZADOS");

        celular1.exibirInformacoes();
        celular2.exibirInformacoes();
    }
}
