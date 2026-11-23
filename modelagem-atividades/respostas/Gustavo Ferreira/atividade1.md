# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

O grande problema é como essas informações estão distribuidas e como juntarb elas em um só lugar,o seja a dispersão dos serviços acadêmicos:
notas, horários, avisos, materiais e eventos circulam por murais, e-mails, grupos de
mensagem e sistemas legados, cada um com uma porta de entrada diferente. Isso gera três
dores concretas — o aluno não sabe onde buscar informação, o professor depende de canais
informais para publicar, e a coordenação não tem canal oficial com alcance garantido.
A reclamação de lentidão e dificuldade de uso indica que o sistema atual falha em
qualidade de uso, não apenas em funcionalidade.

O objetivo principal é oferecer um ponto único de acesso, no qual aluno,
professor e coordenação executem suas três operações essenciais (consultar, publicar e
divulgar) com desempenho e usabilidade superiores ao sistema atual, dentro do escopo da
primeira versão.

> Para alunos, professores e coordenação da universidade, que hoje acessam informações
> acadêmicas por canais dispersos e lentos, o Conecta Campus é um portal web que centraliza
> consulta de notas e horários, publicação de materiais e divulgação de eventos em um único
> ambiente autenticado. Diferentemente do sistema atual, ele prioriza rapidez de resposta e
> simplicidade de uso, sem incorporar, nesta versão, comunicação em tempo real entre alunos
> e professores.

O chat foi deixado de lado para não atrasar a primeira  versão.

## 2. Stakeholders e técnicas de elicitação

| Stakeholder | Necessidade central |
|---|---|
| Alunos | Consultar notas e horários rapidamente e não perder avisos |
| Professores | Publicar materiais e comunicados sem depender de terceiros |
| Coordenação de curso | Divulgar eventos e informações oficiais com alcance mensurável |
| Reitoria / pró-reitoria (patrocinador) | Adoção do portal e redução de atendimento manual |
| TI / infraestrutura | Integração com a base acadêmica e com o login institucional |
| Segurança da informação / encarregado de dados (LGPD) | Controle de acesso e rastreabilidade |
| Equipe de desenvolvimento e suporte | Requisitos estáveis, escopo viável, baixo volume de chamados |

Técnicas indicadas (a literatura de elicitação lista entrevistas, questionários,
prototipação, análise de documentos, observação e dinâmicas de grupo como repertório básico):

- **Entrevista semiestruturada** com coordenação e professores, com roteiro por perfil.
  Com a coordenação, o foco é o fluxo de divulgação (quem aprova um aviso, qual o alcance
  esperado, o que acontece hoje quando o aviso não chega). Com professores, o foco é o
  formato dos materiais e a frequência de publicação. A entrevista é a técnica que revela
  exceções que ninguém documenta.
- **Questionário online com alunos**, aproveitando o tamanho da população: perguntas
  fechadas sobre quais informações são buscadas com mais frequência, em que dispositivo
  (celular ou desktop), com que frequência e qual o tempo aceitável de espera. Serve para
  quantificar prioridades, algo que a entrevista não faz com confiança estatística.
- **Observação do uso atual** (acompanhar um aluno tentando obter a nota e um professor
  publicando um material). É a técnica mais eficaz para capturar a causa real da queixa de "lento e difícil".
- **Análise de documentos**: calendário acadêmico, regimento, política de acesso a dados e
  o próprio sistema legado, para descobrir regras de negócio já existentes.
- **brainstorming** com representantes dos três perfis para gerar e filtrar
  ideias antes de fechar o escopo.

## 3. Requisitos funcionais e não funcionais

### Requisitos funcionais

| ID | Requisito |
|---|---|
| RF01 | O sistema deve autenticar alunos, professores e coordenação com as credenciais institucionais, impedindo qualquer acesso anônimo a dados acadêmicos. |
| RF02 | O aluno deve consultar suas notas, filtradas por disciplina e período letivo. |
| RF03 | O aluno deve consultar o horário de aulas da semana corrente. |
| RF04 | O aluno deve visualizar os avisos destinados ao seu curso/turma, com indicação de lido/não lido. |
| RF05 | O professor deve publicar materiais (arquivos ou links) vinculados a uma disciplina sob sua responsabilidade. |

