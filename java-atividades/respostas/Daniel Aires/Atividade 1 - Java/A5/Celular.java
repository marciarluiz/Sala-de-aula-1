public class Celular {

    // Atributos
    private String marca;
    private String modelo;
    private int bateria; // percentual de 0 a 100
    private boolean ligado;

    // Construtor padrão
    public Celular() {
        this.ligado = false;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Nível de bateria inválido (use de 0 a 100).");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    // Métodos
    public void ligar() {
        if (ligado) {
            System.out.println(marca + " " + modelo + ": o celular já está ligado.");
        } else if (bateria == 0) {
            System.out.println(marca + " " + modelo + ": bateria descarregada, não é possível ligar.");
        } else {
            ligado = true;
            System.out.println(marca + " " + modelo + ": celular ligado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("Situação: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("-----------------------------");
    }

    public void carregarBateria() {
        if (bateria == 100) {
            System.out.println(marca + " " + modelo + ": bateria já está completa.");
            return;
        }

        System.out.println(marca + " " + modelo + ": carregando...");
        while (bateria < 100) {
            bateria = Math.min(bateria + 20, 100);
            System.out.println("  Bateria: " + bateria + "%");
        }
        System.out.println(marca + " " + modelo + ": carregamento concluído.");
    }
}