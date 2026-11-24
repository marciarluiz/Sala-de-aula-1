public class Transporte {
 private String modelo;
 private int capacidadePassageiros;

 public Transporte(String modelo, int capacidadePassageiros) {
 this.modelo = modelo;
 this.capacidadePassageiros = capacidadePassageiros;
    }

 public void mover() {
 System.out.println("O transporte está se movendo.");
    }

 public void exibirInformacoes() {
 System.out.println("Modelo: " + modelo);
 System.out.println("Capacidade de passageiros: " + capacidadePassageiros);
    }

 public String getModelo() {
 return modelo;
    }

 public int getCapacidadePassageiros() {
 return capacidadePassageiros;
    }
}
