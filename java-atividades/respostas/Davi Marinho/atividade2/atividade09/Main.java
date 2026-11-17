public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("LG", false, 12);
        Computador pc = new Computador("Dell", false, "Windows 11");

        tv.exibirEstado();
        tv.ligar();
        tv.exibirEstado();
        tv.desligar();
        tv.exibirEstado();

        System.out.println("-----------------------------------");

        pc.exibirEstado();
        pc.ligar();
        pc.exibirEstado();
        pc.desligar();
        pc.exibirEstado();
    }
}
