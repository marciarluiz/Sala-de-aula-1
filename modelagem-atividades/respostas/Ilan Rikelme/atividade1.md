# Atividade 1 — Engenharia de Requisitos

---

# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

Hoje os serviços acadêmicos da universidade estão espalhados e o sistema atual é lento e difícil de usar. Na prática, o aluno perde tempo só para ver uma nota ou um horário, o professor não tem um jeito simples de passar materiais e avisos, e a secretaria não tem um canal bom para divulgar eventos.

O Conecta Campus quer resolver isso reunindo tudo em um único sistema. O objetivo principal é oferecer uma plataforma rápida, fácil de usar e segura, onde alunos, professores e secretaria consigam consultar e publicar informações acadêmicas, e onde só quem está autenticado tenha acesso a esses dados.

## 2. Elicitação

### Stakeholders

- **Alunos:** querem consultar notas e horários, receber avisos e usar um sistema que não trave.
- **Professores:** querem publicar materiais e comunicados. Alguns também querem um chat com os alunos.
- **Secretaria/coordenação:** quer divulgar eventos e informações acadêmicas. (No enunciado aparece "Aprofunde-se", que parece um erro de digitação; entendi que se refere a esse setor.)
- **Direção da universidade:** quer centralizar os serviços e garantir que os dados só sejam vistos por usuários autenticados.
- **Equipe de TI da universidade:** vai integrar, hospedar e dar suporte ao sistema.
- **Equipe de desenvolvimento:** precisa entregar uma primeira versão no prazo, e por isso se preocupa com o chat.

### Técnicas de elicitação

**Entrevistas:** conversaríamos com alguns alunos de cursos e semestres diferentes, com professores e com o pessoal da secretaria, usando um roteiro de perguntas. Com os alunos o foco seria entender o que exatamente deixa o sistema atual lento e confuso. Com os professores, como eles publicam materiais hoje e se o chat é mesmo uma necessidade ou só uma vontade de alguns.

**Questionário online:** como são muitos usuários, mandaríamos um formulário curto para alunos e professores perguntando quais funções eles mais usam e o que mais incomoda hoje. Assim a gente consegue números para apoiar as decisões, e não só a opinião de quem foi entrevistado.

**Observação do sistema atual:** também valeria observar pessoas usando o sistema que já existe, para ver onde elas travam, quantos cliques gastam e que erros cometem. Muita coisa que o usuário não sabe explicar aparece quando a gente só olha ele usando.

## 3. Análise e modelagem

### Requisitos funcionais

- **RF01:** o sistema deve permitir que alunos, professores e secretaria façam login com suas credenciais institucionais.
- **RF02:** o aluno deve poder consultar suas notas por disciplina e por período.
- **RF03:** o aluno deve poder consultar seu horário de aulas.
- **RF04:** o sistema deve enviar avisos aos alunos e permitir que eles consultem os avisos recebidos.
- **RF05:** o professor deve poder publicar materiais (arquivos e links) nas suas disciplinas.
- **RF06:** o professor deve poder publicar comunicados para as suas turmas.
- **RF07:** a secretaria deve poder publicar eventos e informações acadêmicas.

### Requisitos não funcionais

- **RNF01 (desempenho):** as telas de consulta (notas, horários e avisos) devem carregar em até 3 segundos em 95% das vezes, mesmo com 1.000 usuários ao mesmo tempo.
- **RNF02 (segurança):** nenhuma informação acadêmica pode ser acessada sem autenticação. A comunicação deve usar HTTPS e a sessão deve expirar após 30 minutos sem uso.
- **RNF03 (usabilidade):** um aluno novo deve conseguir ver suas notas em no máximo 3 cliques depois do login, sem precisar de treinamento.

## 4. Negociação (MoSCoW)

**Must (indispensável):** RF01 (login), RF02 (notas), RF03 (horários), RF04 (avisos), além dos requisitos de segurança (RNF02) e desempenho (RNF01).

**Should (deveria ter):** RF05 (materiais), RF06 (comunicados), RF07 (eventos) e a usabilidade (RNF03).

**Could (poderia ter):** notificações também por e-mail ou push, e melhorias de compatibilidade com navegadores mais antigos.

**Won't (não terá agora):** o chat entre alunos e professores.

