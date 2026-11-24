# Atividade 1 — Engenharia de Requisitos

**Aluna:** Adrielly Emanuella  
**Curso:** Análise e Desenvolvimento de Sistemas  
**Turma:** 1º período de ADS  
**Disciplina:** Modelagem e Análise de Sistemas

---

# Caso 1 — Conecta Campus

## 1. Identificação dos requisitos

### a) Requisitos funcionais (RF)

**RF01 — Cadastro de usuários:** O sistema deve permitir que estudantes e professores realizem cadastro na plataforma.

**RF02 — Autenticação:** O sistema deve permitir que usuários cadastrados façam login utilizando suas credenciais.

**RF03 — Publicação de eventos:** O sistema deve permitir que professores e usuários autorizados publiquem eventos acadêmicos.

**RF04 — Inscrição em eventos:** O sistema deve permitir que estudantes visualizem os eventos disponíveis e realizem inscrições.

**RF05 — Notificações:** O sistema deve enviar notificações aos estudantes sobre eventos e atividades acadêmicas de seu interesse.

**RF06 — Consulta de eventos:** O sistema deve permitir que os usuários consultem os eventos publicados, visualizando informações como data, horário, local e descrição.

### b) Requisitos não funcionais (RNF)

**RNF01 — Usabilidade:** O sistema deve possuir uma interface simples e intuitiva, permitindo que os usuários encontrem as informações sem dificuldades.

**RNF02 — Segurança:** O sistema deve proteger os dados pessoais dos usuários e permitir acesso às funcionalidades conforme o perfil de cada usuário.

**RNF03 — Desempenho:** O sistema deve apresentar as informações dos eventos em tempo adequado, mesmo quando vários usuários estiverem acessando a plataforma simultaneamente.

## 2. Priorização dos requisitos

Utilizando a técnica MoSCoW, os requisitos são classificados em quatro categorias: Must Have (obrigatório), Should Have (importante), Could Have (desejável) e Won't Have (não será implementado nesta versão).

| Requisito | Prioridade | Justificativa |
|---|---|---|
| RF01 — Cadastro de usuários | Must Have | Necessário para identificar os usuários da plataforma. |
| RF02 — Autenticação | Must Have | Necessária para proteger o acesso ao sistema. |
| RF03 — Publicação de eventos | Must Have | Permite disponibilizar os eventos acadêmicos. |
| RF04 — Inscrição em eventos | Must Have | É uma das principais funcionalidades do sistema. |
| RF05 — Notificações | Should Have | Facilita o acompanhamento dos eventos pelos estudantes. |
| RF06 — Consulta de eventos | Must Have | Permite que os usuários encontrem os eventos disponíveis. |
| RNF01 — Usabilidade | Must Have | É essencial para que os usuários utilizem a plataforma com facilidade. |
| RNF02 — Segurança | Must Have | Protege as informações pessoais dos usuários. |
| RNF03 — Desempenho | Should Have | Contribui para uma experiência adequada durante o acesso. |

## 3. Critérios de aceitação

**RF01 — Cadastro de usuários:** O cadastro deve ser concluído quando o usuário preencher os campos obrigatórios com informações válidas. Caso existam campos inválidos ou obrigatórios não preenchidos, o sistema deverá informar o problema.

**RF02 — Autenticação:** O usuário deverá conseguir acessar o sistema com credenciais válidas. Caso informe credenciais incorretas, o sistema deverá negar o acesso e apresentar uma mensagem de erro.

**RF03 — Publicação de eventos:** Um usuário autorizado deverá conseguir cadastrar um evento informando título, descrição, data, horário e local. Após a publicação, o evento deverá aparecer na lista de eventos disponíveis.

**RF04 — Inscrição em eventos:** O estudante deverá conseguir selecionar um evento disponível e realizar sua inscrição. Após a confirmação, o sistema deverá apresentar uma mensagem informando que a inscrição foi realizada.

**RF05 — Notificações:** Quando houver uma notificação referente a um evento de interesse do estudante, o sistema deverá disponibilizá-la ao usuário.

**RF06 — Consulta de eventos:** Ao acessar a lista de eventos, o usuário deverá visualizar as informações cadastradas, incluindo título, data, horário e local.

