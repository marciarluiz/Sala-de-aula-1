public class Computador extends Dispositivo {
 private String sistemaOperacional;

 public Computador(String marca, String sistemaOperacional) {
 super(marca);
 this.sistemaOperacional = sistemaOperacional;
    }

 @Override
 public void ligar() {
 super.ligar();
 System.out.println("Computador iniciado!");
    }

 @Override
 public void exibirEstado() {
 System.out.println("=== COMPUTADOR ===");
 super.exibirEstado();
 System.out.println("Sistema operacional: " + sistemaOperacional);
    }
}
