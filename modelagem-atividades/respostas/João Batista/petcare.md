# Resolução do Estudo de Caso — Sistema PetCare

**Disciplina:** Engenharia de Requisitos / Análise de Sistemas  
**Aluno:** João Batista Almeida 
**Data:** 20 de Novembro 2026  

---

## 1. Identificação de Stakeholders e Técnicas de Elicitação

### Stakeholders
Tutores dos animais -	Agendar consultas pelo celular, consultar informações dos animais e receber lembretes de vacinação.
Veterinários -	Consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
Recepcionistas -	Controlar horários disponíveis, confirmar consultas e realizar cancelamentos.
Gerência - Acompanhar relatórios sobre a quantidade de atendimentos e o funcionamento da clínica.
Proprietário - Garantir que o sistema seja rápido, seguro, fácil de utilizar e entregue dentro do prazo de quatro meses.
Equipe de desenvolvimento -	Compreender as necessidades, definir prioridades e desenvolver um sistema que atenda aos objetivos da clínica.

### Técnicas de Elicitação
 Entrevistas - A equipe realizará conversas individuais com tutores, veterinários, recepcionistas e gerência para entender suas dificuldades e expectativas.

Por exemplo, os veterinários poderão explicar quais informações precisam consultar durante uma consulta, enquanto os tutores poderão apresentar suas dificuldades para realizar agendamentos.

Justificativa: permite compreender melhor as necessidades de cada grupo e identificar problemas que não seriam percebidos apenas com observações superficia

Questionarios - Serão aplicados questionários aos tutores e funcionários para identificar quais funcionalidades são mais importantes, quais dificuldades enfrentam atualmente e quais melhorias esperam do PetCare.

Justificativa: permite coletar opiniões de várias pessoas em pouco tempo, ajudando a identificar necessidades comuns e estabelecer prioridades.
---

## 2. Requisitos Funcionais e Não Funcionais

### Requisitos Funcionais (RF)
RF01 -	O sistema deve permitir que os tutores realizem agendamentos de consultas pelo aplicativo.
RF02-	O sistema deve permitir que a recepção consulte horários disponíveis, confirme e cancele consultas.
RF03- 	O sistema deve armazenar o histórico dos animais, incluindo consultas, vacinas e medicamentos.
RF04 - O sistema deve permitir que os veterinários registrem diagnósticos e tratamentos dos animais.
RF05 - O sistema deve enviar lembretes de vacinação aos tutores.
RF06 -	O sistema deve permitir que a gerência consulte relatórios sobre a quantidade de atendimentos realizados.
RF07 -	O sistema deve permitir que os tutores cadastrem seus animais e consultem suas informações.

### Requisitos Não Funcionais (RNF)
* **RNF01 (Desempenho):** A busca por qualquer histórico do animal deve ser concluída e exibida na tela em no máximo 2 segundos.
* **RNF02 (Usabilidade):** A interface deve ser simples para que um tutor consiga agendar uma consulta em até 3 passos a partir da tela inicial.
* **RNF03 (Segurança):** O sistema deve restringir o acesso às fichas médicas apenas a usuários autenticados e criptografar as senhas no banco de dados.

---

## 3. Classificação das Funcionalidades (MoSCoW)

* **Must Have (Obrigatório para o sistema funcionar):**
  * Cadastro de tutores, animais e veterinários.
  * Agendamento e cancelamento de consultas (Tutor e Recepção).
  * Prontuário eletrônico para registro de diagnósticos, vacinas e tratamentos.
  * Login e controle de acesso por perfil de usuário.

* **Should Have (Muito importante, mas não impede a abertura do sistema):**
  * Lembretes automáticos de vacinação e consultas para os tutores.
  * Relatórios de quantidade de atendimentos para o gerente.

* **Could Have (Desejável para próximas atualizações):**
  * Pagamento das consultas diretamente pelo aplicativo.
  * Notificações *push* customizadas na tela do celular.

* **Won't Have (Fora do escopo para a entrega em 4 meses):**
  * Chat em tempo real entre tutor e veterinário (exige acompanhamento constante e pode atrasar o projeto).
  * Feed/Área para publicação de fotos dos animais (não agrega valor direto ao atendimento clínico inicial).

---

## 4. Especificação de Requisitos Limpos e MENSURÁVEIS

Transformando frases subjetivas em critérios testáveis:

* **Em vez de "O sistema deve ser rápido":**
  * *Requisito:* "O sistema deve processar a confirmação de agendamento e a abertura de prontuários em no máximo 2 segundos sob conexão padrão de internet."


* **Em vez de "O sistema deve ser muito fácil de usar":**
  * *Requisito:* "Um tutor novo deve conseguir concluir o agendamento de uma consulta em menos de 2 minutos no primeiro acesso, sem necessitar de suporte ou instrução prévia."

---

## 5. Validação dos Requisitos

Antes de iniciar o desenvolvimento, a equipe precisa confirmar se os requisitos documentados representam corretamente as necessidades dos stakeholders.

 1. Prototipação

A equipe desenvolverá modelos visuais das principais telas do PetCare, como cadastro de animais, agendamento de consultas e histórico veterinário.

Esses modelos serão apresentados aos tutores, veterinários e recepcionistas para que possam avaliar a organização e sugerir alterações.

Como ajuda: permite identificar dificuldades de navegação, funcionalidades ausentes e problemas na organização das informações antes de começar a programação.

2. Reuniões de validação

A equipe realizará reuniões com representantes de cada grupo de stakeholders para apresentar os requisitos funcionais e não funcionais.

Durante as reuniões, os participantes poderão confirmar as funcionalidades, apontar erros e sugerir alterações.

Como ajuda: evita divergências entre o que os usuários esperam e aquilo que a equipe pretende desenvolver, reduzindo retrabalho.

---

## 6.Escolha das 5 Funcionalidades Essenciais para o MVP (Prazo de 4 Meses e Orçamento Limitado)

Caso seja necessário escolher estritamente **5 funcionalidades principais** para a primeira versão, a seleção priorizará o fluxo completo de atendimento e operação da clínica:

1. **Cadastro de Tutores e Animais:** Base indispensável para vincular os pet aos donos e organizar as fichas.
2. **Agendamento e Controle de Consultas (Tutor e Recepção):** Resolve a dor central de organizar a agenda, acabando com a dependência exclusiva do papel e do WhatsApp.
3. **Prontuário Eletrônico e Registro de Vacinas:** Substitui as fichas físicas, permitindo que o veterinário registre diagnósticos, receitas e vacinas em um só lugar.
4. **Consulta do Histórico Médico do Animal:** Permite ao veterinário acessar rapidamente dados de consultas anteriores, melhorando a velocidade e a qualidade do atendimento.
5. **Envio de Lembretes Automáticos de Vacinas/Consultas:** Garante o retorno dos clientes e reduz a taxa de esquecimento, trazendo retorno financeiro direto para a clínica.

### Justificativa da Escolha:
Com essas 5 funcionalidades, o PetCare resolve 100% dos problemas operacionais prioritários: agendamento, organização do atendimento médico, fim do papel e fidelização dos clientes. Recursos como relatórios, pagamentos no app e chat podem ser adicionados em versões futuras assim que a clínica levantar novo orçamento.