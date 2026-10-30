/**
 * Atividade 13 - Controle de Temperatura
 * Regra: temperatura entre 16 °C e 30 °C.
 */
public class ArCondicionado {
 
    // Atributos
    String marca;
    int temperatura;
    boolean ligado;
 
    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }
 
    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }
 
    void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura máxima (30 °C) atingida.");
        }
    }
 
    void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura mínima (16 °C) atingida.");
        }
    }
 
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Midea";
        ar.temperatura = 24;
 
        ar.aumentarTemperatura();   // desligado -> aviso
        ar.ligar();
 
        // Testa o limite superior
        for (int i = 0; i < 8; i++) {
            ar.aumentarTemperatura();
        }
 
        // Testa o limite inferior
        for (int i = 0; i < 16; i++) {
            ar.diminuirTemperatura();
        }
 
        ar.desligar();
    }
}
 
