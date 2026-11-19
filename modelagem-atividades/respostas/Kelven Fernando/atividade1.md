# Atividade 1 — Engenharia de Requisitos

**Aluno:** _Kelven Fernando Basilio de Farias_

---

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

Hoje a universidade tem os serviços acadêmicos espalhados e um sistema atual que, segundo os próprios alunos, é lento e difícil de usar. Isso faz o aluno perder tempo para achar uma nota ou um horário, faz o professor ter dificuldade para passar material e avisos, e deixa a coordenação sem um canal bom para divulgar eventos e informações.

O Conecta Campus quer resolver exatamente isso. O objetivo principal é **centralizar os serviços acadêmicos em um único sistema**, em que alunos, professores e coordenação consigam consultar e divulgar informações de forma rápida, simples e segura, com acesso apenas para quem estiver autenticado.

### 2. Elicitação

**Principais stakeholders:**

- **Alunos:** são os principais usuários. Querem consultar notas e horários e receber avisos sem complicação.
- **Professores:** precisam publicar materiais e comunicados. Alguns também querem o chat.
- **Coordenação:** quer divulgar eventos e informações acadêmicas.
- **Secretaria acadêmica:** normalmente é quem lida com os dados de notas e horários, então precisa estar envolvida.
- **Direção/universidade (patrocinador):** quem paga o projeto e exige a autenticação obrigatória.
- **Equipe de TI e de desenvolvimento:** vão construir e manter o sistema, e é quem avisa que o chat pode atrasar a primeira versão.

**Técnicas de elicitação:**

1. **Entrevistas:** eu faria entrevistas individuais ou em pequenos grupos com representantes de cada grupo (alguns alunos de cursos e períodos diferentes, professores, alguém da coordenação e da secretaria). Levaria um roteiro com perguntas abertas, tipo "o que mais te atrapalha no sistema atual?" e "o que você faz hoje que gostaria que fosse mais fácil?". A vantagem é que dá para aprofundar quando a pessoa fala algo interessante, principalmente a reclamação de que o sistema é "lento e difícil de usar", que é vaga e precisa ser detalhada.

2. **Questionário online:** como são muitos alunos, não dá para entrevistar todo mundo. Um formulário curto, com perguntas de múltipla escolha e algumas abertas, permitiria saber quais funcionalidades são mais usadas, em que dispositivo o aluno acessa (celular ou computador) e o que mais incomoda hoje. Os resultados ajudam a priorizar depois.

3. **Observação e análise do sistema atual:** eu pediria para alguns alunos e professores usarem o sistema atual enquanto eu observo. Assim dá para ver onde a pessoa trava, quantos cliques gasta para achar uma nota, e entender na prática o que é "difícil de usar". Também olharia as telas do sistema antigo para saber o que vale manter e o que deve ser melhorado.

### 3. Análise e modelagem

**Requisitos funcionais**

| ID | Requisito |
|---|---|
| RF01 | O sistema deve permitir que o usuário (aluno, professor ou coordenação) faça login com credenciais pessoais e só acesse as informações após se autenticar. |
| RF02 | O sistema deve permitir que o aluno consulte suas notas por disciplina e por período. |
| RF03 | O sistema deve permitir que o aluno consulte seu horário de aulas. |
| RF04 | O sistema deve permitir que o aluno visualize os avisos publicados e receba notificação quando houver um aviso novo. |
| RF05 | O sistema deve permitir que o professor publique materiais (arquivos e links) nas suas disciplinas. |
| RF06 | O sistema deve permitir que o professor publique comunicados para as turmas em que leciona. |
| RF07 | O sistema deve permitir que a coordenação divulgue eventos e informações acadêmicas para os alunos. |

**Requisitos não funcionais**

