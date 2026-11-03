public class Main {
    public static void main(String[] args) {

        Celular celular1 = new Celular();
        celular1.setMarca("Samsung");
        celular1.setModelo("Galaxy S23");
        celular1.setBateria(45);

        Celular celular2 = new Celular();
        celular2.setMarca("Apple");
        celular2.setModelo("iPhone 14");
        celular2.setBateria(10);

        System.out.println("=== Informações dos celulares ===");
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        System.out.println("=== Ligando os celulares ===");
        celular1.ligar();
        celular2.ligar();

        System.out.println("\n=== Carregando a bateria ===");
        celular1.carregarBateria();
        System.out.println();
        celular2.carregarBateria();

        System.out.println("\n=== Informações após o carregamento ===");
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();
    }
}