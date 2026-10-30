# Atividade 1 — Engenharia de Requisitos

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção
O Conecta Campus pretende resolver a dificuldade de acesso às informações acadêmicas, causada pela utilização de um sistema lento, pouco intuitivo e que não centraliza adequadamente os serviços da universidade.

### 2. Elicitação
- **Alunos:** precisam consultar notas, horários e avisos acadêmicos.
- **Professores:** precisam publicar materiais e comunicados para os alunos.
- **Coordenação:** precisa divulgar eventos e informações acadêmicas.
- **Equipe de TI:** responsável pelo desenvolvimento, manutenção e segurança do sistema.
- **Universidade:** responsável por estabelecer as regras e necessidades institucionais.

**Técnicas de elicitação:**

**Entrevistas:** realizar entrevistas com alunos, professores e coordenação para compreender suas dificuldades com o sistema atual e identificar as funcionalidades necessárias.

**Questionários:** aplicar formulários aos alunos e professores para identificar os problemas mais frequentes, avaliar a experiência com o sistema atual e descobrir quais funcionalidades são consideradas mais importantes.

### 3. Análise e modelagem
**Requisitos funcionais (RF):**
- **RF01:** O sistema deve permitir que os alunos consultem suas notas acadêmicas.
- **RF02:** O sistema deve permitir que os alunos visualizem seus horários de aula.
- **RF03:** O sistema deve permitir que professores publiquem materiais didáticos.
- **RF04:** O sistema deve permitir que professores e coordenação publiquem comunicados.
- **RF05:** O sistema deve permitir que a coordenação divulgue eventos acadêmicos.
- **RF06:** O sistema deve permitir a autenticação de usuários por meio de credenciais.

**Requisitos não funcionais (RNF):**
- **RNF01 — Desempenho:** o sistema deve carregar as páginas principais em até 3 segundos em condições normais de utilização.
- **RNF02 — Segurança:** o sistema deve permitir o acesso às informações acadêmicas somente após autenticação e autorização do usuário.
- **RNF03 — Usabilidade:** o sistema deve apresentar uma interface intuitiva, permitindo que os usuários encontrem as principais funcionalidades com facilidade.

### 4. Negociação — Técnica MoSCoW
**Must Have — Indispensável:**
- Autenticação de usuários.
- Consulta de notas e horários.
- Publicação de materiais didáticos.
- Publicação e visualização de comunicados acadêmicos.
Essas funcionalidades são essenciais porque atendem às necessidades principais dos alunos e professores, além de garantir o acesso controlado às informações.

**Should Have — Importante:**
- Divulgação de eventos acadêmicos.
- Notificações sobre novos comunicados.
São funcionalidades importantes para melhorar a comunicação, mas sua ausência inicial não impede o funcionamento básico da plataforma.

**Could Have — Desejável:**
- Personalização da interface.
- Filtros avançados para pesquisar materiais acadêmicos.
Essas funcionalidades podem melhorar a experiência dos usuários, mas não são essenciais para a primeira versão.

**Won't Have — Fora da versão atual:**
- Chat entre alunos e professores.
O chat não será implementado inicialmente porque exige mais tempo de desenvolvimento e manutenção. A prioridade será disponibilizar as funcionalidades acadêmicas essenciais.

### 5. Especificação de requisitos não funcionais
**RNF01 — Desempenho**
O sistema deve carregar as páginas principais em até 3 segundos em pelo menos 95% das requisições, considerando até 100 usuários simultâneos.
**Teste:** realizar testes de desempenho simulando 100 usuários simultâneos e medir os tempos de resposta.

**RNF02 — Segurança**
O sistema deve exigir autenticação para acessar informações acadêmicas e impedir que um usuário visualize dados privados de outros usuários sem autorização.
**Teste:** tentar acessar páginas protegidas sem autenticação e verificar se o acesso é bloqueado. Também devem ser realizados testes com diferentes perfis de usuários.

**RNF03 — Usabilidade**
Pelo menos 90% dos usuários participantes de um teste devem conseguir consultar suas notas ou localizar materiais acadêmicos em até 1 minuto, sem assistência.
**Teste:** realizar testes de usabilidade com alunos e professores, registrando o tempo e a taxa de conclusão das tarefas.