### Requisitos não funcionais

| ID | Requisito |
|---|---|
| RNF01 | Toda requisição a dados acadêmicos deve ser autenticada, com sessão expirando após 30 minutos de inatividade. |
| RNF02 | Consultas de notas e horários devem responder em até 2 segundos no percentil 95, com 500 usuários simultâneos. |
| RNF03 | O aluno deve localizar sua nota em no máximo 3 interações a partir da página inicial. |

## 4. Negociação com MoSCoW

A regra de decisão do MoSCoW é a pergunta de desafio: "o que acontece se isso não for
entregue?" Se a resposta for "o produto não resolve o problema", é Must. Se for "dói, mas
existe alternativa", é Should. Uma heurística complementar é manter os Must em torno de
60% do esforço total da release.

| Classificação | Itens | Justificativa |
|---|---|---|
| **Must** | RF01, RF02, RF03, RF04, RF05, RNF01 | sem notas, horários e avisos o aluno não tem motivo para usar; sem publicação o professor continua no canal informal. É o núcleo do problema. |
| **Should** | Notificação por e-mail dos avisos, busca de conteúdo, relatório de leitura de avisos | Importantes, mas a coordenação consegue divulgar eventos por mural no primeiro mês, e o aviso dentro do portal já cumpre o essencial. A notificação push/e-mail aumenta alcance, porém depende de integração externa. |
| **Could** | Exportação de material em PDF, personalização do painel do aluno, integração com o calendário pessoal do celular | Agradáveis e baratos, mas nenhum resolve dor central. Entram se sobrar folga. |
| **Won't (nesta versão)** | Chat aluno/professor. |


## 5. Especificação mensurável e validação

A frase "rápido, seguro e fácil de usar" contém três atributos de qualidade legítimos, mas
sem medição, população. O padrão correto inclui número, percentual e
cenário, como em "o login deve ocorrer em menos de 500 ms para 99% dos usuários".

| Requisito mensurável | Critério objetivo | Como testar |
|---|---|---|
| Desempenho | 95% das consultas de notas e horários respondidas em ≤ 2 s, com 500 usuários virtuais simultâneos | Teste de carga em ambiente de homologação com base equivalente à de produção; gerar relatório de percentis p50/p95/p99 |
| Segurança | 100% dos endpoints de dados acadêmicos retornam 401/403 sem token válido ou com perfil insuficiente; nenhuma senha armazenada em texto claro | Varredura, testes de autorização por perfil + inspeção do esquema do banco |
| Usabilidade | Taxa de sucesso ≥ 90% na primeira tentativa ao executar 3 tarefas (achar a nota, achar o horário, ler um aviso); | Teste de usabilidade moderado com 12-15 alunos reais, medindo tempo, cliques e erros; aplicar o questionário SUS ao final |
| Acessibilidade e responsividade | Conformidade WCAG 2.1 nível AA nos fluxos principais; renderização correta em 360 px | Auditoria automatizada (Lighthouse/axe) + checklist manual de teclado e contraste |

## 6. Validação com os stakeholders (duas técnicas mínimas):

- **Revisão formal dos requisitos (walkthrough com inspeção)**: cada stakeholder percorre
  a lista do seu perfil e confirma item a item, com um moderador e um escriba. Serve para
  detectar omissões e divergências de vocabulário — por exemplo, quando a coordenação
  entende "aviso" como comunicado institucional e o professor entende como recado da turma.
- **Prototipação navegável de baixa/média fidelidade**: o aluno "clica" em um protótipo das
  telas de nota e horário, e o professor simula publicar um material. É a forma mais barata
  de descobrir que o requisito estava escrito corretamente mas o fluxo estava errado, antes
  de qualquer linha de código.

# Estudo de Caso 2 — PetCare

## 1. Stakeholders e necessidades

