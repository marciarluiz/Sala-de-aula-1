---
## ALUNO: Kauã Ferreira
---

# Atividade 1 — Engenharia de Requisitos

---

# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

**Problema:** Os serviços acadêmicos da universidade (notas, horários, avisos, materiais, eventos) estão dispersos em um sistema atual que os alunos consideram lento e difícil de usar. Isso gera retrabalho, comunicação falha entre alunos, professores e coordenação, e baixa satisfação.

**Objetivo principal:** Centralizar os serviços acadêmicos em uma única plataforma **rápida, fácil de usar e segura**, na qual somente usuários autenticados acessem as informações acadêmicas, permitindo que alunos consultem notas, horários e avisos, professores publiquem materiais e comunicados, e a coordenação divulgue eventos e informações.

---

## 2. Elicitação

### Stakeholders

| Stakeholder | Interesse / necessidade |
|---|---|
| **Alunos** | Consultar notas e horários, receber avisos, ter um sistema rápido e simples. |
| **Professores** | Publicar materiais e comunicados com facilidade; alguns desejam chat com alunos. |
| **Coordenação** | Divulgar eventos e informações acadêmicas com alcance garantido. |
| **Secretaria acadêmica** | Fonte oficial de notas, matrículas e horários; precisa de integração com o sistema atual. |
| **Direção / Reitoria** | Patrocinam o projeto; querem centralização, imagem institucional e cumprimento de prazos/custos. |
| **Equipe de TI e desenvolvimento** | Precisam de requisitos claros e viáveis para a primeira versão. |
| **Responsável por segurança/LGPD (jurídico)** | Garantir proteção de dados acadêmicos e pessoais. |

### Técnicas de elicitação

1. **Entrevistas:** realizadas individualmente ou em pequenos grupos com representantes de cada grupo (alguns alunos de cursos e períodos diferentes, professores, coordenadores e secretaria). Usa-se um roteiro semiestruturado com perguntas como: "Quais tarefas você faz hoje no sistema?", "O que mais atrapalha?", "O que você faria com mais frequência se fosse fácil?". Permite aprofundar necessidades e descobrir regras de negócio (por exemplo, quando as notas são liberadas).
2. **Questionários (surveys):** aplicados a uma grande quantidade de alunos e professores para quantificar prioridades (quais funcionalidades são mais usadas, quais problemas mais incomodam, em que dispositivo acessam). Complementa as entrevistas com dados em escala.
3. **Observação / análise do sistema atual:** acompanhar alunos usando o sistema atual e medir tempos de resposta, identificando gargalos de lentidão e problemas de usabilidade que os usuários nem sempre conseguem descrever.
4. **Workshop / brainstorming com protótipos de baixa fidelidade:** reunir representantes dos grupos para discutir e priorizar ideias (inclusive o chat), usando esboços de telas.

---

## 3. Análise e modelagem

### Requisitos Funcionais

- **RF01 – Autenticação:** O sistema deve permitir login com credenciais institucionais (matrícula/e-mail e senha), bloqueando o acesso a informações acadêmicas a usuários não autenticados.
- **RF02 – Consulta de notas:** O aluno autenticado deve poder consultar suas notas e frequência por disciplina e por período.
- **RF03 – Consulta de horários:** O aluno autenticado deve poder visualizar seu horário de aulas (disciplina, dia, hora e sala).
- **RF04 – Avisos:** O sistema deve exibir avisos aos alunos e enviar notificação quando um novo aviso for publicado.
- **RF05 – Publicação de materiais:** O professor deve poder enviar e disponibilizar materiais (arquivos e links) para as turmas em que leciona.
- **RF06 – Publicação de comunicados:** O professor deve poder publicar comunicados direcionados a uma ou mais turmas.
- **RF07 – Divulgação de eventos:** A coordenação deve poder cadastrar, editar e remover eventos (título, data, local, descrição).
- **RF08 – Informações acadêmicas:** A coordenação deve poder publicar informações acadêmicas (calendário, editais, orientações) visíveis aos usuários autorizados.

### Requisitos Não Funcionais