### 6. Validação
A equipe poderá utilizar duas técnicas principais:
**Revisão de requisitos:** realizar reuniões com representantes dos alunos, professores e coordenação para apresentar os requisitos documentados. Os participantes poderão identificar informações incorretas, funcionalidades ausentes ou necessidades mal interpretadas.
**Prototipação:** desenvolver protótipos das telas principais, como login, consulta de notas e publicação de materiais. Os usuários poderão testar os fluxos e avaliar se as funcionalidades correspondem às suas expectativas.
Essas técnicas permitem identificar problemas antes do desenvolvimento, reduzindo retrabalho e garantindo que o sistema atenda às necessidades reais dos usuários.

---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///---///

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders
- **Tutores dos animais:** desejam agendar consultas pelo celular e receber lembretes de vacinação.
- **Veterinários:** precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos.
- **Recepcionistas:** precisam controlar horários disponíveis e confirmar ou cancelar consultas.
- **Gerência:** deseja acompanhar a quantidade de atendimentos por meio de relatórios.
- **Proprietário da clínica:** deseja melhorar a organização e a qualidade dos atendimentos, respeitando o orçamento e o prazo de quatro meses.

**Técnicas de elicitação:**
**Entrevistas:** conversar com veterinários, recepcionistas, tutores e gerência para compreender suas necessidades e identificar dificuldades no processo atual de atendimento.
**Observação:** acompanhar a rotina da recepção e dos veterinários para entender como são realizados os agendamentos e como os históricos dos animais são consultados e atualizados.

As entrevistas permitem conhecer as expectativas dos envolvidos, enquanto a observação ajuda a identificar problemas que podem não ser mencionados durante as conversas.

### 2. Análise e especificação de requisitos

**Requisitos funcionais (RF):**
- **RF01:** O sistema deve permitir que os tutores realizem agendamentos de consultas.
- **RF02:** O sistema deve permitir que a recepção visualize horários disponíveis e confirme ou cancele agendamentos.
- **RF03:** O sistema deve permitir o cadastro de tutores e seus animais.
- **RF04:** O sistema deve permitir que veterinários consultem o histórico clínico dos animais.
- **RF05:** O sistema deve permitir que veterinários registrem diagnósticos, tratamentos e medicamentos.
- **RF06:** O sistema deve permitir que a gerência visualize relatórios sobre a quantidade de atendimentos realizados.
- **RF07:** O sistema deve enviar lembretes de vacinação aos tutores.

**Requisitos não funcionais (RNF):**
- **RNF01 — Desempenho:** o sistema deve carregar as principais informações em até 3 segundos em condições normais de utilização.
- **RNF02 — Segurança:** o sistema deve exigir autenticação e controlar o acesso aos dados conforme o perfil de cada usuário.
- **RNF03 — Usabilidade:** o sistema deve possuir uma interface simples e adaptada para utilização em celulares.

### 3. Negociação com MoSCoW
**Must Have — Indispensável:**
- Cadastro de tutores e animais.
- Agendamento de consultas.
- Controle de horários e confirmação ou cancelamento de consultas.
- Consulta do histórico clínico.
- Registro de diagnósticos, tratamentos e medicamentos.

Essas funcionalidades são fundamentais para organizar os atendimentos e substituir os processos manuais utilizados pela clínica.

**Should Have — Importante:**
- Lembretes automáticos de vacinação.
- Relatórios de atendimentos para a gerência.

São importantes para melhorar a comunicação com os tutores e auxiliar a administração, mas podem ser desenvolvidas após as funcionalidades principais.

**Could Have — Desejável:**
- Pagamentos pelo aplicativo.

Essa funcionalidade pode facilitar a vida dos clientes, mas exige integração com serviços financeiros, testes adicionais e cuidados de segurança, aumentando a complexidade do projeto.

**Won't Have — Fora da primeira versão:**
- Chat com o veterinário.
- Área para publicação de fotos dos animais.

O chat exige recursos para comunicação e disponibilidade dos profissionais, enquanto a publicação de fotos não contribui diretamente para resolver os problemas de agendamento e organização dos prontuários.

Considerando o prazo de quatro meses, essas funcionalidades serão adiadas para priorizar o funcionamento básico do PetCare.