| Stakeholder | Necessidade | Situação atual |
|---|---|---|
| Tutor do animal | Agendar pelo celular e ser lembrado de vacinas | Depende de ligação/WhatsApp no horário comercial |
| Veterinário | Ver histórico completo (consultas, vacinas, medicamentos) e registrar diagnóstico e prescrição | Consulta fichas e arquivos separados, perdendo tempo e contexto |
| Recepção | Controlar horários e confirmar/cancelar consultas | Faz controle manual, sujeito a conflito de agenda |
| Gerência / proprietário | Relatórios de atendimentos realizados | Não tem visão consolidada para decidir |
| Animal | Ser atendido com continuidade clínica | Histórico fragmentado entre profissionais |
| Conselho profissional / órgão regulador | Guarda e integridade do prontuário | Prontuário em papel, sem rastreabilidade |
| Parceiro de pagamentos (futuro) | Integração financeira | Fora do escopo inicial |

Técnicas escolhidas e justificativa:

- **Observação direta no balcão (shadowing da recepção)**: acompanhar um turno inteiro de
  atendimento telefônico e WhatsApp. É insubstituível aqui porque o gargalo real está no
  fluxo de trabalho, não no discurso: revela quantas ligações são reagendamentos, quanto
  tempo se perde procurando uma ficha e quais "gambiarras" a recepção inventou (por
  exemplo, anotar vacinas em caderno paralelo).
- **Entrevista semiestruturada com veterinários**: o prontuário é um artefato clínico, e só
  o profissional sabe o que precisa estar visível em 10 segundos de consulta (alergias,
  último vermífugo, peso, diagnóstico anterior). Perguntas abertas sobre casos reais
  recentes funcionam melhor que perguntas sobre "funcionalidades desejadas".
- **Análise de documentos**: as fichas de papel, planilhas de agenda e históricos de vacina
  existentes são a melhor especificação disponível do modelo de dados.
- **Questionário com tutores** (enviado por WhatsApp/e-mail): mede frequência de uso,
  dispositivo, tolerância a tempo de agendamento e disposição a usar lembretes automáticos.
- **Workshop/JAD com recepção, veterinário e gerência juntos**: resolve conflitos de
  prioridade no mesmo ambiente — por exemplo, a recepção quer manter poder de bloqueio de
  agenda que o veterinário considera desnecessário.

# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

| Stakeholder | Necessidade | Situação atual |
|---|---|---|
| Tutor do animal | Agendar pelo celular e receber lembrete de vacinação | Depende de ligação ou WhatsApp no horário comercial |
| Veterinário | Consultar o histórico completo e registrar diagnóstico, tratamento e medicamentos | Consulta fichas e arquivos separados, perdendo tempo e contexto |
| Recepção | Controlar horários disponíveis e confirmar ou cancelar consultas | Faz controle manual, sujeito a conflito de agenda |
| Gerência / proprietário | Visualizar relatórios de atendimentos realizados | Não tem visão consolidada para decidir |
| Órgão regulador / conselho profissional | Guarda e integridade do prontuário | Prontuário em papel, sem rastreabilidade |

O problema não é a ausência de um sistema, e sim a dispersão: o agendamento vive no
telefone e no WhatsApp, e o histórico do animal está em fichas e arquivos separados. Quem
atende não consegue responder rápido o que já foi feito, e quem decide não tem número
nenhum para olhar.

Técnicas indicadas (a literatura de elicitação lista entrevistas, questionários,
prototipação, análise de documentos, observação e dinâmicas de grupo como repertório básico):

- **Observação no balcão**: acompanhar um turno inteiro da recepção, contando quantas
  ligações são reagendamentos, quanto tempo se perde procurando uma ficha e quais
  controles paralelos já existem. É a técnica mais eficaz para achar o gargalo real, porque
  o problema está no fluxo de trabalho e não no discurso.
- **Entrevista semiestruturada** com veterinários e recepção, com roteiro por perfil. Com o
  veterinário, o foco é o que precisa estar visível em 10 segundos de consulta (alergias,
  último vermífugo, diagnóstico anterior). Com a recepção, o foco é o que acontece quando
  dois tutores querem o mesmo horário.
- **Análise de documentos**: as fichas de papel, planilhas de agenda e históricos de vacina
  são a melhor especificação disponível do modelo de dados.