| ID | Requisito |
|---|---|
| RNF01 | **Desempenho:** as telas principais devem carregar rapidamente, mesmo com muitos usuários acessando ao mesmo tempo. |
| RNF02 | **Segurança:** as informações acadêmicas só podem ser acessadas por usuários autenticados e autorizados. |
| RNF03 | **Usabilidade:** o sistema deve ser fácil de usar, sem exigir treinamento. |
| RNF04 | **Disponibilidade:** o sistema deve estar disponível durante o período letivo, principalmente em épocas de divulgação de notas. |
| RNF05 | **Compatibilidade:** o sistema deve funcionar bem em celular e em computador, nos navegadores mais usados. |

### 4. Negociação (MoSCoW)

| Classificação | Itens |
|---|---|
| **Must have** | RF01 (login), RF02 (notas), RF03 (horários), RF04 (avisos), RF05 e RF06 (materiais e comunicados), RNF01 (desempenho), RNF02 (segurança), RNF03 (usabilidade) |
| **Should have** | RF07 (eventos e informações acadêmicas), RNF04 (disponibilidade), RNF05 (compatibilidade) |
| **Could have** | Notificações push no celular, busca dentro dos materiais publicados, filtro de avisos por curso |
| **Won't have** | Chat entre alunos e professores (nesta versão) |

**Justificativas:**

- **Must:** esses itens são o coração do sistema. Sem login, notas, horários e avisos o Conecta Campus não faz sentido, e eram justamente as necessidades principais dos alunos. A publicação de materiais e comunicados é a necessidade principal dos professores. A segurança é uma exigência da própria universidade, então não é negociável. Desempenho e usabilidade entram como Must porque a maior reclamação dos alunos é justamente o sistema atual ser lento e difícil de usar; se a versão nova repetir esse problema, ela falha no objetivo.
- **Should:** a divulgação de eventos é importante para a coordenação, mas o sistema funciona sem ela no primeiro momento, e a coordenação ainda pode usar os avisos gerais enquanto isso. Disponibilidade e compatibilidade são muito importantes, mas dá para ir melhorando depois do lançamento.
- **Could:** são melhorias legais, porém não impedem o uso do sistema. Entram se sobrar tempo e orçamento.
- **Won't:** o chat foi pedido só por alguns professores, e a própria equipe acredita que ele pode atrasar a primeira versão. Chat exige mais complexidade (tempo real, moderação, histórico de mensagens, privacidade) e o sistema já funciona bem sem ele. A sugestão é deixar para uma versão futura, depois de ver se realmente há demanda. Nesse meio-tempo, os professores podem usar os comunicados (RF06) para falar com a turma.

### 5. Especificação

A frase "O aplicativo deve ser rápido, seguro e fácil de usar" foi dividida em requisitos que dá para medir e testar:

**RNF01 — Desempenho**
- *Requisito:* em condições normais de uso, 95% das telas (login, notas, horários e avisos) devem carregar em até 3 segundos, com até 1.000 usuários simultâneos.
- *Como testar:* teste de carga com uma ferramenta como o JMeter, simulando 1.000 usuários acessando essas telas e verificando o tempo de resposta.

**RNF02 — Segurança**
- *Requisito:* nenhuma informação acadêmica deve ser acessível sem autenticação. As senhas devem ser armazenadas com hash, toda a comunicação deve usar HTTPS e a sessão deve expirar após 15 minutos de inatividade.
- *Como testar:* tentar acessar as páginas de notas e horários sem estar logado (o sistema deve redirecionar para o login ou retornar erro de acesso negado), conferir no banco se as senhas estão com hash, verificar o certificado HTTPS e testar o tempo de expiração da sessão. Também dá para rodar uma verificação de vulnerabilidades básicas, como as do OWASP Top 10.

**RNF03 — Usabilidade**
- *Requisito:* pelo menos 90% dos alunos de um grupo de teste devem conseguir consultar uma nota em até 3 cliques e em menos de 1 minuto, sem ajuda. A nota média de satisfação em um questionário de usabilidade (SUS) deve ser de pelo menos 70 pontos.
- *Como testar:* teste de usabilidade com um grupo de uns 10 a 15 alunos, cronometrando as tarefas e aplicando o questionário SUS no final.

