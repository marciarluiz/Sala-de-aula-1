public class maintelevisao {

    public static void main(String[] args) {

        televisao tv = new televisao();

        tv.marca = "Samsung";
        tv.volume = 20;
        tv.canal = 5;

        System.out.println("Informacoes iniciais:");
        tv.exibirinformacoes();

        System.out.println();

        tv.aumentarvolume();
        tv.aumentarvolume();
        tv.diminuirvolume();

        tv.mudarcanal(10);

        System.out.println();

        System.out.println("Informacoes atualizadas:");
        tv.exibirinformacoes();
    }
}