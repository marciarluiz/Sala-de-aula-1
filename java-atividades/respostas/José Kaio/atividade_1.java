
public class Main {

    // ATIVIDADE 1 - CONTA BANCARIA
    static class ContaBancaria {
        String titular;
        int numeroConta;
        double saldo;

        void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Deposito realizado com sucesso!");
            } else {
                System.out.println("Valor de deposito invalido.");
            }
        }

        void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saque invalido ou saldo insuficiente.");
            }
        }

        void exibirSaldo() {
            System.out.println("Titular: " + titular);
            System.out.println("Numero da conta: " + numeroConta);
            System.out.printf("Saldo: R$ %.2f%n", saldo);
        }
    }

    // ATIVIDADE 2 - CADASTRO DE ALUNOS
    static class AlunoCadastro {
        String nome;
        int idade;
        String curso;
        String matricula;

        void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Curso: " + curso);
            System.out.println("Matricula: " + matricula);
            System.out.println("-------------------------");
        }
    }

    // ATIVIDADE 3 - CADASTRO DE VEICULOS
    static class Carro {
        String modelo;
        String marca;
        int ano;
        boolean ligado;

        void ligar() {
            if (!ligado) {
                ligado = true;
                System.out.println(modelo + " foi ligado.");
            } else {
                System.out.println(modelo + " ja esta ligado.");
            }
        }

        void desligar() {
            if (ligado) {
                ligado = false;
                System.out.println(modelo + " foi desligado.");
            } else {
                System.out.println(modelo + " ja esta desligado.");
            }
        }

        void exibirInformacoes() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Marca: " + marca);
            System.out.println("Ano: " + ano);
            System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        }
    }

    // ATIVIDADE 4 - SISTEMA DE PRODUTOS
    static class ProdutoDesconto {
        String nome;
        double preco;
        int quantidade;

        ProdutoDesconto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        double calcularValorEstoque() {
            return preco * quantidade;
        }

        void aplicarDesconto(double percentual) {
            if (percentual >= 0 && percentual <= 100) {
                preco -= preco * percentual / 100;
                System.out.println("Desconto aplicado!");
            } else {
                System.out.println("Percentual de desconto invalido.");
            }
        }

        void exibirProduto() {
            System.out.println("Produto: " + nome);
            System.out.printf("Preco: R$ %.2f%n", preco);
            System.out.println("Quantidade: " + quantidade);
            System.out.printf("Valor total em estoque: R$ %.2f%n", calcularValorEstoque());
        }
    }

    // ATIVIDADE 5 - CADASTRO DE CELULARES
    static class Celular {
        String marca;
        String modelo;
        int bateria;

        void ligar() {
            if (bateria > 0) {
                System.out.println(modelo + " esta ligado.");
            } else {
                System.out.println(modelo + " nao pode ligar: bateria descarregada.");
            }
        }

        void exibirInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Bateria: " + bateria + "%");
        }

        void carregarBateria() {
            bateria += 20;

            if (bateria > 100) {
                bateria = 100;
            }

            System.out.println("Bateria de " + modelo + ": " + bateria + "%");
        }
    }

    // ATIVIDADE 6 - CADASTRO DE ANIMAIS
    static class Cachorro {
        String nome;
        String raca;
        int idade;

        void latir() {
            System.out.println(nome + " esta latindo: Au au!");
        }

        void brincar() {
            System.out.println(nome + " esta brincando.");
        }

        void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Raca: " + raca);
            System.out.println("Idade: " + idade + " anos");
        }
    }

    // ATIVIDADE 7 - ALUNOS E NOTAS
    static class AlunoNotas {
        String nome;
        double nota1;
        double nota2;

        double calcularMedia() {
            return (nota1 + nota2) / 2;
        }

        void exibirResultado() {
            double media = calcularMedia();

            System.out.println("Aluno: " + nome);
            System.out.printf("Media: %.2f%n", media);

            if (media >= 7.0) {
                System.out.println("Situacao: Aprovado");
            } else {
                System.out.println("Situacao: Reprovado");
            }
        }
    }

    // ATIVIDADE 8 - LAMPADA INTELIGENTE
    static class Lampada {
        String cor;
        int potencia;
        boolean ligada;

        void ligar() {
            ligada = true;
            System.out.println("Lampada ligada.");
        }

        void desligar() {
            ligada = false;
            System.out.println("Lampada desligada.");
        }

        void mostrarEstado() {
            System.out.println("Cor: " + cor);
            System.out.println("Potencia: " + potencia + " W");
            System.out.println("Estado: " + (ligada ? "Ligada" : "Desligada"));
        }
    }

    // ATIVIDADE 9 - CADASTRO DE LIVROS
    static class Livro {
        String titulo;
        String autor;
        int numeroPaginas;
        boolean aberto;

        void abrirLivro() {
            if (!aberto) {
                aberto = true;
                System.out.println("O livro " + titulo + " foi aberto.");
            } else {
                System.out.println("O livro " + titulo + " ja esta aberto.");
            }
        }

        void fecharLivro() {
            if (aberto) {
                aberto = false;
                System.out.println("O livro " + titulo + " foi fechado.");
            } else {
                System.out.println("O livro " + titulo + " ja esta fechado.");
            }
        }

        void mostrarDetalhes() {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Numero de paginas: " + numeroPaginas);
            System.out.println("Estado: " + (aberto ? "Aberto" : "Fechado"));
        }
    }

    // ATIVIDADE 10 - CALCULADORA
    static class Calculadora {
        double somar(double a, double b) {
            return a + b;
        }

        double subtrair(double a, double b) {
            return a - b;
        }

        double multiplicar(double a, double b) {
            return a * b;
        }

        double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("Erro: nao e possivel dividir por zero.");
                return 0;
            }

            return a / b;
        }
    }

    // ATIVIDADE 11 - CONTROLE DE TELEVISAO
    static class Televisao {
        String marca;
        int volume;
        int canal;

        void aumentarVolume() {
            if (volume < 100) {
                volume++;
            } else {
                System.out.println("Volume maximo atingido.");
            }
        }

        void diminuirVolume() {
            if (volume > 0) {
                volume--;
            } else {
                System.out.println("Volume minimo atingido.");
            }
        }

        void mudarCanal(int novoCanal) {
            if (novoCanal > 0) {
                canal = novoCanal;
            } else {
                System.out.println("Canal invalido.");
            }
        }

        void exibirInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal);
        }
    }

    // ATIVIDADE 12 - CONTROLE DE ESTOQUE
    static class ProdutoEstoque {
        String nome;
        double preco;
        int quantidade;

        void adicionarEstoque(int quantidade) {
            if (quantidade > 0) {
                this.quantidade += quantidade;
                System.out.println("Entrada registrada.");
            } else {
                System.out.println("Quantidade para adicionar deve ser positiva.");
            }
        }

        void retirarEstoque(int quantidade) {
            if (quantidade > 0 && quantidade <= this.quantidade) {
                this.quantidade -= quantidade;
                System.out.println("Saida registrada.");
            } else {
                System.out.println("Quantidade invalida ou estoque insuficiente.");
            }
        }

        void mostrarEstoque() {
            System.out.println("Produto: " + nome);
            System.out.printf("Preco: R$ %.2f%n", preco);
            System.out.println("Quantidade em estoque: " + quantidade);
        }
    }

    // ATIVIDADE 13 - CONTROLE DE TEMPERATURA
    static class ArCondicionado {
        String marca;
        int temperatura;
        boolean ligado;

        void ligar() {
            ligado = true;
            System.out.println("Ar-condicionado ligado.");
        }

        void desligar() {
            ligado = false;
            System.out.println("Ar-condicionado desligado.");
        }

        void aumentarTemperatura() {
            if (temperatura < 30) {
                temperatura++;
            } else {
                System.out.println("Temperatura maxima de 30 C atingida.");
            }
        }

        void diminuirTemperatura() {
            if (temperatura > 16) {
                temperatura--;
            } else {
                System.out.println("Temperatura minima de 16 C atingida.");
            }
        }

        void mostrarInformacoes() {
            System.out.println("Marca: " + marca);
            System.out.println("Temperatura: " + temperatura + " C");
            System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        }
    }

    // METODOS PARA EXECUTAR CADA ATIVIDADE

    static void atividade1() {
        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Joao";
        conta.numeroConta = 12345;
        conta.saldo = 500.00;

        conta.exibirSaldo();
        conta.depositar(200.00);
        conta.sacar(100.00);
        conta.exibirSaldo();
    }

    static void atividade2() {
        AlunoCadastro aluno1 = new AlunoCadastro();
        AlunoCadastro aluno2 = new AlunoCadastro();
        AlunoCadastro aluno3 = new AlunoCadastro();

        aluno1.nome = "Carlos";
        aluno1.idade = 20;
        aluno1.curso = "ADS";
        aluno1.matricula = "2026001";

        aluno2.nome = "Maria";
        aluno2.idade = 22;
        aluno2.curso = "Engenharia";
        aluno2.matricula = "2026002";

        aluno3.nome = "Pedro";
        aluno3.idade = 19;
        aluno3.curso = "Direito";
        aluno3.matricula = "2026003";

        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
    }

    static void atividade3() {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;

        carro2.modelo = "Onix";
        carro2.marca = "Chevrolet";
        carro2.ano = 2023;

        carro1.ligar();
        carro1.ligar();
        carro1.desligar();
        carro2.ligar();

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
    }

    static void atividade4() {
        ProdutoDesconto produto1 = new ProdutoDesconto("Notebook", 3000.00, 5);
        ProdutoDesconto produto2 = new ProdutoDesconto("Mouse", 50.00, 10);
        ProdutoDesconto produto3 = new ProdutoDesconto("Teclado", 120.00, 8);

        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();

        produto2.aplicarDesconto(10);
        produto2.exibirProduto();
    }

    static void atividade5() {
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();

        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy";
        celular1.bateria = 40;

        celular2.marca = "Apple";
        celular2.modelo = "iPhone";
        celular2.bateria = 60;

        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        celular1.carregarBateria();
        celular2.carregarBateria();

        celular1.ligar();
        celular2.ligar();
    }

    static void atividade6() {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        Cachorro cachorro3 = new Cachorro();

        cachorro1.nome = "Rex";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 3;

        cachorro2.nome = "Bob";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 2;

        cachorro3.nome = "Thor";
        cachorro3.raca = "Pastor Alemao";
        cachorro3.idade = 5;

        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();

        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();

        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();
    }

    static void atividade7() {
        AlunoNotas aluno1 = new AlunoNotas();
        AlunoNotas aluno2 = new AlunoNotas();

        aluno1.nome = "Carlos";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 9.0;

        aluno2.nome = "Maria";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }

    static void atividade8() {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        lampada1.cor = "Branca";
        lampada1.potencia = 12;
        lampada1.ligada = true;

        lampada2.cor = "Amarela";
        lampada2.potencia = 9;
        lampada2.ligada = false;

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

        lampada2.ligar();
        lampada2.mostrarEstado();
    }

    static void atividade9() {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.titulo = "Dom Casmurro";
        livro1.autor = "Machado de Assis";
        livro1.numeroPaginas = 256;

        livro2.titulo = "O Pequeno Principe";
        livro2.autor = "Antoine de Saint-Exupery";
        livro2.numeroPaginas = 96;

        livro3.titulo = "Harry Potter";
        livro3.autor = "J. K. Rowling";
        livro3.numeroPaginas = 300;

        livro1.mostrarDetalhes();
        livro2.mostrarDetalhes();
        livro3.mostrarDetalhes();

        livro1.abrirLivro();
        livro1.fecharLivro();
        livro2.abrirLivro();
        livro3.abrirLivro();
    }

    static void atividade10() {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma: " + calculadora.somar(10, 5));
        System.out.println("Subtracao: " + calculadora.subtrair(10, 5));
        System.out.println("Multiplicacao: " + calculadora.multiplicar(10, 5));
        System.out.println("Divisao: " + calculadora.dividir(10, 5));

        System.out.println("Teste de divisao por zero:");
        calculadora.dividir(10, 0);
    }

    static void atividade11() {
        Televisao tv = new Televisao();

        tv.marca = "Samsung";
        tv.volume = 50;
        tv.canal = 10;

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(25);

        tv.exibirInformacoes();
    }

    static void atividade12() {
        ProdutoEstoque produto1 = new ProdutoEstoque();
        ProdutoEstoque produto2 = new ProdutoEstoque();

        produto1.nome = "Mouse";
        produto1.preco = 50.00;
        produto1.quantidade = 10;

        produto2.nome = "Teclado";
        produto2.preco = 120.00;
        produto2.quantidade = 5;

        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(3);

        produto2.adicionarEstoque(10);
        produto2.retirarEstoque(2);

        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }

    static void atividade13() {
        ArCondicionado ar = new ArCondicionado();

        ar.marca = "LG";
        ar.temperatura = 24;
        ar.ligado = false;

        ar.ligar();
        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.diminuirTemperatura();

        ar.mostrarInformacoes();

        ar.desligar();
        ar.mostrarInformacoes();
    }

    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n========== ATIVIDADES DE JAVA - POO ==========");
            System.out.println("1 - Conta Bancaria");
            System.out.println("2 - Cadastro de Alunos");
            System.out.println("3 - Cadastro de Veiculos");
            System.out.println("4 - Sistema de Produtos");
            System.out.println("5 - Cadastro de Celulares");
            System.out.println("6 - Cadastro de Animais");
            System.out.println("7 - Alunos e Notas");
            System.out.println("8 - Lampada Inteligente");
            System.out.println("9 - Cadastro de Livros");
            System.out.println("10 - Calculadora");
            System.out.println("11 - Controle de Televisao");
            System.out.println("12 - Controle de Estoque");
            System.out.println("13 - Controle de Temperatura");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma atividade: ");

            while (!entrada.hasNextInt()) {
                System.out.print("Digite um numero valido: ");
                entrada.next();
            }

            opcao = entrada.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    atividade1();
                    break;
                case 2:
                    atividade2();
                    break;
                case 3:
                    atividade3();
                    break;
                case 4:
                    atividade4();
                    break;
                case 5:
                    atividade5();
                    break;
                case 6:
                    atividade6();
                    break;
                case 7:
                    atividade7();
                    break;
                case 8:
                    atividade8();
                    break;
                case 9:
                    atividade9();
                    break;
                case 10:
                    atividade10();
                    break;
                case 11:
                    atividade11();
                    break;
                case 12:
                    atividade12();
                    break;
                case 13:
                    atividade13();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida. Escolha de 0 a 13.");
            }

        } while (opcao != 0);

        entrada.close();
    }
}
