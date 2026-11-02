public class Carro {
    //Atributos
    String modelo;
    String marca;
    int ano;
    boolean ligado;
    //metodos//
    void ligar() {
    if (ligado == false) {
        ligado = true;
        System.out.println("Carro ligado!");
    } else {
        System.out.println("O carro já está ligado!");
    }
}
    void desligar() {
    ligado = false;
    System.out.println("Carro desligado!");
}
    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
    }
}
