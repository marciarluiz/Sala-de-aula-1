
# Atividade 1 — Engenharia de Requisitos

# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

O Conecta Campus pretende resolver o problema da falta de integração dos serviços acadêmicos, que atualmente são lentos e difíceis de utilizar.

Seu principal objetivo é centralizar as informações acadêmicas em um único sistema, permitindo que alunos, professores e a administração tenham acesso rápido e organizado aos serviços e comunicados da universidade.

## 2. Elicitação

**Principais stakeholders:**

- **Alunos:** precisam consultar notas, horários e receber avisos.
- **Professores:** desejam publicar materiais e comunicados.
- **Aprofunde-se:** precisa divulgar eventos e informações acadêmicas.
- **Universidade:** deseja garantir a segurança e a organização das informações.
- **Equipe de desenvolvimento:** responsável por criar e manter o sistema.

**Técnicas de elicitação:**

1. **Entrevistas:** conversar com alunos, professores e funcionários para entender suas necessidades e dificuldades com o sistema atual.
2. **Questionários:** aplicar perguntas aos usuários para identificar quais funcionalidades são mais importantes e quais problemas enfrentam.

## 3. Análise e modelagem

**Requisitos funcionais (RF):**

- **RF01:** O sistema deve permitir que os alunos consultem suas notas.
- **RF02:** O sistema deve permitir que os alunos consultem seus horários de aula.
- **RF03:** O sistema deve enviar avisos e comunicados aos alunos.
- **RF04:** O sistema deve permitir que os professores publiquem materiais de estudo.
- **RF05:** O sistema deve permitir que os professores publiquem comunicados.
- **RF06:** O sistema deve permitir a divulgação de eventos e informações acadêmicas.

**Requisitos não funcionais (RNF):**

- **RNF01:** O sistema deve apresentar as informações em até 3 segundos em condições normais de uso.
- **RNF02:** O acesso às informações acadêmicas deve exigir autenticação do usuário.
- **RNF03:** O sistema deve possuir uma interface simples e organizada, facilitando a utilização por diferentes usuários.

## 4. Negociação — MoSCoW

- **Must Have (Indispensável):** consulta de notas, horários, avisos, publicação de materiais e autenticação. São funcionalidades essenciais para o funcionamento do sistema.
- **Should Have (Deveria ter):** publicação de comunicados pelos professores e divulgação de eventos acadêmicos. São importantes, mas podem ser implementadas após as funcionalidades principais.
- **Could Have (Poderia ter):** melhorias visuais e personalização das notificações. Podem ser adicionadas caso existam recursos disponíveis.
- **Won't Have (Não terá nesta versão):** chat entre alunos e professores. Apesar de ser interessante, pode aumentar o tempo de desenvolvimento da primeira versão.

## 5. Especificação dos requisitos não funcionais

A frase apresentada pode ser transformada nos seguintes requisitos:

- **RNF01 — Desempenho:** o sistema deve carregar as principais informações em até 3 segundos em condições normais de uso.  
  **Teste:** realizar testes de desempenho medindo o tempo de carregamento das páginas.

- **RNF02 — Segurança:** o sistema deve exigir login e senha para permitir o acesso às informações acadêmicas.  
  **Teste:** tentar acessar as informações sem realizar login e verificar se o acesso é bloqueado.

- **RNF03 — Usabilidade:** novos usuários devem conseguir consultar notas e horários em até 2 minutos, após uma breve orientação.  
  **Teste:** realizar testes com alunos e observar o tempo necessário para concluir essas tarefas.

## 6. Validação

A equipe poderá utilizar as seguintes técnicas:

1. **Prototipação:** desenvolver uma versão visual das telas do sistema e apresentar aos alunos e professores para verificar se a organização e as funcionalidades atendem às suas necessidades.

2. **Reuniões de revisão:** apresentar os requisitos documentados aos representantes dos alunos, professores e universidade, permitindo que eles indiquem erros, dúvidas ou funcionalidades que estejam faltando.

---

# Estudo de Caso 2 — Cuidados com Animais de Estimação (PetCare)

## 1. Elicitação e stakeholders

**Principais stakeholders:**

- **Tutores:** precisam agendar consultas pelo celular e receber lembretes de vacinação.
- **Veterinários:** precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
- **Recepcionistas:** precisam organizar os horários disponíveis e confirmar ou cancelar consultas.
- **Gerência:** deseja acompanhar a quantidade de atendimentos realizados por meio de relatórios.
- **Proprietário da clínica:** deseja melhorar o atendimento e organizar as informações da clínica.
- **Equipe de desenvolvimento:** responsável por desenvolver e manter o sistema.

**Técnicas de elicitação:**

1. **Entrevistas:** conversar com veterinários, recepcionistas e gerência para compreender como os atendimentos são realizados atualmente e identificar as principais dificuldades.

2. **Observação:** acompanhar a rotina da recepção e dos veterinários para entender como são realizados os agendamentos, consultas e registros dos animais.

Essas técnicas permitem conhecer melhor o funcionamento da clínica e identificar as necessidades reais dos usuários.

## 2. Análise e concepção de requisitos

**Requisitos funcionais (RF):**