### 4. Especificação de requisitos não funcionais
**RNF01 — Desempenho**
O sistema deve apresentar os horários disponíveis e o histórico clínico dos animais em até 3 segundos em pelo menos 95% das solicitações, considerando até 50 usuários simultâneos.
**Teste:** executar testes de carga simulando 50 usuários simultâneos e registrar os tempos de resposta.

**RNF02 — Segurança**
O sistema deve exigir autenticação para acesso aos dados e permitir que somente usuários autorizados visualizem ou modifiquem informações clínicas dos animais.
**Teste:** realizar tentativas de acesso sem autenticação e com diferentes perfis, verificando se as permissões são respeitadas.

**RNF03 — Usabilidade**
Pelo menos 90% dos tutores participantes de um teste devem conseguir realizar um agendamento em até 2 minutos, sem auxílio.
**Teste:** realizar testes com tutores utilizando celulares, medindo o tempo necessário e a quantidade de usuários que concluem a tarefa.

### 5. Validação dos requisitos
A validação será realizada antes do desenvolvimento para confirmar que os requisitos representam corretamente as necessidades dos envolvidos.
**Revisão de requisitos:** a equipe realizará reuniões com representantes dos tutores, veterinários, recepção e gerência para apresentar os requisitos documentados. Os participantes poderão apontar funcionalidades ausentes, informações incorretas ou prioridades diferentes.

**Prototipação:** serão desenvolvidos protótipos das telas de cadastro, agendamento e histórico clínico. Os usuários poderão simular tarefas e verificar se os fluxos atendem às suas necessidades.

Essas técnicas ajudam a identificar erros, omissões e divergências antes da implementação, evitando custos adicionais e retrabalho.

### 6. Desafio — Priorização da primeira versão
Considerando o orçamento limitado e o prazo de quatro meses, foram escolhidas cinco funcionalidades para a primeira versão do PetCare.
**1. Cadastro de tutores e animais**
- **Necessidade:** organizar as informações dos clientes e dos animais.
- **Beneficiados:** tutores, recepção e veterinários.
- **Justificativa:** é fundamental para identificar os animais e associar corretamente consultas e históricos clínicos.

**2. Agendamento de consultas**
- **Necessidade:** permitir que os tutores marquem consultas pelo celular.
- **Beneficiados:** tutores e recepção.
- **Justificativa:** reduz a dependência de agendamentos por telefone e WhatsApp, facilitando a organização dos atendimentos.

**3. Gerenciamento de horários e consultas**
- **Necessidade:** controlar os horários disponíveis e permitir a confirmação ou o cancelamento de consultas.
- **Beneficiados:** recepcionistas, tutores e veterinários.
- **Justificativa:** evita conflitos de horários e melhora a organização da agenda da clínica.

**4. Consulta do histórico clínico**
- **Necessidade:** permitir o acesso rápido às informações de atendimentos anteriores.
- **Beneficiados:** veterinários.
- **Justificativa:** facilita a consulta de informações importantes para o acompanhamento dos animais.

**5. Registro de diagnósticos, tratamentos e medicamentos**
- **Necessidade:** manter as informações clínicas organizadas e atualizadas.
- **Beneficiados:** veterinários e, indiretamente, tutores e animais.
- **Justificativa:** permite substituir os registros separados por um histórico centralizado, melhorando a continuidade dos atendimentos.

**Riscos de adiar as demais funcionalidades:**

O adiamento dos lembretes de vacinação pode fazer com que os tutores continuem dependendo de controles manuais para acompanhar as datas das vacinas.

A ausência de relatórios automáticos exigirá que a gerência acompanhe os atendimentos por meio de consultas ou contagens manuais.

Sem pagamentos pelo aplicativo, os clientes continuarão utilizando os métodos de pagamento já oferecidos pela clínica.

A ausência do chat manterá a comunicação entre tutores e veterinários pelos canais tradicionais.

Por fim, a publicação de fotos dos animais poderá ser desenvolvida posteriormente, pois não interfere diretamente no funcionamento dos serviços principais.

Dessa forma, a primeira versão do PetCare será direcionada à organização dos agendamentos e dos históricos clínicos, priorizando as funcionalidades que resolvem os principais problemas da clínica.
