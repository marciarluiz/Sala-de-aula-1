package Resposta5;

public class Main {
    
    public void Quebralinha() {
        System.out.println();
    }
    
    void main(String[] args) {
        Celular celular1 = new Celular("Samsung", "Galaxy S24", 1.0, false);
        celular1.exibirInformacoes();
        celular1.ligar();
        celular1.carregarBateria(30.0);

        Quebralinha();

        Celular celular2 = new Celular("Apple", "iPhone 15", 0.0, true);
        celular2.exibirInformacoes();
        celular2.ligar();
        celular2.desligar();
        celular2.carregarBateria(40.0);
    }
    
}
