public class mainarcondicionado {

    public static void main(String[] args) {

        arcondicionado ar = new arcondicionado();

        ar.marca = "LG";
        ar.temperatura = 24;

        ar.mostrarinformacoes();

        System.out.println();

        ar.ligar();

        ar.aumentartemperatura();
        ar.aumentartemperatura();

        ar.diminuirtemperatura();

        System.out.println();

        ar.mostrarinformacoes();

        ar.desligar();
    }
}