**RNF04 — Disponibilidade** (extra)
- *Requisito:* o sistema deve ficar disponível pelo menos 99% do tempo durante o período letivo.
- *Como testar:* monitoramento automático (ferramenta de uptime) registrando as quedas ao longo do mês.

### 6. Validação

1. **Prototipação e demonstração:** antes de desenvolver, a equipe monta protótipos das telas (pode ser no Figma) com as principais funções, como login, consulta de notas e publicação de comunicados, e mostra para alunos, professores e coordenação. A ideia é que eles cliquem e digam se aquilo realmente resolve o problema. É uma forma barata de descobrir mal-entendidos e funcionalidades faltando antes de gastar tempo programando.

2. **Revisão dos requisitos com os stakeholders (inspeção/reunião de validação):** a equipe apresenta a lista de requisitos, já com a classificação MoSCoW, em uma reunião com representantes de cada grupo. Cada um lê e confirma se o que está escrito corresponde ao que disse. Pode usar um checklist (o requisito está claro? é testável? tem conflito com outro?) e registrar tudo em ata. Isso ajuda a confirmar também a decisão de deixar o chat para depois, para que ninguém seja surpreendido.

3. **Critérios de aceitação:** para cada requisito importante, definir junto com o usuário o que significa "estar pronto" (por exemplo: "o aluno vê as notas de todas as disciplinas do semestre atual após o login"). Assim, quando a versão for entregue, todos já sabem como conferir.

---

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders

**Principais stakeholders e suas necessidades:**

| Stakeholder | O que precisa |
|---|---|
| **Tutores dos animais** | Marcar consultas pelo celular, sem precisar ligar ou mandar mensagem, e receber lembretes de vacinação para não esquecer. |
| **Veterinários** | Consultar rapidamente o histórico do animal (consultas, vacinas, medicamentos) e registrar diagnósticos, tratamentos e medicamentos no próprio sistema. |
| **Recepção** | Controlar os horários disponíveis, confirmar ou cancelar consultas e evitar choque de horários. |
| **Gerência** | Ver relatórios com a quantidade de atendimentos realizados para acompanhar o movimento da clínica. |
| **Proprietário (patrocinador)** | Ter um sistema rápido, seguro e fácil de usar, entregue em quatro meses e dentro do orçamento. |
| **Equipe de desenvolvimento** | Ter requisitos claros e um escopo possível de entregar no prazo. |

**Técnicas de elicitação:**

1. **Entrevistas com cada grupo:** conversar separadamente com o proprietário, um ou dois veterinários, a recepcionista, a gerência e alguns tutores. Cada grupo tem uma visão diferente do problema, e a entrevista individual deixa a pessoa mais à vontade para falar o que realmente atrapalha. No caso do proprietário, ajuda a entender o que ele quer dizer com "rápido, seguro e muito fácil de usar", já que a frase é muito subjetiva.

2. **Observação do trabalho na clínica:** passar um tempo na clínica vendo como o agendamento é feito hoje por telefone e WhatsApp, como a recepção anota os horários e como o veterinário procura as fichas. Escolhi essa técnica porque muita gente não percebe os próprios problemas ou esquece de contar detalhes na entrevista. Ver o processo real mostra gargalos, como o tempo que se perde procurando uma ficha em papel.

3. **Análise de documentos:** olhar as fichas, planilhas e arquivos atuais para ver quais informações são registradas hoje (dados do tutor, vacinas, medicamentos etc.) e quais campos o sistema precisa ter. Isso evita esquecer algo importante no cadastro.

4. **Questionário rápido com tutores (opcional):** serve para alcançar mais clientes de uma vez e saber, por exemplo, se preferem lembrete por notificação, WhatsApp ou e-mail, e se têm interesse mesmo em pagamento, chat e fotos pelo app.

