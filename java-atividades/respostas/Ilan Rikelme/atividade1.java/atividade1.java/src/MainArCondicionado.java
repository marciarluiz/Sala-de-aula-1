public class MainArCondicionado {


    public static void main(String[] args) {

        // Criando o objeto
        ArCondicionado ar = new ArCondicionado();

        // Atribuindo valores iniciais
        ar.marca = "Samsung";
        ar.temperatura = 24;
        ar.ligado = false;

        // Ligando o aparelho
        ar.ligar();

        // Aumentando a temperatura
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        // Diminuindo a temperatura
        ar.diminuirTemperatura();

        // Exibindo informações
        System.out.println("\n=== INFORMAÇÕES DO AR-CONDICIONADO ===");
        System.out.println("Marca: " + ar.marca);
        System.out.println("Temperatura: " + ar.temperatura + " °C");
        System.out.println("Ligado: " + ar.ligado);

        // Desligando o aparelho
        ar.desligar();

        System.out.println("Estado final: " + ar.ligado);
    }
}