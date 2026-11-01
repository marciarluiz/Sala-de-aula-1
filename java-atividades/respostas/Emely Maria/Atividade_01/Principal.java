public class Principal {
    public static void main(String[] args) {
        // Atividade 1
        ContaBancaria c = new ContaBancaria(); c.titular = "Maria"; c.depositar(200); c.sacar(100); c.exibirSaldo();
        
        // Atividade 2
        AlunoA2 a = new AlunoA2(); a.nome = "Ana"; a.idade = 20; a.curso = "Engenharia"; a.matricula = "202601"; a.exibirDados();
        
        // Atividade 3
        Carro car = new Carro(); car.modelo = "Corolla"; car.ligar(); car.ligar(); car.desligar(); car.exibirInformacoes();
        
        // Atividade 4
        ProdutoA4 p = new ProdutoA4("Caderno", 20.0, 10); p.aplicarDesconto(10); p.exibirProduto();
        
        // Atividade 5
        Celular cel = new Celular(); cel.modelo = "S22"; cel.bateria = 30; cel.carregarBateria(50); cel.exibirInformacoes();
        
        // Atividade 6
        Cachorro dog = new Cachorro(); dog.nome = "Rex"; dog.latir(); dog.brincar(); dog.exibirDados();
        
        // Atividade 7
        AlunoA7 al = new AlunoA7(); al.nome = "Lucas"; al.nota1 = 8.0; al.nota2 = 6.5; al.exibirResultado();
        
        // Atividade 8
        Lampada l = new Lampada(); l.cor = "Branca"; l.potencia = 10; l.ligar(); l.mostrarEstado();
        
        // Atividade 9
        Livro liv = new Livro(); liv.titulo = "Java"; liv.abrirLivro(); liv.fecharLivro(); liv.mostrarDetalhes();
        
        // Atividade 10
        Calculadora calc = new Calculadora(); System.out.println("Soma: " + calc.somar(10, 5) + " | Div: " + calc.dividir(10, 0));
        
        // Atividade 11
        Televisao tv = new Televisao(); tv.volume = 99; tv.aumentarVolume(); tv.aumentarVolume(); tv.mudarCanal(5);
        
        // Atividade 12
        ProdutoA12 prod = new ProdutoA12(); prod.nome = "Camisa"; prod.quantidade = 5; prod.retirarEstoque(10); prod.mostrarEstoque();
        
        // Atividade 13
        ArCondicionado ar = new ArCondicionado(); ar.temperatura = 30; ar.aumentarTemperatura(); ar.desligar();
    }
}

class ContaBancaria {
    String titular; int numeroConta; double saldo;
    void depositar(double v) { saldo += v; }
    void sacar(double v) { if (saldo >= v) saldo -= v; }
    void exibirSaldo() { System.out.println("Conta: " + titular + " | Saldo: R$ " + saldo); }
}

class AlunoA2 {
    String nome, curso, matricula; int idade;
    void exibirDados() { System.out.println("Aluno: " + nome + " (" + matricula + ") - " + curso); }
}

class Carro {
    String modelo, marca; int ano; boolean ligado;
    void ligar() { if (!ligado) ligado = true; else System.out.println("Carro já ligado!"); }
    void desligar() { ligado = false; }
    void exibirInformacoes() { System.out.println("Carro " + modelo + " | Ligado: " + ligado); }
}

class ProdutoA4 {
    String nome; double preco; int quantidade;
    ProdutoA4(String n, double p, int q) { nome = n; preco = p; quantidade = q; }
    double calcularValorEstoque() { return preco * quantidade; }
    void aplicarDesconto(double pct) { preco -= preco * (pct / 100); }
    void exibirProduto() { System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Total: R$ " + calcularValorEstoque()); }
}

class Celular {
    String marca, modelo; int bateria;
    void carregarBateria(int q) { bateria = Math.min(100, bateria + q); }
    void exibirInformacoes() { System.out.println("Celular " + modelo + " | Bateria: " + bateria + "%"); }
}

class Cachorro {
    String nome, raca; int idade;
    void latir() { System.out.println(nome + " latiu."); }
    void brincar() { System.out.println(nome + " brincou."); }
    void exibirDados() { System.out.println("Cachorro: " + nome); }
}

class AlunoA7 {
    String nome; double nota1, nota2;
    double calcularMedia() { return (nota1 + nota2) / 2; }
    void exibirResultado() { System.out.println("Aluno " + nome + " | Média: " + calcularMedia() + " | " + (calcularMedia() >= 7 ? "Aprovado" : "Reprovado")); }
}

class Lampada {
    String cor; double potencia; boolean ligada;
    void ligar() { ligada = true; }
    void desligar() { ligada = false; }
    void mostrarEstado() { System.out.println("Lâmpada " + cor + " | Ligada: " + ligada); }
}

class Livro {
    String titulo, autor; int numeroPaginas; boolean aberto;
    void abrirLivro() { aberto = true; }
    void fecharLivro() { aberto = false; }
    void mostrarDetalhes() { System.out.println("Livro: " + titulo + " | Aberto: " + aberto); }
}

class Calculadora {
    double somar(double a, double b) { return a + b; }
    double subtrair(double a, double b) { return a - b; }
    double multiplicar(double a, double b) { return a * b; }
    double dividir(double a, double b) { if (b == 0) { System.out.println("Erro: Divisão por zero!"); return 0; } return a / b; }
}

class Televisao {
    String marca; int volume, canal;
    void aumentarVolume() { if (volume < 100) volume++; }
    void diminuirVolume() { if (volume > 0) volume--; }
    void mudarCanal(int c) { canal = c; }
}

class ProdutoA12 {
    String nome; double preco; int quantidade;
    void adicionarEstoque(int q) { quantidade += q; }
    void retirarEstoque(int q) { if (quantidade >= q) quantidade -= q; else System.out.println("Estoque insuficiente!"); }
    void mostrarEstoque() { System.out.println("Estoque " + nome + ": " + quantidade); }
}

class ArCondicionado {
    String marca; int temperatura; boolean ligado;
    void ligar() { ligado = true; }
    void desligar() { ligado = false; }
    void aumentarTemperatura() { if (temperatura < 30) temperatura++; }
    void diminuirTemperatura() { if (temperatura > 16) temperatura--; }
}