**Justificativa:** colocamos como *Must* o que atende o que os alunos mais pedem (notas, horários e avisos) e o que a universidade exigiu (acesso só para autenticados). Sem isso o sistema não faz sentido. O desempenho também entrou aí porque a lentidão é a principal reclamação do sistema atual.

Materiais, comunicados e eventos são importantes, mas o sistema já entrega valor para os alunos sem eles, então ficam como *Should* e podem vir logo depois do núcleo.

O chat ficou de fora porque só alguns professores pediram, ele é complexo (mensagens em tempo real, privacidade, moderação, armazenamento) e a própria equipe acha que atrasaria a primeira versão. Enquanto isso, os comunicados (RF06) já cobrem boa parte da comunicação entre professor e turma. O chat pode ser reavaliado numa versão futura.

## 5. Especificação

A frase "o aplicativo deve ser rápido, seguro e fácil de usar" não dá para testar do jeito que está. Transformei cada parte em um requisito com número e forma de verificar:

**RNF01 — Rápido:** as telas de notas, horários e avisos devem ser exibidas em até 3 segundos em 95% das requisições, com 1.000 usuários simultâneos.
*Como testar:* teste de carga (por exemplo, com JMeter ou k6) simulando 1.000 usuários e medindo o tempo de resposta.

**RNF02 — Seguro:** 100% das páginas com dados acadêmicos devem exigir login, o tráfego deve ser criptografado (HTTPS/TLS), as senhas devem ser guardadas com hash e a sessão deve expirar após 30 minutos de inatividade.
*Como testar:* tentar acessar as páginas sem estar logado (deve ser bloqueado), rodar uma varredura de vulnerabilidades (como o OWASP ZAP) e conferir o tempo de expiração da sessão.

**RNF03 — Fácil de usar:** pelo menos 90% de um grupo de 10 usuários novos deve conseguir consultar suas notas em até 3 cliques e 60 segundos, sem ajuda.
*Como testar:* teste de usabilidade com usuários reais, cronometrando a tarefa e aplicando o questionário SUS (meta: nota 75 ou mais).

## 6. Validação

**Protótipos com os usuários:** antes de programar, faríamos protótipos das telas principais (login, notas, horários e avisos) e pediríamos para alunos e professores realizarem tarefas simples neles. Ouvindo o que eles estranham, descobrimos cedo o que está errado ou faltando, e repetimos o processo até os ajustes ficarem bons.

**Revisão dos requisitos com os stakeholders:** reuniríamos representantes de alunos, professores, secretaria e TI e leríamos os requisitos um por um. Cada pessoa confirma se aquilo realmente representa o que ela precisa, aponta dúvidas ou conflitos, e tudo o que for decidido fica registrado.

**Versão piloto, aos poucos:** a cada etapa liberaríamos uma versão funcional para um grupo pequeno (por exemplo, uma turma e alguns professores). Com o feedback deles, vemos se os requisitos estão certos antes de abrir para toda a universidade.

---
---

# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

### Stakeholders e necessidades

- **Tutores:** querem marcar consultas pelo celular e receber lembretes de vacinação.
- **Veterinários:** precisam consultar o histórico do animal e registrar diagnósticos, tratamentos e medicamentos sem perder tempo com fichas de papel.
- **Recepção:** precisa controlar os horários disponíveis e confirmar ou cancelar consultas sem depender só de telefone e WhatsApp.
- **Gerência:** quer relatórios com a quantidade de atendimentos.
- **Proprietário da clínica:** quer um sistema rápido, seguro e muito fácil de usar, pronto em quatro meses.
- **Equipe de desenvolvimento:** precisa de um escopo possível de cumprir no prazo.

### Técnicas de elicitação

**Entrevistas com cada grupo:** conversaríamos separadamente com tutores, veterinários, recepcionistas e gerência. Cada um enxerga o sistema de um jeito, e às vezes as necessidades se chocam (o veterinário quer registrar muitos detalhes, a recepção quer rapidez). A entrevista permite aprofundar essas diferenças. Escolhemos essa técnica porque o grupo é pequeno e fácil de acessar.

**Observação do dia a dia da clínica:** acompanharíamos a recepção atendendo ligações e mensagens e os veterinários procurando fichas. O problema acontece na prática, e muitos detalhes não aparecem em entrevista porque as pessoas já acham normal trabalhar daquele jeito.