- **RF01:** O sistema deve permitir que os tutores realizem agendamentos de consultas pelo celular.
- **RF02:** O sistema deve enviar lembretes de vacinação aos tutores.
- **RF03:** O sistema deve permitir que os veterinários consultem o histórico dos animais.
- **RF04:** O sistema deve permitir que os veterinários registrem diagnósticos, tratamentos e medicamentos.
- **RF05:** O sistema deve permitir que a recepção confirme e cancele consultas.
- **RF06:** O sistema deve permitir que a gerência visualize relatórios sobre a quantidade de atendimentos realizados.

**Requisitos não funcionais (RNF):**

- **RNF01:** O sistema deve carregar as principais informações em até 3 segundos em condições normais de uso.
- **RNF02:** O sistema deve exigir autenticação para permitir o acesso aos dados dos clientes e dos animais.
- **RNF03:** O sistema deve apresentar uma interface simples, permitindo que os usuários realizem as principais tarefas sem dificuldades.

## 3. Negociação com MoSCoW

- **Must Have (Indispensável):** agendamento de consultas, consulta ao histórico dos animais, registro de diagnósticos e tratamentos e controle de horários. São essenciais para o funcionamento da clínica.

- **Should Have (Deveria ter):** lembretes de vacinação e relatórios de atendimentos. São funcionalidades importantes para melhorar a organização e o acompanhamento dos animais.

- **Could Have (Poderia ter):** pagamentos pelo aplicativo e publicação de fotos dos animais. São recursos interessantes, mas não são essenciais para o funcionamento inicial do sistema.

- **Won't Have (Não terá nesta versão):** chat com o veterinário. Essa funcionalidade exige mais recursos e pode aumentar o prazo de desenvolvimento. Poderá ser considerada em uma versão futura.

**Justificativa:** considerando o prazo de quatro meses e os recursos disponíveis, a equipe deve priorizar as funcionalidades essenciais para o atendimento veterinário e a organização da clínica. Os pagamentos, o chat e a publicação de fotos podem ser desenvolvidos posteriormente.

## 4. Especificação dos requisitos não funcionais

- **RNF01 — Desempenho:** o sistema deve carregar as informações dos animais e consultas em até 3 segundos em condições normais de uso.  
  **Teste:** realizar testes de desempenho e medir o tempo de resposta.

- **RNF02 — Segurança:** o sistema deve exigir autenticação por login e senha para permitir o acesso às informações dos clientes e animais.  
  **Teste:** tentar acessar os dados sem autenticação e verificar se o sistema bloqueia o acesso.

- **RNF03 — Usabilidade:** os usuários devem conseguir realizar um agendamento em até 2 minutos, após uma breve orientação.  
  **Teste:** solicitar que tutores realizem agendamentos e medir o tempo necessário para concluir a tarefa.

## 5. Validação dos requisitos

A equipe poderá utilizar as seguintes técnicas:

1. **Prototipação:** criar modelos das telas do PetCare e apresentar aos tutores, veterinários e recepcionistas para verificar se as funcionalidades estão de acordo com suas necessidades.

2. **Revisão de requisitos:** reunir os stakeholders para analisar os requisitos documentados, identificar informações incorretas ou ausentes e verificar se todos concordam com o que será desenvolvido.

Essas técnicas ajudam a evitar erros e garantir que o sistema atenda às expectativas dos envolvidos antes do início do desenvolvimento.

## 6. Desafio — Priorização da primeira versão

Considerando o orçamento disponível e o prazo de quatro meses, as cinco funcionalidades prioritárias seriam:

**1. Agendamento de consultas**

- **Necessidade atendida:** permitir que os tutores marquem consultas pelo celular.
- **Beneficiados:** tutores e recepcionistas.
- **Justificativa:** reduz a dependência de ligações e mensagens pelo WhatsApp.

**2. Controle de horários e consultas**

- **Necessidade atendida:** organizar os horários disponíveis, confirmações e cancelamentos.
- **Beneficiados:** recepcionistas e veterinários.
- **Justificativa:** evita conflitos de horários e melhora a organização dos atendimentos.

**3. Histórico dos animais**

- **Necessidade atendida:** armazenar e consultar informações sobre consultas anteriores, vacinas e medicamentos.
- **Beneficiados:** veterinários e tutores.
- **Justificativa:** facilita o acompanhamento dos animais e evita a perda de informações importantes.

**4. Registro de diagnósticos e tratamentos**

- **Necessidade atendida:** permitir que os veterinários registrem informações sobre as consultas e os tratamentos realizados.
- **Beneficiados:** veterinários e tutores.
- **Justificativa:** mantém os registros organizados e facilita o acompanhamento da saúde dos animais.

**5. Lembretes de vacinação**

- **Necessidade atendida:** avisar os tutores sobre as datas de vacinação dos animais.
- **Beneficiados:** tutores e veterinários.
- **Justificativa:** ajuda a evitar o esquecimento das vacinas e melhora o acompanhamento dos animais.

**Riscos de adiar as demais funcionalidades:**

O adiamento dos pagamentos pelo aplicativo pode fazer com que os tutores continuem utilizando outros meios de pagamento. A ausência do chat com o veterinário mantém a comunicação pelos canais tradicionais. Já a publicação de fotos dos animais não prejudica diretamente o funcionamento principal da clínica, pois é uma funcionalidade complementar.

Portanto, as cinco funcionalidades escolhidas atendem às principais necessidades da clínica e devem ser priorizadas na primeira versão do PetCare.