- **RNF01 – Desempenho:** As telas principais (login, notas, horários) devem carregar em até 3 segundos em condições normais de uso.
- **RNF02 – Segurança:** Toda comunicação deve usar HTTPS e as senhas devem ser armazenadas com hash seguro; dados acadêmicos só podem ser acessados por usuários autenticados e autorizados.
- **RNF03 – Usabilidade:** Um aluno novo deve conseguir consultar suas notas em até 3 cliques após o login, sem treinamento.
- **RNF04 – Disponibilidade:** O sistema deve estar disponível 99% do tempo, especialmente em períodos de divulgação de notas e matrícula.
- **RNF05 – Compatibilidade:** Deve funcionar nos principais navegadores atuais e em dispositivos móveis (layout responsivo).

---

## 4. Negociação (MoSCoW)

| Categoria | Funcionalidades |
|---|---|
| **Must have** | RF01 Autenticação; RF02 Notas; RF03 Horários; RF04 Avisos; RF05/RF06 Materiais e comunicados dos professores |
| **Should have** | RF07 Divulgação de eventos; RF08 Informações acadêmicas da coordenação |
| **Could have** | Filtro/busca de avisos; integração com calendário pessoal; notificações por e-mail além do aplicativo |
| **Won't have** (nesta versão) | Chat entre alunos e professores |

**Justificativas:**
- **Must:** atendem às necessidades centrais dos alunos e professores e à exigência da universidade (autenticação). Sem eles, o sistema não substitui o atual.
- **Should:** a coordenação é importante e os eventos agregam valor, mas o sistema já cumpre sua função principal sem eles; as informações podem continuar sendo divulgadas pelos canais atuais por um curto período.
- **Could:** melhoram a experiência, mas só serão feitos se sobrar tempo e recursos.
- **Won't:** o chat exige mensagens em tempo real, moderação, regras de privacidade e armazenamento, o que aumenta muito o escopo e pode atrasar a primeira versão (como a própria equipe alertou). Fica registrado como candidato para uma versão futura, preservando a ideia dos professores que a solicitaram.

---

## 5. Especificação (requisitos não funcionais mensuráveis)

A frase *"O aplicativo deve ser rápido, seguro e fácil de usar"* pode ser desdobrada em:

| ID | Requisito | Critério mensurável | Como testar |
|---|---|---|---|
| **RNF01** (rápido) | O tempo de resposta das telas de login, notas e horários deve ser de no máximo 3 s para 95% das requisições, com até 1.000 usuários simultâneos. | p95 ≤ 3 s | Teste de carga com JMeter/k6 simulando 1.000 usuários e análise do percentil 95. |
| **RNF02** (seguro) | Todo tráfego deve usar HTTPS (TLS 1.2+), senhas com hash (bcrypt/Argon2) e bloqueio da conta após 5 tentativas de login inválidas. Nenhuma página acadêmica pode ser acessada sem sessão válida. | 100% das rotas acadêmicas protegidas; bloqueio na 5ª tentativa | Testes de segurança (acesso direto a URLs sem login deve retornar 401/403), verificação de certificado e revisão do armazenamento de senhas; varredura com OWASP ZAP. |
| **RNF03** (fácil de usar) | Pelo menos 90% dos usuários de teste devem conseguir consultar notas e horários, sem ajuda, em até 1 minuto. Nota média no questionário SUS ≥ 75. | ≥ 90% de sucesso; SUS ≥ 75 | Teste de usabilidade com 10 alunos e 5 professores, com cronometragem e aplicação do questionário SUS. |
| **RNF04** (disponível) | Disponibilidade mensal ≥ 99%. | ≤ ~7 h de indisponibilidade/mês | Monitoramento contínuo (uptime) e relatório mensal. |

---

## 6. Validação

1. **Revisão/inspeção dos requisitos com os stakeholders:** reuniões de revisão em que alunos, professores e coordenação leem a lista de requisitos (em linguagem simples) e marcam o que está correto, ausente ou incorreto. Os ajustes são registrados e os requisitos são aprovados formalmente (ata ou assinatura). Também se verifica a consistência, a ausência de ambiguidade e o rastreamento até as necessidades originais.
2. **Prototipação:** construção de protótipos navegáveis (por exemplo, no Figma) das telas de notas, horários, avisos e publicação de materiais. Os usuários executam tarefas reais no protótipo e dão feedback. Isso revela mal-entendidos que a leitura de texto não revela.
3. **Pesquisa/questionário de confirmação e piloto:** após a primeira versão do protótipo, enviar um questionário para uma amostra de usuários e, se possível, realizar um piloto com uma turma e um professor, comparando o resultado com os critérios de aceitação dos requisitos.

