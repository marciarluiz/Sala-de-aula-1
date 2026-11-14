package atividade5;

public class Main {
    public static void main(String[] args) {

        Celular celular1 = new Celular("Samsung", "Galaxy S21", 50.0);
        celular1.exibirInformacoes();
        celular1.ligar();
        celular1.carregarBateria(30.0);
        celular1.exibirInformacoes();

        Celular celular2 = new Celular("Apple", "iPhone 13", 0.0);
        celular2.exibirInformacoes();
        celular2.ligar();
        celular2.carregarBateria(0.0);
        celular2.exibirInformacoes();

        Celular celular3 = new Celular("Xiaomi", "Redmi Note 10", 100.0);
        celular3.exibirInformacoes();
        celular3.ligar();
        celular3.carregarBateria(10.0);
        celular3.exibirInformacoes();
    }
}
