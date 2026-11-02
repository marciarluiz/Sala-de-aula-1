public class ControleTv {
    //atributos//
    String marca;
    int canal;
    int volume;
    //metodos//
    void aumentarVolume() {
        if(volume < 100) {
            volume ++;
            System.out.println("Volume aumentado: " + volume);
        }else{
            System.out.println("Volume no máximo: " + volume);
        }
    }
        void diminuirVolume() {
        if(volume > 0) {
            volume--;
            System.out.println("Volume diminuido: " + volume);
        }else{
            System.out.println("Volume já está no mínimo: " + volume);
        }
    }
        void mudarCanal(int novoCanal) {
            canal = novoCanal;
            System.out.println("Canal alterado");
        }
        void exibirInformações() {
            System.out.println("Marca: " + marca);
            System.out.println("Canal: " + canal);
            System.out.println("Volume: " + volume);
        }
     }
     