---
---

# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

### Stakeholders e necessidades

| Stakeholder | Necessidades |
|---|---|
| **Tutores dos animais** | Marcar consultas pelo celular e receber lembretes de vacinação. |
| **Veterinários** | Consultar o histórico do animal e registrar diagnósticos, tratamentos e medicamentos. |
| **Recepção** | Controlar horários disponíveis e confirmar ou cancelar consultas. |
| **Gerência** | Ver relatórios de quantidade de atendimentos. |
| **Proprietário da clínica (patrocinador)** | Sistema "rápido, seguro e muito fácil de usar" entregue em 4 meses, dentro do orçamento. |
| **Equipe de desenvolvimento** | Escopo claro e viável para o prazo. |
| **Animais (beneficiários indiretos)** | Atendimento mais ágil e histórico de saúde confiável. |

### Técnicas de elicitação

1. **Entrevistas com cada grupo (tutores, veterinários, recepção, gerência e proprietário):** cada grupo tem necessidades e linguagem diferentes, e a entrevista permite aprofundar o que fazem hoje e quais são suas dores (por exemplo: "Como você descobre hoje se um animal já tomou a vacina?"). É a técnica mais adequada para entender necessidades específicas e regras de negócio da clínica.
2. **Observação do fluxo atual (imersão na clínica):** acompanhar a recepção atendendo ligações e WhatsApp e veterinários buscando fichas em papel. Justifica-se porque o processo atual é informal e disperso (telefone, WhatsApp, fichas), e as pessoas costumam esquecer de relatar atividades que já fazem automaticamente.
3. **Análise de documentos:** examinar as fichas e arquivos atuais para identificar quais dados do animal e de consultas existem e precisam ser migrados para o sistema.
4. **Questionário rápido aos tutores:** coleta, em escala, a preferência por canais de lembrete e a disposição em usar o aplicativo.

---

## 2. Análise e especificação de requisitos

### Requisitos Funcionais

- **RF01 – Cadastro e autenticação:** O sistema deve permitir que tutores e funcionários criem conta e façam login; o tutor deve cadastrar um ou mais animais (nome, espécie, raça, data de nascimento).
- **RF02 – Agendamento pelo celular:** O tutor deve poder visualizar horários disponíveis e solicitar/agendar consulta para o seu animal pelo aplicativo.
- **RF03 – Gestão de agenda pela recepção:** A recepção deve poder visualizar horários disponíveis, confirmar, remarcar ou cancelar consultas, e o tutor deve ser notificado da alteração.
- **RF04 – Histórico do animal:** O veterinário deve poder consultar o histórico do animal (consultas anteriores, vacinas e medicamentos).
- **RF05 – Registro clínico:** O veterinário deve poder registrar diagnóstico, tratamento e medicamentos prescritos ao final da consulta, vinculados ao histórico do animal.
- **RF06 – Lembretes de vacinação:** O sistema deve enviar notificação ao tutor antes da data de vacina de cada animal (por exemplo, 7 dias e 1 dia antes).
- **RF07 – Relatórios de atendimento:** A gerência deve poder gerar relatórios da quantidade de atendimentos por período, veterinário e tipo de serviço.

### Requisitos Não Funcionais

- **RNF01 – Desempenho:** As principais operações (login, listar horários, abrir histórico do animal) devem responder em até 2 segundos para 95% das requisições.
- **RNF02 – Segurança e privacidade:** Dados dos tutores e dos animais devem trafegar via HTTPS e ser acessados conforme o perfil (tutor vê apenas seus animais; clínico registra; gerência vê relatórios), em conformidade com a LGPD.
- **RNF03 – Usabilidade:** Um tutor deve conseguir agendar uma consulta em até 5 passos e menos de 2 minutos, sem ajuda.
- **RNF04 – Disponibilidade:** O sistema deve ficar disponível pelo menos 99% do tempo, em horário comercial.
- **RNF05 – Compatibilidade:** O aplicativo deve funcionar em Android e iOS (ou web responsiva) nas duas últimas versões principais.