- **Questionário com tutores**, enviado por WhatsApp ou e-mail: mede frequência de uso,
  dispositivo e tolerância ao tempo de agendamento.
- **brainstorming** com recepção, veterinários e gerência para gerar e filtrar ideias antes
  de fechar o escopo.

## 2. Análise e especificação de requisitos

### Requisitos funcionais

| ID | Requisito |
|---|---|
| RF01 | O sistema deve cadastrar tutores e seus animais, mantendo o vínculo tutor-animal (um tutor, vários animais). |
| RF02 | O tutor deve agendar consulta pelo aplicativo, escolhendo serviço, veterinário e horário disponível. |
| RF03 | O veterinário deve consultar o histórico consolidado do animal: consultas, diagnósticos, tratamentos, medicamentos e vacinas. |
| RF04 | O veterinário deve registrar o atendimento com diagnóstico, procedimento realizado, prescrição e data, associado ao seu registro profissional. |
| RF05 | A recepção deve visualizar a agenda por veterinário e dia, confirmando, cancelando ou reagendando consultas e bloqueando horários. |

### Requisitos não funcionais

| ID | Requisito |
|---|---|
| RNF01 | A abertura do prontuário de um animal deve ocorrer em até 2 segundos no percentil 95, com 100 usuários simultâneos. |
| RNF02 | Todo acesso deve ser autenticado e autorizado por perfil, com senhas armazenadas em hash e tráfego exclusivamente em TLS 1.2+. |
| RNF03 | O tutor deve concluir um agendamento em no máximo 4 telas e 2 minutos, com taxa de erro inferior a 5%. |

## 3. Negociação com MoSCoW

A regra de decisão continua sendo a pergunta de desafio: "o que acontece se isso não for
entregue?". Com quatro meses de prazo, o Must precisa ser o que impede a clínica de operar.

| Classificação | Itens | Justificativa |
|---|---|---|
| **Must** | RF01, RF02, RF03, RF04, RF05, RNF02 | sem cadastro nada existe; sem agendamento pelo app e sem controle de agenda a recepção continua no telefone; sem histórico e registro clínico o sistema não centraliza informação nenhuma. Segurança não é negociável por lidar com dados de saúde. |
| **Should** | Lembretes automáticos de consulta e vacina, relatório de atendimentos, controle de próxima dose | São valiosos, mas dependem de integração com provedor externo (WhatsApp/SMS) ou podem sair de consulta direta ao banco no primeiro mês. Cabem na versão 1.1. |
| **Could** | Histórico de vacinas no portal do tutor, exportação do prontuário em PDF | Desejáveis e baratos, mas não resolvem dor central. Entram se sobrar folga. |
| **Won't (nesta versão)** | Pagamento pelo app, chat com o veterinário, publicação de fotos dos animais. | |

Sobre as três funcionalidades descartadas:

- **Pagamento pelo app** exige integração com gateway, conciliação, estorno e mais obrigação
  de segurança, tudo dentro de quatro meses. A clínica já cobra no balcão, então o ganho é
  conveniência, não desbloqueio operacional.
- **Chat com o veterinário** cria expectativa de resposta imediata, exige plantão de
  atendimento e abre um canal em que o tutor relata sintomas e recebe orientação, o que
  gera responsabilidade clínica. É o pior custo-benefício do projeto.
- **Fotos dos animais** têm valor afetivo e quase nenhum valor operacional, além de exigir
  armazenamento de mídia, moderação e tratamento de direito de imagem.

Pagamento, chat e fotos ficaram de fora desta versão para não atrasar a entrega.

## 4. Especificação de requisitos não funcionais

A frase "rápido, seguro e muito fácil de usar" contém três atributos de qualidade legítimos,
mas sem medição nem população. O padrão correto inclui número, percentual e cenário.

