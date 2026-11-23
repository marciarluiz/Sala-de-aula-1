package Resposta8;

public class Lampada {
    String cor;
    double potencia;
    String situacao;

    void ligar() {
        if (situacao == "desligada") {
            situacao = "Ligada";
            System.out.println("A lâmpada foi ligada");
        } else {
            System.out.println("A lampada já está ligada");
        }
    }

    void desligar() {
        if (situacao == "ligada") {
            situacao = "Desligada";
            System.out.println("A lâmpada foi desligada");
        } else {
            System.out.println("A lampada já está desligada");
        }
    }

    void exibirEstado() {
        System.out.println("A lâmpada tem cor: " + cor);
        System.out.println("Sua potencia é: " + potencia + "W");
        System.out.println("Ela está: " + situacao);
    }

    public Lampada(String cor , double potencia, String situacao) {
        this.cor = cor;
        this.potencia = potencia;
        this.situacao = situacao;
    }


}
