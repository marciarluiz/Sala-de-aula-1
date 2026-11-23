public class arcondicionado {

    String marca;
    int temperatura;
    boolean ligado = false;

    public void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado desligado.");
    }

    public void aumentartemperatura() {
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + " C");
        } else {
            System.out.println("Temperatura maxima atingida.");
        }
    }

    public void diminuirtemperatura() {
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura: " + temperatura + " C");
        } else {
            System.out.println("Temperatura minima atingida.");
        }
    }

    public void mostrarinformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Temperatura: " + temperatura + " C");
        System.out.println("Ligado: " + ligado);
    }
}