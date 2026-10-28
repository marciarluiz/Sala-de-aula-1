# ATIVIDADE 1 - MODELAGEM

**Aluno(a):** Ana Helloyse Gomes de Freitas

## Estudo de Caso 1

### 1. Concepção

O Conecta Campus pretende resolver o problema da falta de centralização dos serviços acadêmicos, além das dificuldades de lentidão e usabilidade do sistema atual. Os alunos precisam acessar notas, horários e avisos, enquanto os professores necessitam publicar materiais e comunicados, e a coordenação precisa divulgar eventos e informações acadêmicas.

Seu principal objetivo é reunir esses serviços em um único sistema, tornando o acesso às informações mais rápido, seguro, organizado e fácil de utilizar, melhorando a comunicação entre alunos, professores e coordenação.

### 2. Elicitação

Os principais stakeholders do sistema são:

Alunos: precisam consultar notas, horários e avisos acadêmicos.

Professores: precisam publicar materiais didáticos e comunicados.

Coordenação: necessita divulgar eventos e informações acadêmicas.

Equipe: São responsáveis por estabelecer regras de acesso, segurança e funcionamento do sistema.

**Para identificar e compreender as necessidades desses stakeholders, podem ser utilizadas as seguintes técnicas de elicitação:**

Entrevistas: a equipe de desenvolvimento pode conversar diretamente com alunos, professores e coordenadores para compreender suas dificuldades, expectativas e necessidades. Por exemplo, pode perguntar quais informações os alunos mais consultam e quais problemas enfrentam no sistema atual.
Questionários: podem ser enviados a um número maior de usuários para identificar as funcionalidades mais desejadas e avaliar a satisfação com o sistema atual. As respostas ajudam a reconhecer necessidades comuns e definir prioridades.

### 3. Análise e modelagem

**Requisitos funcionais (RF)**

RF01: O sistema deve permitir que os alunos consultem suas notas acadêmicas.

RF02: O sistema deve permitir que os alunos consultem seus horários de aulas.

RF03: O sistema deve permitir que os alunos recebam avisos e comunicados acadêmicos.

RF04: O sistema deve permitir que os professores publiquem materiais didáticos.

RF05: O sistema deve permitir que os professores publiquem comunicados destinados aos alunos.

RF06: O sistema deve permitir que a coordenação divulgue eventos e informações acadêmicas.

RF07: O sistema deve permitir que os usuários realizem login utilizando credenciais válidas.

RF08: O sistema deve permitir que os usuários autorizados acessem as funcionalidades correspondentes ao seu perfil.

**Requisitos não funcionais (RNF)**

RNF01 — Desempenho: O sistema deve apresentar as consultas de notas e horários em até 2 segundos em pelo menos 95% das solicitações, sob condições normais de uso definidas para os testes.

RNF02 — Segurança: O sistema deve exigir autenticação para acessar informações acadêmicas restritas e impedir que usuários consultem dados para os quais não possuem autorização.

RNF03 — Usabilidade: O sistema deve permitir que pelo menos 90% dos participantes de um teste de usabilidade concluam tarefas básicas, como consultar notas e horários, sem ajuda de um avaliador.

### 4. Negociação

**Must have (indispensável):**

- Login e autenticação dos usuários.
- Consulta de notas e horários pelos alunos.
- Publicação de materiais e comunicados pelos professores.
- Divulgação de eventos e informações pela coordenação.
- Controle de acesso às informações acadêmicas.

Essas funcionalidades são indispensáveis porque atendem às principais necessidades apresentadas e às exigências de segurança da universidade.

**Should have (importante):**

- Melhorias na navegação e na organização das informações.
- Sistema de avisos e notificações acadêmicas.

São importantes para melhorar a experiência dos usuários e a comunicação, embora alguns avisos possam inicialmente ser consultados diretamente no sistema.

**Could have (desejável):**

- Personalização das notificações de acordo com as preferências dos alunos.
- Recursos adicionais de personalização da interface.

Essas funcionalidades podem melhorar a experiência de uso, mas não são essenciais para disponibilizar os serviços acadêmicos principais.

**Won't have (fora do escopo da versão atual):**

- Chat em tempo real entre alunos e professores

O chat poderá ser desenvolvido em uma versão futura, pois a equipe considera que sua implementação pode atrasar a primeira versão. Assim, será possível priorizar as funcionalidades essenciais e disponibilizar o sistema mais rapidamente.

