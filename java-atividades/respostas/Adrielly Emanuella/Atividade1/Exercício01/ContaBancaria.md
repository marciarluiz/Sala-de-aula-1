# Atividade 1 — Conta Bancária

## Objetivo
Criar uma classe chamada `ContaBancaria` para guardar os dados de uma conta e realizar operações de depósito, saque e exibição do saldo.

## 1. Atributos

Os atributos guardam as informações da conta.

```java
String titular;
int numeroConta;
double saldo;
```

- `titular`: nome do dono da conta.
- `numeroConta`: número da conta bancária.
- `saldo`: dinheiro disponível na conta.

## 2. Método depositar()

```java
void depositar(double valor) {
    saldo += valor;
    System.out.println("Deposito realizado!");
}
```

Esse método recebe um valor e adiciona ao saldo da conta. Depois, mostra uma mensagem informando que o depósito foi realizado.

## 3. Método sacar()

```java
void sacar(double valor) {
    if (valor <= saldo) {
        saldo -= valor;
        System.out.println("Saque realizado!");
    } else {
        System.out.println("Saldo insuficiente!");
    }
}
```

Esse método verifica se o valor do saque é menor ou igual ao saldo disponível.

- Se houver saldo suficiente, o dinheiro é retirado.
- Caso contrário, aparece a mensagem de saldo insuficiente.

## 4. Método exibirSaldo()

```java
void exibirSaldo() {
    System.out.println("Titular: " + titular);
    System.out.println("Numero da conta: " + numeroConta);
    System.out.println("Saldo: R$ " + saldo);
}
```

Esse método mostra o nome do titular, o número da conta e o saldo atual.

## 5. Método main()

```java
public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.titular = "Adrielly";
    conta.numeroConta = 123;
    conta.saldo = 100;

    conta.depositar(50);
    conta.sacar(30);
    conta.exibirSaldo();
}
```

O método `main()` é onde o programa começa a ser executado.

Primeiro, é criado um objeto da classe `ContaBancaria`. Depois, são preenchidos os dados da conta e realizados um depósito de R$ 50,00 e um saque de R$ 30,00.

## 6. Resultado esperado

```text
Deposito realizado!
Saque realizado!
Titular: Adrielly
Numero da conta: 123
Saldo: R$ 120.0
```
