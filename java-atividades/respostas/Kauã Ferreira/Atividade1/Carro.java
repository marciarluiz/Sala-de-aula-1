/**
 * ATIVIDADE 3 - CADASTRO DE VELOCIDADE (COM DESAFIO DE NÃO LIGAR DUAS VEZES)
 */

public class Carro{
    //Atributos
    String modelo;
    String marca;
    int ano;
    boolean ligado; // false = desligado

    //Liga o carro, mas só se ele estiver desligado
    void ligar(){
        if (ligado){
            System.out.println(modelo + " já está ligado!");
        }else{
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }
    }
    //Desliga o carro, mas só se ele estiver ligado
    void desligar(){
        if (!ligado){
            System.out.println(modelo + " já está desligado!");
        }else{
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        }
    }
    
    void exibirInformacoes(){
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano + " | Ligado: " + (ligado ? "Sim" : "Não"));
    }
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.modelo = "Onix";
        c1.marca = "Chevrolet";
        c1.ano = 2022;

        Carro c2 = new Carro();
        c2.modelo = "Corolla";
        c2.marca = "Toyota";
        c2.ano = 2019;

        c1.exibirInformacoes();
        c1.ligar();
        c1.ligar(); //tentativa de ligar duas vezes -> bloqueada
        c1.exibirInformacoes();
        c1.desligar();

        System.out.println();

        c2.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();
        c2.desligar();
        c2.desligar(); //tentativa de desligar duas vezes -> aviso
    }
}
