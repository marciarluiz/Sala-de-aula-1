public class MainCarro {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.ano = 2020;

        Carro c2 = new Carro();
        c2.modelo = "Onix";
        c2.marca = "Chevrolet";
        c2.ano = 2022;

        c1.exibirInformacoes();
        c1.ligar();
        c1.ligar(); // testa o desafio
        c1.exibirInformacoes();
        c1.desligar();

        c2.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();
        c2.desligar();
        c2.desligar();

    }
}