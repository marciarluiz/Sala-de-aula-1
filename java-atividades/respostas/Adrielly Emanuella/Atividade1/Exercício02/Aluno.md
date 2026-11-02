# Atividade 1 — Exercício 2: Cadastro de Alunos

## Objetivo
Criar uma classe chamada `Aluno` para cadastrar e exibir os dados de três alunos, utilizando os conceitos básicos de Programação Orientada a Objetos em Java.

## 1. Criação da classe

```java
public class Aluno {
```

Essa linha cria a classe `Aluno`, que representa os alunos que serão cadastrados.

## 2. Atributos da classe

```java
String nome;
int idade;
String curso;
int matricula;
```

Os atributos guardam as informações de cada aluno:

- `nome`: armazena o nome do aluno.
- `idade`: armazena a idade do aluno.
- `curso`: informa o curso que o aluno está fazendo.
- `matricula`: armazena o número de matrícula.

O atributo `matricula` foi acrescentado como um desafio extra.

## 3. Método `exibirDados()`

```java
void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Curso: " + curso);
    System.out.println("Matricula: " + matricula);
    System.out.println("--------------------");
}
```

Esse método mostra na tela os dados do aluno. O comando `System.out.println()` exibe cada informação em uma linha. A linha de traços separa os dados de cada aluno para facilitar a leitura.

## 4. Método `main()`

O método `main()` é o ponto de início da execução do programa.

```java
public static void main(String[] args) {
```

Dentro dele, são criados três objetos da classe `Aluno`.

### Primeiro aluno

```java
Aluno aluno1 = new Aluno();
aluno1.nome = "Adrielly";
aluno1.idade = 20;
aluno1.curso = "ADS";
aluno1.matricula = 101;
```

O objeto `aluno1` recebe os dados do primeiro aluno.

### Segundo aluno

```java
Aluno aluno2 = new Aluno();
aluno2.nome = "Maria";
aluno2.idade = 21;
aluno2.curso = "Computacao";
aluno2.matricula = 102;
```

O objeto `aluno2` recebe os dados do segundo aluno.

### Terceiro aluno

```java
Aluno aluno3 = new Aluno();
aluno3.nome = "Joao";
aluno3.idade = 19;
aluno3.curso = "ADS";
aluno3.matricula = 103;
```

O objeto `aluno3` recebe os dados do terceiro aluno.

Cada objeto possui seus próprios valores para os atributos, mesmo todos pertencendo à mesma classe.

## 5. Exibição dos dados

```java
aluno1.exibirDados();
aluno2.exibirDados();
aluno3.exibirDados();
```

Essas chamadas executam o método `exibirDados()` para cada objeto. Assim, as informações dos três alunos são exibidas no terminal.

## 6. Resultado esperado

```text
Nome: Adrielly
Idade: 20
Curso: ADS
Matricula: 101
--------------------
Nome: Maria
Idade: 21
Curso: Computacao
Matricula: 102
--------------------
Nome: Joao
Idade: 19
Curso: ADS
Matricula: 103
--------------------
```

## 7. Conceitos praticados

- **Classe:** estrutura que define os atributos e métodos dos objetos.
- **Objeto:** elemento criado a partir de uma classe.
- **Atributos:** variáveis que armazenam os dados de cada aluno.
- **Método:** bloco de código que executa uma tarefa.
- **Instanciação:** criação de um objeto utilizando `new`.
- **Método `main()`:** ponto de entrada do programa Java.