### 5. Especificação

RNF01 — Desempenho: O sistema deve apresentar as consultas de notas e horários em até 2 segundos em pelo menos 95% das solicitações, sob condições normais de uso definidas para o teste.

Como testar: executar pelo menos 100 solicitações de consulta em um ambiente de teste controlado e medir os tempos de resposta, verificando se pelo menos 95% ficam dentro do limite estabelecido.

RNF02 — Segurança: O sistema deve exigir autenticação para acessar informações acadêmicas restritas e bloquear tentativas de acesso não autorizado.

Como testar: tentar acessar informações restritas sem login e utilizar contas com diferentes permissões para verificar se cada usuário consegue acessar somente os dados autorizados.

RNF03 — Usabilidade: Pelo menos 90% dos participantes de um teste com usuários representativos devem conseguir consultar notas e horários sem ajuda do avaliador.

Como testar: solicitar que os participantes realizem essas tarefas em um protótipo ou sistema funcional, registrando quantos conseguem concluí-las sem assistência.

### 6. Validação

Revisão de requisitos: a equipe apresenta os requisitos documentados a alunos, professores e coordenadores para que eles verifiquem se as funcionalidades descritas correspondem às suas necessidades. Durante a revisão, os participantes podem apontar erros, omissões e requisitos que precisam ser ajustados.

Prototipação: a equipe desenvolve uma representação inicial das telas do Conecta Campus, permitindo que os usuários visualizem e experimentem a organização das funcionalidades antes da implementação definitiva. Os participantes podem avaliar se conseguem localizar notas, horários, materiais e comunicados com facilidade.

Testes de aceitação com usuários: quando houver uma versão funcional, alunos, professores e coordenadores podem executar tarefas relacionadas aos seus papéis. Os resultados permitem verificar se o sistema atende aos requisitos estabelecidos e se as funcionalidades funcionam conforme esperado.

## Estudo de Caso 2

### 1. Elicitação e stakeholders

**Os principais stakeholders do PetCare são:**

Tutores dos animais: precisam agendar consultas pelo celular, receber lembretes de vacinação e acompanhar as informações relacionadas aos cuidados de seus animais.

Veterinários: precisam consultar o histórico dos animais e registrar diagnósticos, tratamentos e medicamentos de maneira organizada.

Recepção: necessita controlar os horários disponíveis, confirmar consultas e realizar cancelamentos.

Gerência: precisa acompanhar a quantidade de atendimentos realizados para avaliar o funcionamento da clínica e auxiliar na tomada de decisões.

Proprietário da clínica: define os objetivos do sistema, o orçamento e o prazo para disponibilizar a primeira versão.

Equipe: Compreender as necessidades dos envolvidos para construir um sistema funcional, seguro e adequado aos recursos disponíveis.

**Para identificar e compreender essas necessidades, pode-se utilizar as seguintes técnicas de elicitação:**

1. Entrevistas: a equipe pode conversar individualmente com tutores, veterinários, recepcionistas e gerentes. Essa técnica permite compreender as dificuldades enfrentadas atualmente e identificar quais funcionalidades são mais importantes. Por exemplo, os veterinários podem explicar quais informações precisam consultar durante uma consulta.

2. Observação: a equipe pode acompanhar a rotina da recepção e dos veterinários para entender como os agendamentos são registrados, como os históricos são consultados e quais atividades provocam atrasos. Essa técnica ajuda a identificar problemas que os usuários podem não mencionar espontaneamente.

### 2. Análise e especificação de requisitos

**Requisitos funcionais (RF)**

RF01 — Agendamento: o sistema deve permitir que os tutores solicitem consultas pelo celular, selecionando um horário disponível.

RF02 — Gerenciamento de consultas: o sistema deve permitir que a recepção consulte os horários disponíveis, confirme agendamentos e registre cancelamentos.

RF03 — Histórico dos animais: o sistema deve permitir que os veterinários autorizados consultem o histórico de consultas, vacinas e medicamentos de cada animal cadastrado.

RF04 — Registro clínico: o sistema deve permitir que os veterinários registrem diagnósticos, tratamentos e medicamentos associados ao animal atendido.

