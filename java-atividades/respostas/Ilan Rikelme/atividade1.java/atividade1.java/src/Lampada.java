public class Lampada {
    //atributos//
    String cor;
    int potencia;
    boolean ligada;
    //metodos//
    void ligar(){
        ligada = true;
    }
    void desligar() {
        ligada = false;
    }
    void mostrarEstado() {
    if (ligada == true) {
        System.out.println("A lâmpada está ligada!");
    } else {
        System.out.println("A lâmpada está desligada!");
    }
}
   void exibirResultados() {
    System.out.println("Potencia: " + potencia);
    System.out.println("Cor: " + cor);
    mostrarEstado();
   
}
}
