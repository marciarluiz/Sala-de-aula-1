public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung", false, 5);
        Computador pc = new Computador("Dell", false, "Windows 11");

        System.out.println("=== Televisão ===");
        tv.exibirEstado();
        tv.ligar();
        tv.exibirEstado();
        tv.desligar();
        tv.exibirEstado();

        System.out.println();

        System.out.println("=== Computador ===");
        pc.exibirEstado();
        pc.ligar();
        pc.exibirEstado();
        pc.desligar();
        pc.exibirEstado();
    }
}