| Requisito mensurável | Critério objetivo | Como testar |
|---|---|---|
| Desempenho | 95% das aberturas de prontuário em ≤ 2 s; 99% dos agendamentos em ≤ 1,5 s, com 100 usuários virtuais simultâneos | Teste de carga em ambiente de homologação com base de volume real (animal com 40 atendimentos, por exemplo); relatório de percentis p50/p95/p99 |
| Segurança | 0 acessos indevidos: nenhum tutor visualiza prontuário e nenhum veterinário acessa prontuário de animal sem vínculo com a clínica; nenhuma senha em texto claro | Matriz de testes de autorização perfil x recurso, varredura de vulnerabilidades + inspeção do esquema do banco |
| Usabilidade | Agendamento concluído em ≤ 2 min e ≤ 4 telas, com taxa de sucesso ≥ 90% na primeira tentativa e SUS ≥ 80 | Teste de usabilidade moderado com 12 tutores reais (metade com mais de 50 anos), medindo tempo, telas e erros; aplicar o questionário SUS ao final |
| Rastreabilidade | 100% das leituras e alterações de prontuário geram log com usuário, data/hora, IP e valor anterior | Executar 20 operações e conferir 20 registros correspondentes no log de auditoria |

Teste de carga com banco vazio sempre passa, então o volume de dados usado na verificação
precisa ser realista.

## 5. Validação dos requisitos

Validação responde "construímos a coisa certa?", e não "construímos certo?".

- **Revisão formal dos requisitos (walkthrough com inspeção)**: uma sessão por perfil, com
  moderador e escriba. O tutor percorre os requisitos de agendamento, a recepção percorre
  agenda e cancelamento, o veterinário percorre histórico e registro. Serve para detectar
  omissões (quem confirma o lembrete enviado?), ambiguidades ("cancelar" exclui o registro
  ou só libera o horário?) e divergências de expectativa, como a recepção querer reagendar
  sem avisar o tutor.
- **Prototipação navegável**: o tutor simula marcar uma consulta e o veterinário simula
  registrar um atendimento em um protótipo das telas. É a forma mais barata de descobrir
  que o requisito estava escrito corretamente mas o fluxo estava errado — caso clássico do
  formulário de 12 campos que o veterinário precisa preencher durante a consulta, com uma
  mão só.

## 6. Desafio — priorização da primeira versão

| Funcionalidade | Necessidade atendida | Quem é beneficiado | Por que deve estar na v1 | Risco de adiar |
|---|---|---|---|---|
| Cadastro unificado de tutor e animal (RF01) | Acabar com fichas e arquivos separados | Recepção, veterinários, gerência | É pré-requisito técnico de todas as outras funcionalidades | Migração posterior com dados duplicados e históricos impossíveis de conciliar |
| Agendamento pelo app (RF02) | Tirar a recepção do telefone | Tutores e recepção | É a dor declarada no enunciado e o principal valor percebido | A clínica continua refém do horário comercial e a adoção perde justificativa |
| Histórico consolidado do animal (RF03) | Ver em segundos consultas, vacinas, medicamentos e alergias | Veterinários e os animais | É o segundo problema do cenário e o que sustenta a qualidade clínica | Risco clínico real em casos de alergia e dose |
| Registro de atendimento (RF04) | Produzir o histórico que hoje não existe | Veterinários e gerência | Sem registro não há histórico; é par indissociável do RF03 | O sistema vira só uma agenda e perde a razão de centralizar informação |
| Gestão de agenda pela recepção (RF05) | Evitar conflito de horário e controlar confirmações | Recepção e tutores | Sem ela o agendamento do app não tem para onde ir | Dobra o trabalho: agenda digital e agenda de papel convivendo |

As demais funcionalidades podem ser adiadas sem impedir a operação. Sem lembretes
automáticos, a recepção liga a partir de um relatório de próximas doses — perde-se
cobertura vacinal e aumenta o número de faltas, mas não se para de atender. Sem pagamento,
o caixa continua no balcão. Sem chat e sem fotos, o tutor mantém o WhatsApp que já usa hoje.

Se o proprietário preferir trocar o relatório de atendimentos por lembretes automáticos, a
decisão é defensável, desde que registrada em ata: lembrete reduz falta, que é impacto
financeiro direto, e o relatório pode ser substituído por consulta ao banco por dois meses.
O que não se sustenta é marcar seis ou sete itens como Must — quando tudo é indispensável, o
MoSCoW deixou de ser usado.