public class Animal {
 private String nome;
 private int idade;

 public Animal(String nome, int idade) {
 this.nome = nome;
 this.idade = idade;
    }

 public void emitirSom() {
 System.out.println("O animal está emitindo um som.");
    }

 public void exibirDados() {
 System.out.println("Nome: " + nome);
 System.out.println("Idade: " + idade + " anos");
    }

 public String getNome() {
 return nome;
    }

 public int getIdade() {
 return idade;
    }
}
