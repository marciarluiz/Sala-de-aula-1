public class Televisao extends Dispositivo {
 private int canal;

 public Televisao(String marca, int canal) {
 super(marca);
 this.canal = canal;
    }

 @Override
 public void ligar() {
 super.ligar();
 System.out.println("Televisão iniciada!");
    }

 @Override
 public void exibirEstado() {
 System.out.println("=== TELEVISÃO ===");
 super.exibirEstado();
 System.out.println("Canal: " + canal);
    }
}
