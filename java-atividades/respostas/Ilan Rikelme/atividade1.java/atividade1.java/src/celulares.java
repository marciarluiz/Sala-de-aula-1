public class celulares {
    //atributos//
    String marca;
    String  modelo;
    int bateria;
    //metodos//
    void ligar() {
        System.out.println("Celular ligado!");
    }
    void exibirInformações(){
        System.out.println("Marca: " + marca);

        System.out.println("Modelo: " + modelo);

        System.out.println("Bateria: " + bateria);

        if(bateria <= 20) {
            System.out.println("Bateria fraca");
        }else if (bateria <= 50) {
            System.out.println("Bateria na metade ou abaixo");
        }else if (bateria < 100) {
            System.out.println("Bateria em bom nivel");
        }else{
            System.out.println("Bateria carregada!");
        }
}
        
    }
