public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado == true) {
            System.out.println("O carro ja esta ligado");
        } else {
            ligado = true;
            System.out.println("Carro ligado");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado");
    }

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
        System.out.println();
    }
}