### 2. Análise e especificação de requisitos

**Requisitos funcionais**

| ID | Requisito |
|---|---|
| RF01 | O sistema deve permitir o cadastro de tutores e de seus animais (nome, espécie, raça, idade e dados de contato do tutor). |
| RF02 | O sistema deve permitir que o tutor agende uma consulta pelo celular, escolhendo entre os horários disponíveis. |
| RF03 | O sistema deve permitir que a recepção visualize a agenda, controle os horários disponíveis e confirme ou cancele consultas. |
| RF04 | O sistema deve permitir que o veterinário consulte o histórico completo do animal (consultas anteriores, vacinas e medicamentos). |
| RF05 | O sistema deve permitir que o veterinário registre diagnósticos, tratamentos e medicamentos após cada atendimento. |
| RF06 | O sistema deve enviar lembretes de vacinação ao tutor antes da data prevista (por exemplo, 7 dias antes). |
| RF07 | O sistema deve gerar relatórios de quantidade de atendimentos por período (dia, semana ou mês) para a gerência. |
| RF08 | O sistema deve exigir login e controlar o acesso de acordo com o perfil (tutor, veterinário, recepção e gerência). |

**Requisitos não funcionais**

| ID | Requisito |
|---|---|
| RNF01 | **Desempenho:** as principais telas (agenda, histórico do animal) devem responder rapidamente, sem travar no horário de maior movimento. |
| RNF02 | **Segurança e privacidade:** os dados dos tutores e dos animais devem ser protegidos, e cada perfil só deve ver o que for necessário para o seu trabalho (alinhado à LGPD). |
| RNF03 | **Usabilidade:** o tutor deve conseguir agendar uma consulta sem precisar de ajuda ou tutorial. |
| RNF04 | **Disponibilidade e backup:** o sistema deve estar disponível durante o horário de funcionamento da clínica e ter cópia de segurança dos dados do histórico clínico. |

### 3. Negociação com MoSCoW

| Classificação | Itens |
|---|---|
| **Must have** | RF01 (cadastro), RF02 (agendamento pelo celular), RF03 (agenda da recepção), RF04 e RF05 (histórico e registro clínico), RF08 (login e perfis), RNF01 a RNF03 |
| **Should have** | RF06 (lembretes de vacinação), RF07 (relatórios para a gerência), RNF04 (disponibilidade e backup mais robustos) |
| **Could have** | Botão que abre o WhatsApp da clínica dentro do app (alternativa simples ao chat), confirmação de consulta por notificação |
| **Won't have** | Pagamento pelo aplicativo, chat com o veterinário, área de publicação de fotos dos animais (todos nesta primeira versão) |

**Justificativas:**

