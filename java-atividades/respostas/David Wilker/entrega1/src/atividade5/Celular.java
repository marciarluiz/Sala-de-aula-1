package atividade5;

public class Celular {
    String marca;
    String modelo;
    double bateria;
    
    Celular (String marca, String modelo, double bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    void ligar() {
        if (bateria > 0) {
            System.out.println("O celular " + marca + " " + modelo + " está ligando.");
        } else {
            System.out.println("O celular " + marca + " " + modelo + " está descarregado (bateria com 0%)");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }

    void carregarBateria(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual de carga inválido. Deve estar entre 0 e 100.");
            return;
        }
        if (bateria == 100) {
            System.out.println("A bateria do celular " + marca + " " + modelo + " já está totalmente carregada.");
            return;
        }
        bateria += percentual;
        if (bateria > 100) {
            bateria = 100; // Limita a bateria a no máximo 100%
        }
        System.out.println("O celular " + marca + " " + modelo + " foi carregado em " + percentual + "%. Bateria atual: " + bateria + "%");
    }

}
