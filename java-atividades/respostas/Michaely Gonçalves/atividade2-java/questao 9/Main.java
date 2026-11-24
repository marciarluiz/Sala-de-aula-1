public class Main {
 public static void main(String[] args) {
 Televisao televisao = new Televisao("Samsung", 5);

 Computador computador = new Computador("Dell", "Windows 11");

 televisao.ligar();
 televisao.exibirEstado();
 televisao.desligar();

 System.out.println();

 computador.ligar();
 computador.exibirEstado();
 computador.desligar();
    }
}