## 4. Validação dos requisitos

Para validar os requisitos do Conecta Campus, podem ser utilizadas as seguintes técnicas:

**Entrevistas:** conversar com estudantes e professores para compreender suas necessidades e verificar se os requisitos atendem às expectativas dos usuários.

**Prototipação:** criar modelos das telas do sistema para que os usuários avaliem a organização, a navegação e as funcionalidades antes do desenvolvimento.

**Revisão dos requisitos:** analisar os requisitos com os usuários e responsáveis pelo projeto para identificar inconsistências, ambiguidades ou informações ausentes.

**Testes de aceitação:** verificar se o sistema desenvolvido atende aos critérios de aceitação definidos para cada funcionalidade.

Essas técnicas ajudam a garantir que o sistema seja desenvolvido de acordo com as necessidades dos estudantes e professores.

## 5. Requisitos implícitos

Um requisito implícito é aquele que não foi declarado diretamente, mas que pode ser identificado como necessário para o funcionamento adequado do sistema.

No Conecta Campus, podem ser identificados os seguintes requisitos implícitos:

- O sistema deve permitir a recuperação de senha caso o usuário a esqueça.
- O sistema deve impedir que usuários não autorizados publiquem ou alterem eventos.
- O sistema deve evitar inscrições duplicadas do mesmo estudante em um evento.
- O sistema deve permitir que os usuários consultem informações atualizadas sobre os eventos.
- O sistema deve proteger as informações pessoais dos usuários.

Esses requisitos são importantes porque contribuem para a segurança, a confiabilidade e a facilidade de utilização da plataforma.

## 6. Riscos de requisitos mal definidos

Requisitos mal definidos podem causar diversos problemas durante o desenvolvimento do Conecta Campus.

**Retrabalho:** se uma funcionalidade for desenvolvida de maneira diferente da esperada pelos usuários, será necessário realizar correções.

**Aumento dos custos:** alterações realizadas tardiamente podem exigir mais tempo e recursos da equipe.

**Atrasos na entrega:** dúvidas e inconsistências nos requisitos podem dificultar o planejamento e atrasar o desenvolvimento.

**Insatisfação dos usuários:** se o sistema não atender às necessidades dos estudantes e professores, poderá ser pouco utilizado.

**Falhas de segurança:** requisitos de segurança incompletos podem permitir acessos indevidos ou exposição de informações pessoais.

Por isso, os requisitos devem ser claros, completos, consistentes e validados com os envolvidos no projeto.

---

# Caso 2 — PetCare

## 1. Identificação dos requisitos

### a) Requisitos funcionais (RF)

**RF01 — Cadastro de tutores:** O sistema deve permitir que os tutores cadastrem seus dados pessoais e informações de contato.

**RF02 — Cadastro de animais:** O sistema deve permitir que os tutores cadastrem seus animais, informando nome, espécie, raça, idade e outras informações relevantes.

**RF03 — Agendamento de consultas:** O sistema deve permitir que os tutores agendem consultas veterinárias, selecionando data e horário disponíveis.

**RF04 — Consulta de agendamentos:** O sistema deve permitir que os tutores visualizem os agendamentos realizados.

**RF05 — Histórico de atendimentos:** O sistema deve permitir o registro e a consulta do histórico de atendimentos dos animais.

**RF06 — Controle de vacinas:** O sistema deve permitir o registro das vacinas aplicadas nos animais e das respectivas datas.

**RF07 — Notificações de vacinação:** O sistema deve enviar lembretes aos tutores sobre vacinas próximas do vencimento ou que estejam atrasadas.

### b) Requisitos não funcionais (RNF)

**RNF01 — Segurança:** O sistema deve proteger os dados pessoais dos tutores e as informações relacionadas aos animais.

**RNF02 — Usabilidade:** O sistema deve possuir uma interface simples e de fácil utilização para tutores e profissionais veterinários.

**RNF03 — Disponibilidade:** O sistema deve estar disponível para consulta e realização de agendamentos durante os períodos de funcionamento definidos pelo serviço.

