public class ArCondicionado {
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
            System.out.println("O aparelho está desligado. Ligue-o antes de ajustar a temperatura.");
            return;
        }
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada para: " + temperatura + " °C");
        } else {
            System.out.println("Limite máximo atingido! A temperatura já está em 30 °C.");
        }
    }

    void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("O aparelho está desligado. Ligue-o antes de ajustar a temperatura.");
            return;
        }
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura diminuída para: " + temperatura + " °C");
        } else {
            System.out.println("Limite mínimo atingido! A temperatura já está em 16 °C.");
        }
    }

    void exibirStatus() {
        String estado = ligado ? "Ligado" : "Desligado";
        System.out.println("Ar-Condicionado " + marca + " | Estado: " + estado + " | Temperatura: " + temperatura + " °C");
    }

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Consul";
        ar.temperatura = 17;
        ar.ligado = false;

        ar.exibirStatus();
        ar.ligar();
        ar.diminuirTemperatura(); // Vai para 16 °C
        ar.diminuirTemperatura(); // Testa o limite mínimo de 16 °C
        ar.aumentarTemperatura(); // Vai para 17 °C
        ar.exibirStatus();
        ar.desligar();
    }
}