---

## 3. Negociação com MoSCoW

| Categoria | Funcionalidades |
|---|---|
| **Must** | RF01 Cadastro/autenticação; RF02 Agendamento pelo celular; RF03 Gestão de agenda pela recepção; RF04/RF05 Histórico e registro clínico; RF06 Lembretes de vacinação |
| **Should** | RF07 Relatórios de atendimento |
| **Could** | Publicação de fotos dos animais |
| **Won't (nesta versão)** | Pagamento pelo aplicativo; chat com o veterinário |

**Justificativas gerais:** as funcionalidades *Must* resolvem os problemas centrais descritos (agendamento disperso em telefone/WhatsApp, histórico em fichas separadas, esquecimento de vacinas) e são pedidas pelos stakeholders-chave. Com apenas 4 meses e recursos limitados, é preciso evitar escopo que não sustenta a operação básica.

**Pagamento pelo aplicativo (Won't):** exige integração com gateway de pagamento, requisitos de segurança e conformidade mais rígidos, tratamento de estornos e integração contábil. Isso consome muito tempo e traz alto risco para o prazo. A clínica já recebe pagamento presencialmente, então o processo não fica bloqueado. Fica para uma versão futura.

**Chat com o veterinário (Won't):** envolve mensagens em tempo real, definição de horários de resposta do veterinário, responsabilidade profissional (orientação clínica sem consulta), histórico e moderação. Aumenta custo e risco; o contato pode continuar pelos canais atuais (telefone/WhatsApp) até que o sistema esteja estável.

**Publicação de fotos dos animais (Could):** tem valor de engajamento, mas não resolve nenhuma dor operacional. Exige armazenamento, moderação e cuidados com privacidade. Só deve entrar se sobrar capacidade, por exemplo como simples upload de uma foto no perfil do animal.

**Relatórios (Should):** importantes para a gerência, mas não impedem o atendimento. No início, os dados dos atendimentos já cadastrados podem ser exportados e analisados em planilha.

---

## 4. Especificação de requisitos não funcionais

A frase *"O sistema deve ser rápido, seguro e muito fácil de usar"* pode ser transformada em:

| ID | Requisito | Critério objetivo | Como verificar |
|---|---|---|---|
| **RNF01** (rápido) | O sistema deve responder às principais ações (login, listar horários, abrir histórico) em até 2 s para 95% das requisições, com até 100 usuários simultâneos. | p95 ≤ 2 s | Teste de carga (k6/JMeter) e análise do percentil 95; monitoramento em produção. |
| **RNF02** (seguro) | Toda comunicação deve usar HTTPS (TLS 1.2+); senhas armazenadas com hash; sessão expira após 15 min de inatividade; cada tutor só pode acessar os dados dos próprios animais. | 0 acessos indevidos nos testes; 100% do tráfego criptografado | Testes de penetração/OWASP ZAP; tentativas de acessar dados de outro tutor devem retornar 403; inspeção do banco de dados para confirmar o hash. |
| **RNF03** (fácil de usar) | Um tutor novo deve concluir um agendamento em até 2 minutos e 5 passos, sem ajuda. Pelo menos 90% dos participantes devem concluir a tarefa com sucesso; SUS ≥ 75. | ≥ 90% de sucesso; tempo ≤ 2 min | Teste de usabilidade com ao menos 8 tutores (incluindo pessoas de baixa familiaridade com tecnologia), com cronometragem e questionário SUS. |
| **RNF04** (confiável) | Disponibilidade ≥ 99% no horário de funcionamento da clínica; backup diário dos dados clínicos. | ≥ 99% de uptime; backup verificado | Monitoramento de uptime e teste periódico de restauração do backup. |

---

## 5. Validação dos requisitos

1. **Revisão dos requisitos com os stakeholders (inspeção/walkthrough):** reuniões separadas com tutores representativos, veterinários, recepção, gerência e proprietário, em que cada um lê os requisitos relacionados à sua função e aprova, corrige ou acrescenta. Ajuda a detectar **omissões** (ex.: veterinário precisa registrar vacinas aplicadas, não só medicamentos), **erros** (regra de cancelamento incorreta) e **divergências** entre grupos (a recepção quer confirmar manualmente; o tutor espera confirmação automática). Os pontos aprovados são registrados em ata e usados como linha de base.
2. **Protótipos navegáveis (por exemplo, Figma):** telas de agendamento, agenda da recepção, ficha do animal e relatório. Os usuários executam tarefas reais no protótipo, e a equipe observa dúvidas e erros. Revela problemas de usabilidade e expectativas diferentes antes de gastar tempo de desenvolvimento.
3. **Critérios de aceitação e matriz de rastreabilidade:** cada requisito recebe critérios verificáveis (ex.: "o tutor recebe lembrete 7 dias antes da vacina") e é rastreado até a necessidade do stakeholder. Isso mostra requisitos sem origem, necessidades sem requisito e contradições entre requisitos.

---

## 6. Desafio — Priorização da primeira versão (cinco funcionalidades)

### Funcionalidades escolhidas

**1. Cadastro e autenticação de tutores, animais e funcionários (RF01)**
- **Necessidade:** identificar quem é o tutor, quais animais ele possui e proteger os dados (requisito de segurança do proprietário).
- **Beneficiados:** todos os usuários; clínica (segurança e LGPD).
- **Por que na v1:** é a base técnica das demais funcionalidades; sem ela, não há agendamento, histórico nem lembretes.

**2. Agendamento de consultas pelo celular (RF02)**
- **Necessidade:** substituir agendamentos por telefone e WhatsApp.
- **Beneficiados:** tutores (autonomia) e recepção (menos ligações e mensagens).
- **Por que na v1:** é a principal dor do tutor e o maior ganho visível da clínica; é o que faz o aplicativo ser percebido como útil.

**3. Gestão de agenda pela recepção (RF03)**
- **Necessidade:** controlar horários, confirmar e cancelar consultas.
- **Beneficiados:** recepção, tutores (confirmação clara) e veterinários (agenda organizada).
- **Por que na v1:** o agendamento do tutor depende da recepção para funcionar sem conflitos ou overbooking. Sem ela, o fluxo fica incompleto.

**4. Histórico e registro clínico do animal (RF04 + RF05)**
- **Necessidade:** substituir fichas e arquivos separados, consultando e registrando diagnósticos, tratamentos e medicamentos.
- **Beneficiados:** veterinários (decisão clínica mais rápida e segura) e, indiretamente, os animais e tutores.
- **Por que na v1:** é o coração do sistema e reduz o risco clínico (esquecer vacinas ou medicamentos anteriores). Também é a base dos lembretes e dos relatórios futuros.

**5. Lembretes de vacinação (RF06)**
- **Necessidade:** evitar que os tutores esqueçam vacinas.
- **Beneficiados:** tutores e animais (saúde), clínica (retorno recorrente e fidelização).
- **Por que na v1:** pedido explícito dos tutores, de custo moderado (depende apenas do histórico e do envio de notificações) e com alto impacto na saúde e na receita.

### Riscos de adiar as demais funcionalidades

- **Relatórios (RF07):** a gerência ficará sem visão consolidada; **mitigação:** exportar os dados para planilha e implementar os relatórios logo após a v1. Risco baixo.
- **Pagamento pelo aplicativo:** a clínica continua cobrando presencialmente e perde conveniência; risco de insatisfação de alguns tutores. Baixo para a operação, e evita risco de segurança e de atraso.
- **Chat com o veterinário:** tutores continuam usando WhatsApp, o que mantém a informalidade e a dispersão atuais; porém, implementá-lo cedo criaria obrigações de resposta e riscos de responsabilidade. **Mitigação:** manter o canal atual e planejar o chat para uma versão posterior, após definir regras de atendimento.
- **Fotos dos animais:** risco praticamente nulo para a operação; pode reduzir o engajamento inicial, mas não afeta a saúde nem o atendimento.
- **Risco geral:** adiar essas funcionalidades pode gerar expectativas frustradas no proprietário. **Mitigação:** comunicar o roadmap (v1.1: relatórios; v2: pagamento, chat e fotos) e revisar a priorização após a primeira versão, com feedback real dos usuários.
