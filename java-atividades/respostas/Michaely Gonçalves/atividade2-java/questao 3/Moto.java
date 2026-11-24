public class Moto extends Veiculo {
 private int cilindradas;

 public Moto(String marca, String modelo, int ano, int cilindradas) {
 super(marca, modelo, ano);
 this.cilindradas = cilindradas;
    }

 @Override
 public void ligar() {
 System.out.println("Moto ligada!");
    }

 @Override
 public void exibirInformacoes() {
 System.out.println("=== MOTO ===");
 super.exibirInformacoes();
 System.out.println("Cilindradas: " + cilindradas);
    }
}
