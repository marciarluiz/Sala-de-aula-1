# Gabarito comentado — Atividades 11 a 20

| Questão | Gabarito |
|:-------:|:--------:|
| 11 | **b** |
| 12 | **c** |
| 13 | **e** |
| 14 | **a** |
| 15 | **d** |
| 16 | **b** |
| 17 | **c** |
| 18 | **a** |
| 19 | **e** |
| 20 | **b** |

---

## Atividade 11 — Estilo FCC (2020) — **b**
Uma **classe** é o molde (modelo) que define os **atributos** (dados) e os **comportamentos** (métodos) dos objetos. A alternativa (a) descreve um *objeto/instância*; (c) e (d) não têm relação com o conceito; (e) está errada porque classes normalmente possuem atributos.

## Atividade 12 — Estilo FGV (2023) — **c**
Proteger o atributo `saldo` e permitir sua alteração apenas por meio de métodos (`depositar()` e `sacar()`) é **encapsulamento**: ocultar o estado interno do objeto e controlar o acesso a ele. Herança, polimorfismo, sobrecarga e generalização tratam de outros assuntos.

## Atividade 13 — Estilo VUNESP (2022) — **e**
`Professor` e `Aluno` compartilham atributos definidos em `Pessoa`: é uma relação "é um" (Professor *é uma* Pessoa), ou seja, **herança** (generalização/especialização). Composição e agregação seriam relações "tem um"; associação e dependência não implicam compartilhamento de atributos por derivação.

## Atividade 14 — Estilo Instituto AOCP (2024) — **a**
Quando a mesma operação (`emitirSom()`) se comporta de forma diferente conforme o objeto (Cachorro → "Au au!", Gato → "Miau!"), temos **polimorfismo** (aqui, por sobrescrita). Normalização, decomposição funcional, persistência e indexação não são conceitos de POO.

## Atividade 15 — Estilo Cebraspe (2021) — **d**
A UML é uma **linguagem visual padronizada** para **especificar, visualizar e documentar** sistemas. Não é linguagem de programação (a), nem exclusiva de banco de dados (b) ou de interfaces (c), nem compilador (e).

## Atividade 16 — Estilo FCC (2022) — **b**
Na UML: **+ = público**, **– = privado**, **# = protegido**. Portanto, a ordem "+, - e #" corresponde a *público, privado e protegido*.

## Atividade 17 — Estilo FGV (2023) — **c**
A resposta esperada é a **(c)**: os atributos (`nome`, `matricula`) são privados e os métodos (`getNome()`, `estudar()`) são públicos, que é o padrão de encapsulamento.

> **Observação:** no texto do enunciado que foi colado, os símbolos de visibilidade (`-` e `+`) aparecem perdidos. Na prova original, a classe aparece como `- nome : String`, `- matricula : int`, `+ getNome() : String`, `+ estudar() : void`. Mesmo assim, as demais alternativas estão erradas por outros motivos: (b) `estudar()` retorna `void`, não texto; (d) a classe possui atributos; (e) `getNome()` retorna `String`.

## Atividade 18 — Estilo VUNESP (2024) — **a**
Um usuário pode fazer **vários** empréstimos, inclusive **nenhum** (0..\*), e cada empréstimo pertence a **exatamente um** usuário (1). Logo: **Usuario 1 — 0..\* Emprestimo**.

## Atividade 19 — Estilo Instituto Quadrix (2023) — **e**
- **Diagrama de casos de uso:** funcionalidades do sistema e atores.
- **Diagrama de classes:** classes, atributos, métodos e relacionamentos.
- **Diagrama de sequência:** interação (troca de mensagens) entre objetos ao longo do tempo.

As demais alternativas trocam ou restringem indevidamente as finalidades dos diagramas.

## Atividade 20 — Código Java — **b**
`Cachorro extends Animal` indica herança, e `@Override` indica que `emitirSom()` foi sobrescrito. Como `cachorro` é um objeto da classe `Cachorro`, o método executado é o da subclasse, e a saída é **`Au au!`**.

- (a) Errada: subclasses podem (e é comum) ter métodos com o mesmo nome, é exatamente a sobrescrita.
- (c) Errada: `extends` cria herança; objetos são criados com `new`.
- (d) Errada: `@Override` só pede ao compilador para verificar a sobrescrita; não impede a execução.
- (e) Errada: o método da subclasse tem prioridade sobre o da superclasse.