RF05 — Lembretes de vacinação: o sistema deve permitir o cadastro das datas de vacinação e enviar lembretes aos tutores conforme as datas registradas e as regras definidas pela clínica.

RF06 — Relatórios de atendimento: o sistema deve permitir que a gerência consulte relatórios com a quantidade de atendimentos realizados em um período selecionado.

RF07 — Cadastro de animais: o sistema deve permitir o cadastro dos animais e a associação de cada animal ao seu tutor.

RF08 — Autenticação e permissões: o sistema deve permitir o acesso por usuários autenticados e restringir as funcionalidades de acordo com o perfil de cada usuário.

**Requisitos não funcionais (RNF)**

RNF01 — Desempenho: o sistema deve apresentar as telas de consulta de agendamentos e históricos em até 2 segundos em pelo menos 95% das solicitações, sob condições normais de uso definidas para os testes.

RNF02 — Segurança: o sistema deve exigir autenticação para acessar informações restritas e impedir que usuários sem autorização visualizem ou alterem históricos clínicos.

RNF03 — Usabilidade: pelo menos 90% dos participantes de um teste com usuários representativos devem conseguir concluir as tarefas de agendar uma consulta e localizar um histórico de animal sem ajuda do avaliador.

RNF04 — Compatibilidade: o sistema deve permitir que os tutores realizem o agendamento por meio de navegadores atuais em celulares Android e iOS, conforme a matriz de dispositivos e navegadores definida para os testes.

### 3. Negociação com MoSCoW

**Must have — Indispensáveis**

Agendamento de consultas pelo celular.

Controle de horários disponíveis, confirmações e cancelamentos.

Cadastro dos animais e de seus tutores.

Consulta e registro do histórico clínico, incluindo diagnósticos, tratamentos e medicamentos.

Autenticação e controle de acesso às informações restritas.

Essas funcionalidades são essenciais para organizar os atendimentos, substituir os registros dispersos e permitir que os veterinários acessem informações importantes sobre os animais. A segurança também é indispensável para proteger os dados armazenados.

**Should have — Importantes**

Lembretes de vacinação.

Relatórios sobre a quantidade de atendimentos realizados.

Esses recursos melhoram o acompanhamento dos animais e ajudam a gerência a avaliar o funcionamento da clínica. Entretanto, podem ser planejados para uma etapa posterior, caso o prazo ou os recursos não permitam implementá-los inicialmente.

**Could have — Desejáveis**

Pagamentos pelo aplicativo.

O pagamento digital pode trazer praticidade aos tutores e facilitar o processo de cobrança. Porém, sua implementação pode exigir integração com serviços de pagamento, tratamento de falhas e cuidados adicionais de segurança. Por isso, sua inclusão dependerá dos recursos disponíveis após a implementação das funções essenciais.

**Won't have — Fora do escopo da primeira versão**

Chat entre tutores e veterinários.

Área para publicação de fotos dos animais.

Essas funcionalidades poderão ser consideradas em versões futuras, após a disponibilização e avaliação das funções principais.

A classificação proposta deverá ser negociada com os stakeholders. Caso os recursos sejam insuficientes, a equipe deverá preservar primeiro as funcionalidades essenciais ao atendimento e à segurança das informações.

### 4. Especificação de requisitos não funcionais

RNF01 — Desempenho

O sistema deve apresentar as telas de consulta de agendamentos e históricos em até 2 segundos em pelo menos 95% das solicitações, sob condições normais de uso previamente definidas.

Como testar: realizar pelo menos 100 solicitações de consulta em um ambiente controlado e medir os tempos de resposta. O requisito será atendido se pelo menos 95% das solicitações respeitarem o limite de 2 segundos.

RNF02 — Segurança

O sistema deve exigir autenticação para acessar informações restritas e permitir que cada perfil consulte ou altere somente os dados autorizados.

Como testar: realizar tentativas de acesso sem login e com contas de diferentes perfis. Verificar se usuários não autorizados são impedidos de acessar ou modificar informações clínicas.

RNF03 — Usabilidade

Pelo menos 90% dos participantes de um teste com usuários representativos devem conseguir agendar uma consulta e localizar o histórico de um animal sem ajuda do avaliador.

Como testar: solicitar que tutores e funcionários realizem essas tarefas em um protótipo ou versão funcional. Registrar o número de participantes que concluem cada tarefa sem assistência e calcular a porcentagem de sucesso.

