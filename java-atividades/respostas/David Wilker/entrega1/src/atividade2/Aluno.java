package atividade2;

public class Aluno {
    String nome;
    // Cria um atributo para armazenar a idade do aluno.
    int idade;
    Aluno (String nome, int idade) {
        // Atribui o nome recebido ao atributo do objeto.
        // this.nome representa o atributo pertencente ao objeto.
        // nome representa o parâmetro recebido pelo construtor.
        this.nome = nome;
        // Atribui a idade recebida ao atributo do objeto.
        this.idade = idade;
    }
}
