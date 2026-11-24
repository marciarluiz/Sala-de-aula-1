public class Bicicleta extends Transporte {
 private String tipo;

 public Bicicleta(String modelo, int capacidadePassageiros, String tipo) {
 super(modelo, capacidadePassageiros);
 this.tipo = tipo;
    }

 @Override
 public void mover() {
 System.out.println("A bicicleta está sendo pedalada.");
    }

 @Override
 public void exibirInformacoes() {
 System.out.println("=== BICICLETA ===");
 super.exibirInformacoes();
 System.out.println("Tipo: " + tipo);
    }
}
