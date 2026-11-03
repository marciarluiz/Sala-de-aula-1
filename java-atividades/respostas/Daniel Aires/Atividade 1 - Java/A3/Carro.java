public class Carro {

    // Atributos
    private String modelo;
    private String marca;
    private int ano;
    private boolean ligado;

    // Construtor padrão (o carro começa desligado)
    public Carro() {
        this.ligado = false;
    }

    // Getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    // Métodos
    public void ligar() {
        if (ligado) {
            System.out.println(marca + " " + modelo + ": o carro já está ligado.");
        } else {
            ligado = true;
            System.out.println(marca + " " + modelo + ": carro ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println(marca + " " + modelo + ": o carro já está desligado.");
        } else {
            ligado = false;
            System.out.println(marca + " " + modelo + ": carro desligado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Situação: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("-----------------------------");
    }
}