RNF04 — Compatibilidade

O sistema deve permitir que os tutores realizem agendamentos nos navegadores e dispositivos móveis definidos na matriz de compatibilidade do projeto.

Como testar: executar os mesmos cenários de agendamento nos dispositivos e navegadores selecionados, verificando se as funcionalidades essenciais funcionam corretamente em todos eles.

Esses requisitos tornam as expectativas do proprietário mais claras e permitem avaliar se o PetCare atende aos critérios de qualidade estabelecidos.

### 5. Validação dos requisitos

Para isso, podem ser utilizadas as seguintes técnicas:

1. Revisão de requisitos: a equipe apresenta a documentação aos tutores, veterinários, recepcionistas e gerentes. Os participantes verificam se as funcionalidades descritas representam suas necessidades e se existe alguma informação ausente ou contraditória. Por exemplo, os veterinários podem identificar a necessidade de incluir informações clínicas que não foram consideradas inicialmente.

2. Validação de cenários de uso: a equipe apresenta situações práticas aos stakeholders, como um tutor agendando uma consulta ou um veterinário consultando o histórico de vacinação. Os envolvidos verificam se os requisitos permitem realizar corretamente essas atividades e se as regras do sistema estão adequadas à rotina da clínica.

Após a validação, a equipe deverá registrar as correções necessárias, revisar os requisitos e obter a concordância dos principais envolvidos antes de iniciar a implementação.

### 6. Desafio — Priorização da primeira versão

Considerando o orçamento limitado a cinco funcionalidades e o prazo de quatro meses, as seguintes funcionalidades devem ser priorizadas:

1. Cadastro de animais e tutores

Necessidade atendida: organizar as informações dos clientes e dos animais atendidos.

Quem será beneficiado: tutores, veterinários e recepção.

Justificativa: é a base para associar consultas e informações clínicas ao animal correto. Sem esse cadastro, as demais funcionalidades dependeriam de registros desorganizados.

2. Agendamento de consultas pelo celular

Necessidade atendida: permitir que os tutores marquem consultas sem depender exclusivamente de telefone ou WhatsApp.

Quem será beneficiado: tutores e recepção.

Justificativa: reduz a dependência de agendamentos manuais e torna o processo mais acessível e organizado.

3. Gerenciamento da agenda

Necessidade atendida: controlar horários disponíveis, confirmar consultas e registrar cancelamentos.

Quem será beneficiado: recepção, veterinários e tutores.

Justificativa: complementa o agendamento e ajuda a evitar conflitos de horários, melhorando a organização dos atendimentos.

4. Histórico clínico dos animais

Necessidade atendida: centralizar informações sobre consultas anteriores, vacinas e medicamentos.

Quem será beneficiado: principalmente os veterinários, mas também a equipe de atendimento.

Justificativa: facilita a consulta às informações necessárias durante o atendimento e reduz a dependência de fichas e arquivos separados. A funcionalidade deve incluir o registro de diagnósticos, tratamentos e medicamentos pelos veterinários autorizados.

5. Autenticação e controle de acesso

Necessidade atendida: proteger as informações dos tutores e os registros clínicos dos animais.

Quem será beneficiado: todos os usuários da clínica.

Justificativa: é fundamental para restringir o acesso às informações conforme as responsabilidades de cada perfil. A segurança deve ser considerada desde o início do projeto.

**Riscos de adiar as demais funcionalidades**

Lembretes de vacinação: os tutores continuarão dependendo de outros meios para lembrar as datas de vacinação, aumentando a possibilidade de esquecimentos.

Relatórios de atendimento: a gerência terá menos recursos para acompanhar a quantidade de consultas e avaliar o desempenho da clínica.

Pagamentos pelo aplicativo: os tutores não terão a praticidade de pagar diretamente pelo sistema, sendo necessário manter outros meios de pagamento.

Chat com o veterinário: a comunicação continuará dependendo de telefone, WhatsApp ou outros canais externos.

Publicação de fotos: os tutores não poderão compartilhar fotos dos animais dentro do PetCare, mas essa ausência não prejudica diretamente as funções essenciais.

Esses riscos são aceitáveis para a primeira versão, desde que a clínica mantenha alternativas para as atividades adiadas. As funcionalidades futuras poderão ser priorizadas após a avaliação do uso do sistema e da disponibilidade de recursos.