**RNF04 — Desempenho:** O sistema deve processar consultas e agendamentos em tempo adequado, evitando longas esperas para os usuários.

## 2. Priorização dos requisitos

Utilizando a técnica MoSCoW, os requisitos podem ser organizados de acordo com sua importância para a primeira versão do PetCare.

| Requisito | Prioridade | Justificativa |
|---|---|---|
| RF01 — Cadastro de tutores | Must Have | Necessário para identificar os responsáveis pelos animais. |
| RF02 — Cadastro de animais | Must Have | Permite armazenar as informações dos animais atendidos. |
| RF03 — Agendamento de consultas | Must Have | É uma das funcionalidades centrais do sistema. |
| RF04 — Consulta de agendamentos | Must Have | Permite que os tutores acompanhem suas consultas. |
| RF05 — Histórico de atendimentos | Should Have | Ajuda a acompanhar os cuidados veterinários realizados. |
| RF06 — Controle de vacinas | Must Have | Permite manter os registros de vacinação dos animais. |
| RF07 — Notificações de vacinação | Should Have | Ajuda os tutores a manter a vacinação em dia. |
| RNF01 — Segurança | Must Have | É necessária para proteger os dados armazenados. |
| RNF02 — Usabilidade | Must Have | Facilita a utilização do sistema pelos usuários. |
| RNF03 — Disponibilidade | Should Have | Contribui para o acesso ao sistema quando necessário. |
| RNF04 — Desempenho | Should Have | Permite que as funcionalidades sejam executadas adequadamente. |

## 3. Validação dos requisitos

Para validar os requisitos do PetCare, podem ser utilizadas as seguintes técnicas:

**Entrevistas:** conversar com tutores, veterinários e funcionários para compreender as necessidades relacionadas aos cadastros, agendamentos, atendimentos e vacinação.

**Prototipação:** desenvolver modelos das telas para que os usuários avaliem se as funcionalidades são compreensíveis e adequadas às suas necessidades.

**Revisão dos requisitos:** verificar se os requisitos estão claros, completos e sem contradições, envolvendo os responsáveis pelo projeto.

**Testes de aceitação:** verificar se o sistema permite realizar cadastros, agendamentos e registros de vacinação de acordo com os critérios definidos.

Essas técnicas ajudam a identificar problemas antes da conclusão do desenvolvimento e reduzem a possibilidade de retrabalho.

## 4. Cinco funcionalidades prioritárias para a primeira versão

As cinco funcionalidades prioritárias para a primeira versão do PetCare são:

**1. Cadastro de tutores:** permite identificar os responsáveis pelos animais e armazenar suas informações de contato.

**2. Cadastro de animais:** possibilita registrar as informações necessárias para identificar cada animal atendido.

**3. Agendamento de consultas:** permite que os tutores solicitem consultas veterinárias em datas e horários disponíveis.

**4. Consulta de agendamentos:** permite que os tutores acompanhem as consultas marcadas e consultem suas informações.

**5. Controle de vacinas:** possibilita registrar as vacinas aplicadas e acompanhar as datas de vacinação.

Essas funcionalidades foram escolhidas porque atendem às necessidades essenciais de organização dos atendimentos e acompanhamento dos animais.

## 5. Riscos de adiar as demais funcionalidades

Adiar funcionalidades como o histórico de atendimentos e as notificações de vacinação pode trazer alguns riscos.

**Dificuldade no acompanhamento da saúde:** sem o histórico de atendimentos, os profissionais podem ter mais dificuldade para consultar informações sobre procedimentos anteriores.

**Esquecimento de vacinas:** sem as notificações, os tutores podem esquecer as datas de vacinação ou deixar de realizar reforços necessários.

**Maior trabalho manual:** os profissionais poderão precisar utilizar registros separados para acompanhar informações que ainda não estejam disponíveis no sistema.

**Insatisfação dos usuários:** a ausência de funcionalidades desejadas pode reduzir a satisfação dos tutores e profissionais.

Apesar desses riscos, adiar algumas funcionalidades pode ser uma estratégia viável para disponibilizar primeiro as funções essenciais, desde que as necessidades mais importantes sejam atendidas e as funcionalidades adiadas sejam planejadas para versões futuras.