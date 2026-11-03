public class ArCondicionado {

    // Constantes dos limites de temperatura
    private static final int TEMPERATURA_MINIMA = 16;
    private static final int TEMPERATURA_MAXIMA = 30;

    // Atributos
    private String marca;
    private int temperatura;
    private boolean ligado;

    // Construtor padrão (o aparelho começa desligado e em 24 °C)
    public ArCondicionado() {
        this.temperatura = 24;
        this.ligado = false;
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= TEMPERATURA_MINIMA && temperatura <= TEMPERATURA_MAXIMA) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Temperatura inválida (use de "
                    + TEMPERATURA_MINIMA + " a " + TEMPERATURA_MAXIMA + " °C).");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    // Métodos
    public void ligar() {
        if (ligado) {
            System.out.println(marca + ": o aparelho já está ligado.");
        } else {
            ligado = true;
            System.out.println(marca + ": aparelho ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println(marca + ": o aparelho já está desligado.");
        } else {
            ligado = false;
            System.out.println(marca + ": aparelho desligado.");
        }
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            System.out.println(marca + ": ligue o aparelho para alterar a temperatura.");
        } else if (temperatura < TEMPERATURA_MAXIMA) {
            temperatura++;
            System.out.println(marca + ": temperatura aumentada para " + temperatura + " °C.");
        } else {
            System.out.println(marca + ": temperatura já está no máximo ("
                    + TEMPERATURA_MAXIMA + " °C).");
        }
    }

    public void diminuirTemperatura() {
        if (!ligado) {
            System.out.println(marca + ": ligue o aparelho para alterar a temperatura.");
        } else if (temperatura > TEMPERATURA_MINIMA) {
            temperatura--;
            System.out.println(marca + ": temperatura diminuída para " + temperatura + " °C.");
        } else {
            System.out.println(marca + ": temperatura já está no mínimo ("
                    + TEMPERATURA_MINIMA + " °C).");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Situação: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("-----------------------------");
    }
}