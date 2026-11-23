package Resposta5;

public class Celular {
    String marca;
    String modelo;
    double bateria;
    boolean ligado;

    public void ligar() {
        if (this.ligado == true) {
            System.out.println("O celular " + this.modelo + " já está ligado.");
            return;
        } else {
            this.ligado = true;
            System.out.println("O celular " + this.modelo + " foi ligado.");
        }
    }

    public void desligar() {
        if (this.ligado == false) {
            System.out.println("O celular " + this.modelo + " já está desligado.");
            return;
        } else{   
        this.ligado = false;
        System.out.println("O celular " + this.modelo + " foi desligado.");
        }
    }

    public void carregarBateria(double carga) {
        if (carga < 0) {
            System.out.println("Carga inválida. A carga deve ser um valor positivo.");
            return;
        }
        if (this.bateria > 100) {
            this.bateria = 100;
        } else if (this.bateria == 100) {
            System.out.println("A bateria do celular " + this.modelo + " Já está cheia.");
        } else {
            this.bateria += carga;
             System.out.println("A bateria do celular " + this.modelo + " foi carregada para " + this.bateria + "%.");
            if (this.bateria > 100) {
                this.bateria = 100;
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Bateria: " + this.bateria + "%");
        System.out.println("Ligado: " + (this.ligado ? "Sim" : "Não"));
    }

    public Celular(String marca, String modelo, double bateria, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.ligado = ligado;
    }
}
