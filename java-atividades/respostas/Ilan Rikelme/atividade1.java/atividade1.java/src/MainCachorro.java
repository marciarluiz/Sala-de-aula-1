public class MainCachorro {
  public static void main(String[] args) {

    Cachorro cachorro1 = new Cachorro();
    cachorro1.nome = "Xinjuco";
    cachorro1.raça = "Chihuahua";
    cachorro1.idade = 3;
    cachorro1.exibirDados();
    cachorro1.latir = true;
    cachorro1.latir();

    Cachorro cachorro2 = new Cachorro();
    cachorro2.nome = "Pitoco";
    cachorro2.raça = "Vira-lata";
    cachorro2.idade = 67;
    cachorro2.exibirDados();
    cachorro2.latir = false;
    cachorro2.latir();
}



    }