**Análise das fichas e arquivos atuais:** olhar o que já é registrado hoje ajuda a definir quais dados o cadastro e o prontuário digital precisam ter.

## 2. Análise e concepção de requisitos

### Requisitos funcionais

- **RF01:** o sistema deve permitir o cadastro e o login de tutores, com o registro de seus animais (nome, espécie, raça e data de nascimento).
- **RF02:** o tutor deve poder agendar, remarcar e cancelar consultas pelo celular, escolhendo entre os horários disponíveis.
- **RF03:** o sistema deve enviar lembretes de vacinação ao tutor, com antecedência configurável (por exemplo, 7 dias antes).
- **RF04:** o veterinário deve poder consultar o histórico completo do animal (consultas, vacinas e medicamentos).
- **RF05:** o veterinário deve poder registrar diagnósticos, tratamentos e medicamentos em cada atendimento.
- **RF06:** a recepção deve poder ver a agenda, definir horários disponíveis e confirmar ou cancelar consultas.
- **RF07:** a gerência deve poder gerar relatórios com a quantidade de atendimentos por período.

### Requisitos não funcionais

- **RNF01 (desempenho):** o agendamento e a consulta ao histórico devem responder em até 2 segundos em 95% das requisições.
- **RNF02 (segurança):** os dados só podem ser acessados por usuários autenticados e conforme o perfil (tutor, veterinário, recepção, gerência), com tráfego criptografado.
- **RNF03 (usabilidade):** um tutor deve conseguir agendar uma consulta em até 5 passos e menos de 2 minutos, sem ajuda.

## 3. Negociação com MoSCoW

**Must:** RF01 (cadastro e login), RF02 (agendamento pelo celular), RF04 e RF05 (histórico e prontuário), RF06 (agenda da recepção), RF03 (lembretes de vacinação), além de desempenho, segurança e usabilidade.

**Should:** RF07 (relatórios da gerência).

**Could:** foto de perfil do animal, em versão simples.

**Won't (nesta versão):** pagamento pelo aplicativo e chat com o veterinário.

**Justificativa geral:** os *Must* resolvem as dores que a clínica tem hoje (agendamento por telefone e WhatsApp e histórico espalhado em fichas) e atendem os quatro grupos principais. Com quatro meses e recursos limitados, é melhor entregar isso bem feito do que tentar abraçar tudo.

**Pagamento pelo app:** exige integração com um meio de pagamento, cuidados extras de segurança, conciliação financeira e questões fiscais. É muito esforço e risco para o prazo, e não resolve as dores principais. Os pagamentos continuam como são hoje, na clínica.

**Chat com o veterinário:** pede comunicação em tempo real, regras de horário de resposta e registro das conversas, e ainda sobrecarregaria os veterinários. O WhatsApp, que a clínica já usa, pode continuar cobrindo isso por enquanto.

**Fotos dos animais:** é um recurso de engajamento, não de atendimento. Também exige armazenamento e regras de privacidade. Só entraria se sobrasse tempo, e numa versão simples, com uma foto de perfil por animal.

**Relatórios:** são úteis para a gerência, mas ela consegue trabalhar nos primeiros meses com contagens simples, e o sistema já estará guardando os dados. Por isso ficam como *Should*, para logo depois do núcleo.

## 4. Especificação de requisitos não funcionais

Transformando "o sistema deve ser rápido, seguro e muito fácil de usar" em requisitos que dá para medir:

**RNF01 — Rápido:** a lista de horários disponíveis e o histórico de um animal devem aparecer em até 2 segundos em 95% das requisições, com até 100 usuários simultâneos.
*Verificação:* teste de carga com 100 usuários virtuais, analisando os tempos de resposta.

**RNF02 — Seguro:** todo o tráfego deve usar HTTPS (TLS 1.2 ou superior), as senhas devem ser guardadas com hash, cada perfil só acessa o que lhe cabe (por exemplo, o tutor só vê os próprios animais) e a sessão deve expirar após 15 minutos de inatividade.
*Verificação:* testes de autorização (tentar abrir dados de outro tutor deve falhar), varredura de vulnerabilidades (como o OWASP ZAP) e revisão da configuração de TLS.

