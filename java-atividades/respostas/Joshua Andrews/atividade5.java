public class atividade5 {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();

        celular1.marca = "Iphone";
        celular1.modelo = "13-pro";
        celular1.bateria = 0;

       celular1.carregarBateria();
       celular1.exibirInformacoes();
       celular1.ligar();

        celular2.marca = "Samsung";
        celular2.modelo = "S23-ultra";
        celular2.bateria = 80;

        celular2.carregarBateria();
        celular2.exibirInformacoes();
        celular2.ligar();
    }

}

class Celular{
    String marca;
    String modelo;
    int bateria;

    void ligar(){
        if (bateria <= 0){
            System.out.println("Bateria insuficiente");
        }else{
            System.out.println("Aparelho ligado");
        }
    }

    void exibirInformacoes(){
        System.out.println("Marca do celular: " + marca);
        System.out.println("Modelo do celular: " + modelo);
        System.out.println("Porcentagem da bateria: " + bateria + "%");
    }

    void carregarBateria(){
        for(int i = bateria; i <= 100; i++){
            System.out.println("Bateria em " + i + "%");
        }
        bateria = 100;
        System.out.println("Bateria carregada com sucesso");
    }
}