- **Must:** são as funcionalidades que atacam o problema central da clínica, que é o agendamento desorganizado (telefone e WhatsApp) e o histórico espalhado em fichas. Sem cadastro, agendamento, agenda da recepção e prontuário, o sistema não substitui o que existe hoje. O login com perfis entra como Must porque estamos lidando com dados pessoais e clínicos.
- **Should:** os lembretes de vacinação e os relatórios são importantes e foram pedidos por tutores e gerência, mas a clínica consegue funcionar sem eles nas primeiras semanas. Entram na versão 1 se o cronograma permitir, ou logo em seguida.
- **Pagamento pelo aplicativo (Won't):** exige integração com um gateway de pagamento, cuidados extras de segurança, taxas e regras fiscais. É uma funcionalidade pesada para um prazo de quatro meses e não resolve o problema principal. A clínica pode continuar recebendo no balcão sem prejudicar o resto. Pode virar uma versão 2.
- **Chat com o veterinário (Won't):** o chat dá bastante trabalho (mensagens em tempo real, notificações, histórico, privacidade) e ainda cria uma expectativa de resposta rápida que o veterinário talvez não consiga cumprir no meio dos atendimentos. Como os tutores já usam o WhatsApp hoje, a alternativa mais barata é, no máximo, colocar um botão que abra o WhatsApp da clínica (Could).
- **Publicação de fotos (Won't):** é uma funcionalidade mais social, que traz engajamento mas não resolve nenhuma dor operacional da clínica. Também traz custo de armazenamento e a necessidade de moderar conteúdo. É a de menor prioridade de todas.

### 4. Especificação de requisitos não funcionais

A frase "O sistema deve ser rápido, seguro e muito fácil de usar" foi transformada nos seguintes requisitos:

**RNF01 — Desempenho (rápido)**
- *Requisito:* 95% das requisições nas telas de agenda e histórico do animal devem responder em até 2 segundos, com até 200 usuários simultâneos. O agendamento de uma consulta deve ser confirmado em até 3 segundos após o tutor clicar em "confirmar".
- *Como verificar:* teste de carga com JMeter (ou similar) simulando 200 usuários e medindo o tempo de resposta; cronometrar o fluxo de agendamento em testes manuais.

**RNF02 — Segurança**
- *Requisito:* todo acesso deve exigir login; senhas devem ser armazenadas com hash; toda comunicação deve usar HTTPS; o histórico clínico só pode ser acessado por veterinários e recepção autorizados (o tutor vê apenas os dados dos próprios animais); todo acesso a prontuário deve ficar registrado em log.
- *Como verificar:* testes de acesso com cada perfil tentando abrir dados que não deveria (deve receber erro de acesso negado); conferir o certificado HTTPS; checar no banco as senhas com hash; revisar se os logs estão sendo gravados; rodar uma verificação básica de vulnerabilidades (OWASP).

**RNF03 — Usabilidade (fácil de usar)**
- *Requisito:* pelo menos 90% dos tutores de um grupo de teste devem conseguir agendar uma consulta em até 5 passos e em menos de 2 minutos, sem ajuda e sem treinamento. A nota de satisfação no questionário SUS deve ser de pelo menos 75.
- *Como verificar:* teste de usabilidade com cerca de 10 tutores, cronometrando a tarefa e aplicando o questionário SUS no final.

**RNF04 — Disponibilidade e backup**
- *Requisito:* o sistema deve estar disponível pelo menos 99,5% do tempo no horário de funcionamento da clínica, e um backup completo dos dados deve ser feito diariamente.
- *Como verificar:* monitoramento de uptime durante o mês e teste de restauração de backup pelo menos uma vez antes do lançamento.

### 5. Validação dos requisitos

1. **Protótipo navegável com demonstração por perfil:** antes de começar a programar, a equipe cria um protótipo no Figma com as telas principais (agendamento do tutor, agenda da recepção, prontuário do veterinário, relatório da gerência). Depois faz sessões curtas com cada grupo, pedindo que executem tarefas reais, como "marque uma consulta para o seu cachorro" ou "registre um medicamento para este paciente". Isso ajuda a encontrar **omissões** (por exemplo, o veterinário sente falta de um campo de peso do animal) e **divergências** (a recepção imaginava o fluxo de outro jeito), antes que virem retrabalho.

2. **Revisão/inspeção dos requisitos com checklist:** a equipe monta a lista final de requisitos e faz uma reunião de revisão com o proprietário, um veterinário, a recepção e a gerência, junto com uma checklist: o requisito está claro? é mensurável? tem conflito com outro? está de acordo com o que foi pedido? Cada um confirma ou corrige o que for relativo ao seu trabalho. Também é a hora de confirmar com o proprietário o significado de "rápido, seguro e fácil", agora com números, e de alinhar que pagamento, chat e fotos ficam para depois. O resultado fica registrado em ata, evitando que alguém diga depois que "não era isso que eu pedi".

3. **Critérios de aceitação e casos de teste:** para os requisitos principais, escrever junto com o usuário os critérios de aceitação (ex.: "ao cancelar uma consulta, o horário volta a ficar disponível na agenda"). Assim já se valida, antes do desenvolvimento, se o requisito está testável e se todos entendem da mesma forma.

### 6. Desafio — Priorização da primeira versão

Com orçamento para só cinco funcionalidades, escolhi as que atacam o problema central da clínica (agenda bagunçada e histórico espalhado) e que atendem os quatro grupos de usuários. O login e o controle de acesso eu considerei como base técnica do sistema, não como uma das cinco funcionalidades.

**1. Agendamento de consultas pelo celular**
- *Necessidade:* os tutores querem marcar consulta sem precisar ligar ou mandar mensagem, e a clínica quer sair do agendamento manual por telefone/WhatsApp.
- *Beneficiados:* tutores e recepção (menos ligações e menos erros de anotação).
- *Por que na v1:* é a principal porta de entrada do sistema e a mudança mais visível para o cliente. Sem isso o app quase não teria motivo para ser usado.

**2. Gestão da agenda pela recepção (horários, confirmação e cancelamento)**
- *Necessidade:* a recepção precisa controlar os horários disponíveis e confirmar ou cancelar consultas.
- *Beneficiados:* recepção, veterinários (agenda organizada) e tutores (menos choque de horário).
- *Por que na v1:* o agendamento do tutor depende dela. Se os horários não forem controlados no mesmo lugar, vai dar conflito entre o que o tutor marca e o que a recepção tem.

**3. Prontuário eletrônico do animal (cadastro, histórico e registro de diagnósticos, tratamentos e medicamentos)**
- *Necessidade:* hoje as informações ficam em fichas e arquivos separados, e é difícil achar o histórico rapidamente. O veterinário quer consultar e registrar tudo no mesmo lugar.
- *Beneficiados:* veterinários principalmente, mas também os animais (atendimento mais seguro e com menos risco de erro de medicação) e os tutores.
- *Por que na v1:* é o coração clínico do sistema e a dor mais grave descrita no problema. Também é a base para os lembretes e para os relatórios.

**4. Lembretes de vacinação**
- *Necessidade:* os tutores querem ser avisados da vacinação, e a clínica quer evitar que o animal fique com a vacina atrasada.
- *Beneficiados:* tutores e animais, e também a clínica, que ganha retorno de clientes e mais consultas.
- *Por que na v1:* tem muito valor percebido, é relativamente simples de fazer quando o prontuário já existe, e ajuda a clínica a ter um diferencial.

**5. Relatório de atendimentos para a gerência**
- *Necessidade:* a gerência quer visualizar a quantidade de atendimentos realizados.
- *Beneficiados:* gerência e proprietário.
- *Por que na v1:* completa o atendimento a todos os grupos principais e é de fácil implementação, já que os dados vêm do agendamento e do prontuário. Mostra para o proprietário o retorno do investimento.

**Riscos de adiar as demais funcionalidades:**

- **Pagamento pelo aplicativo:** o risco é pequeno. A clínica continua cobrando no balcão como hoje. O ponto negativo é que o processo continua parcialmente manual, e alguns tutores podem esperar essa comodidade.
- **Chat com o veterinário:** os tutores vão continuar usando o WhatsApp, então a comunicação continua dispersa e fora do histórico do animal. É um risco aceitável, e dá para reduzir com um botão que abra o WhatsApp da clínica.
- **Publicação de fotos:** o risco é mínimo. Perde-se um pouco de engajamento, mas nenhuma parte essencial da operação depende disso.
- **Risco geral:** o prazo de quatro meses é apertado, então tentar encaixar mais coisas pode atrasar a entrega ou piorar a qualidade das funcionalidades principais. Por isso, é melhor entregar menos funcionalidades, bem feitas e testadas, e usar o feedback do uso real para decidir o que entra na versão 2.