**RNF03 — Fácil de usar:** pelo menos 90% de um grupo de 8 tutores deve conseguir agendar uma consulta em até 5 passos e 2 minutos, sem ajuda.
*Verificação:* teste de usabilidade com tutores reais, cronometrando a tarefa e aplicando o questionário SUS (meta: 75 ou mais).

## 5. Validação dos requisitos

**Protótipo clicável testado com os usuários:** antes de começar a programar, faríamos protótipos das telas de agendamento (tutor), prontuário (veterinário) e agenda (recepção). Pediríamos a cada grupo que executasse tarefas do dia a dia. Assim aparecem *erros* (fluxos confusos), *omissões* (algo que as pessoas esperavam e não estava previsto, como vacinas aplicadas em outra clínica) e *divergências* (o que o proprietário imagina por "muito fácil de usar" pode ser diferente do que a recepção realmente precisa).

**Reunião de revisão dos requisitos:** apresentaríamos a lista de requisitos e a classificação MoSCoW ao proprietário, ao veterinário, à recepção e à gerência, lendo item por item. Isso ajuda a achar ambiguidades (por exemplo, o que conta como "atendimento" no relatório) e a confirmar, de forma clara, que o que escrevemos é o que eles querem, antes de gastar tempo e dinheiro desenvolvendo.

**Critérios de aceitação ligados a cada necessidade:** cada requisito teria um critério de teste e estaria ligado à necessidade de algum stakeholder. Se um requisito não tiver origem ou não puder ser testado, a gente questiona se ele realmente deve existir.

## 6. Desafio — Priorização da primeira versão

Com orçamento para só cinco funcionalidades, escolhemos:

### 1) Cadastro e login de tutores e animais
- **Necessidade:** identificar quem é o tutor e quem é o animal, e garantir a segurança dos dados.
- **Beneficiados:** todos.
- **Por que na primeira versão:** sem isso, nenhuma outra funcionalidade funciona.

### 2) Agendamento de consultas pelo celular
- **Necessidade:** os tutores querem marcar consulta sem telefone ou WhatsApp.
- **Beneficiados:** tutores, que ganham autonomia, e a recepção, que recebe menos ligações.
- **Por que na primeira versão:** é a principal dor do processo atual e o ganho mais visível para o cliente.

### 3) Gestão da agenda pela recepção
- **Necessidade:** controlar horários disponíveis e confirmar ou cancelar consultas.
- **Beneficiados:** a recepção, e também tutores e veterinários.
- **Por que na primeira versão:** o agendamento do tutor precisa de um lado administrativo, senão surgem conflitos de horário.

### 4) Histórico e prontuário do animal
- **Necessidade:** ver rapidamente consultas, vacinas e medicamentos anteriores e registrar novos diagnósticos e tratamentos.
- **Beneficiados:** veterinários e, principalmente, os animais, que recebem um atendimento mais seguro.
- **Por que na primeira versão:** substitui as fichas espalhadas e é o coração do trabalho de uma clínica. Quanto antes começar a digitalizar, menos papel se acumula.

### 5) Lembretes de vacinação
- **Necessidade:** os tutores querem ser avisados das vacinas.
- **Beneficiados:** tutores, animais e a própria clínica, que tende a ter mais retornos.
- **Por que na primeira versão:** é relativamente simples de fazer, usa dados que já estarão no prontuário e traz valor claro para o tutor.

### Riscos de adiar as outras funcionalidades

- **Relatórios:** a gerência continuará sem uma visão consolidada e terá de contar atendimentos manualmente por um tempo. Dá para reduzir o problema prevendo uma exportação básica dos dados e deixando os relatórios como primeira entrega da versão seguinte.
- **Pagamento pelo app:** os tutores continuam pagando na clínica, e quem espera conveniência total pode ficar frustrado. O risco é baixo, e a ideia pode ser retomada depois de ver como o app é usado.
- **Chat com o veterinário:** a conversa continua no WhatsApp, sem registro no sistema. Antes de investir nisso, vale medir se existe demanda real.
- **Fotos dos animais:** o risco é só um app menos "bonitinho" e com menos engajamento. Não afeta o atendimento e pode vir depois.

**Em resumo:** a primeira versão resolve as dores operacionais centrais (agendar, organizar a agenda, guardar o histórico e lembrar das vacinas) com segurança e facilidade de uso, e deixa para depois o que é mais caro e menos essencial para o funcionamento da clínica.
