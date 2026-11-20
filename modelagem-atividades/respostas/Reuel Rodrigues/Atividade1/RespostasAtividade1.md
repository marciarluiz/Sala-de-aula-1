# Atividade 1 — Engenharia de Requisitos

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

O Conecta Campus quer resolver o problema de o sistema da universidade ser lento e difícil de usar, com os serviços acadêmicos espalhados. O objetivo principal é reunir tudo em um só lugar, de forma rápida, fácil e segura, para que alunos, professores e coordenação acessem informações e se comuniquem.

### 2. Elicitação

Os principais stakeholders são os alunos, os professores, a coordenação, a universidade e a equipe de desenvolvimento.

Técnicas que poderiam ser usadas:

- Entrevistas: conversar com alunos, professores e coordenação para saber o que mais usam e quais problemas têm no sistema atual.
- Questionários: aplicar perguntas simples para muitos alunos e professores, para descobrir quais funcionalidades são mais importantes e o que incomoda.

### 3. Análise e modelagem

Requisitos funcionais:

- RF01: O sistema deve permitir que o aluno consulte suas notas.
- RF02: O sistema deve permitir que o aluno consulte seus horários.
- RF03: O sistema deve enviar avisos aos alunos.
- RF04: O sistema deve permitir que professores publiquem materiais e comunicados.
- RF05: O sistema deve permitir que a coordenação divulgue eventos e informações acadêmicas.
- RF06: O sistema deve exigir login para acessar as informações acadêmicas.

Requisitos não funcionais:

- RNF01: O sistema deve ser rápido, carregando as consultas em até 3 segundos.
- RNF02: As informações acadêmicas devem ser acessadas somente por usuários autenticados.
- RNF03: O sistema deve ser fácil de usar, sem precisar de treinamento.

### 4. Negociação (MoSCoW)

- Must have: RF01, RF02, RF03, RF04, RF06 e RNF02. São o que os alunos e professores mais precisam, e a autenticação é exigência da universidade.
- Should have: RF05, RNF01 e RNF03. São importantes, mas a primeira versão ainda funcionaria sem a divulgação de eventos, e a melhoria de velocidade e facilidade pode ser refinada.
- Could have: busca e filtros de materiais. Seria bom, mas não é essencial.
- Won't have: chat entre alunos e professores. A equipe acredita que pode atrasar a primeira versão e só alguns professores pediram, então fica para uma versão futura.

### 5. Especificação

A frase "O aplicativo deve ser rápido, seguro e fácil de usar" pode virar:

- RNF01 (rápido): as telas de notas e horários devem carregar em até 3 segundos em 95% das vezes. Teste: teste de carga medindo o tempo de resposta.
- RNF02 (seguro): todo acesso a dados acadêmicos exige login, com senhas criptografadas e uso de HTTPS. Teste: tentar acessar as páginas sem login (deve ser negado) e verificar o HTTPS e as senhas.
- RNF03 (fácil de usar): 90% dos usuários de teste devem conseguir consultar suas notas em até 2 minutos, sem ajuda. Teste: teste de usabilidade com alunos, cronometrando a tarefa.

### 6. Validação

- Revisão com os stakeholders: mostrar a lista de requisitos para alunos, professores e coordenação e pedir que confirmem se está correta e completa, ajustando o que for preciso.
- Protótipos: mostrar protótipos das telas principais (notas, horários, avisos) para os usuários testarem e darem opinião antes de programar.

---

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders

Stakeholders e necessidades:

- Tutores: marcar consultas pelo celular e receber lembretes de vacinação.
- Veterinários: consultar o histórico do animal e registrar diagnósticos, tratamentos e medicamentos.
- Recepção: controlar os horários disponíveis e confirmar ou cancelar consultas.
- Gerência: ver relatórios da quantidade de atendimentos.
- Proprietário: um sistema rápido, seguro e fácil de usar, com a primeira versão em 4 meses.

Técnicas de elicitação:

- Entrevistas com veterinários, recepção, gerência e proprietário. Cada um tem uma rotina diferente, e a conversa ajuda a entender os detalhes de cada necessidade.
- Observação da recepção e dos veterinários no dia a dia. Assim dá para ver os problemas reais do processo atual (agendamento por telefone e WhatsApp, fichas separadas), que as pessoas às vezes esquecem de contar.

### 2. Análise e especificação de requisitos

Requisitos funcionais:

- RF01: O tutor deve poder agendar consultas pelo celular.
- RF02: O sistema deve enviar lembretes de vacinação aos tutores.
- RF03: O veterinário deve poder consultar o histórico do animal.
- RF04: O veterinário deve poder registrar diagnósticos, tratamentos e medicamentos.
- RF05: A recepção deve poder ver os horários disponíveis e confirmar ou cancelar consultas.
- RF06: O sistema deve gerar relatórios da quantidade de atendimentos para a gerência.

Requisitos não funcionais:

- RNF01: As telas devem responder em até 3 segundos.
- RNF02: O acesso deve exigir login, e cada perfil só pode ver os dados que lhe cabem.
- RNF03: O tutor deve conseguir agendar uma consulta sem ajuda em até 2 minutos.

### 3. Negociação com MoSCoW

- Must have: agendamento pelo celular (RF01), agenda da recepção (RF05), histórico do animal (RF03), registro de atendimentos (RF04) e login com segurança (RNF02).
- Should have: lembretes de vacinação (RF02) e relatórios (RF06).
- Could have: exportar o histórico em PDF.
- Won't have: pagamento pelo aplicativo, chat com o veterinário e publicação de fotos.

Justificativas:

- Pagamento pelo aplicativo: precisa de integração com meios de pagamento e cuidados extras de segurança, o que gasta muito tempo e orçamento. O pagamento pode continuar sendo feito na clínica.
- Chat com o veterinário: precisa de comunicação em tempo real e de veterinários disponíveis para responder. Por enquanto o WhatsApp já resolve.
- Publicação de fotos: não é essencial para o atendimento e não resolve os problemas principais, que são o agendamento e o histórico.

### 4. Especificação de requisitos não funcionais

A frase "O sistema deve ser rápido, seguro e muito fácil de usar" pode virar:

- RNF01 (rápido): as telas de agendamento e histórico devem carregar em até 3 segundos em 95% das vezes. Verificação: teste de carga medindo o tempo de resposta.
- RNF02 (seguro): todo acesso exige login, e cada usuário só acessa os dados do seu perfil (o tutor vê apenas seus animais), com senhas criptografadas e HTTPS. Critério: nenhum acesso indevido nos testes. Verificação: testes de permissão por perfil e conferência do HTTPS.
- RNF03 (fácil de usar): 90% dos tutores de teste devem conseguir agendar uma consulta sem ajuda em até 2 minutos. Verificação: teste de usabilidade com tutores, cronometrando a tarefa.

### 5. Validação dos requisitos

- Revisão com os stakeholders: apresentar a lista de requisitos ao proprietário, veterinários, recepção, gerência e alguns tutores, para confirmar se tudo foi entendido direito. Isso ajuda a encontrar erros, itens que faltaram e diferenças entre o que cada um espera.
- Protótipos das telas: deixar os usuários testarem o agendamento, o histórico e a agenda da recepção em um protótipo. Assim os problemas e as omissões aparecem antes de começar a programar.

### 6. Desafio — Priorização da primeira versão

Escolhi estas cinco funcionalidades:

1. Agendamento de consultas pelo celular
   - Necessidade: marcar consultas sem precisar de telefone ou WhatsApp.
   - Beneficiados: tutores e recepção.
   - Por que na primeira versão: é o principal pedido dos tutores e resolve o agendamento manual.

2. Controle da agenda pela recepção (confirmar e cancelar)
   - Necessidade: controlar os horários e evitar conflitos.
   - Beneficiados: recepção, tutores e veterinários.
   - Por que na primeira versão: sem isso, o agendamento pelo celular causaria conflitos de horário.

3. Consulta ao histórico do animal
   - Necessidade: achar rápido as consultas, vacinas e medicamentos anteriores.
   - Beneficiados: veterinários e tutores.
   - Por que na primeira versão: resolve o problema das fichas separadas e melhora o atendimento.

4. Registro de diagnósticos, tratamentos e medicamentos
   - Necessidade: registrar cada atendimento de forma digital.
   - Beneficiados: veterinários.
   - Por que na primeira versão: alimenta o histórico, que ficaria vazio sem esse registro.

5. Login e controle de acesso
   - Necessidade: proteger os dados de tutores e animais.
   - Beneficiados: todos os usuários e a clínica.
   - Por que na primeira versão: o sistema guarda dados pessoais e médicos e não deve funcionar sem segurança.

Riscos de adiar as demais funcionalidades:

- Lembretes de vacinação: os tutores podem esquecer vacinas. Até a próxima versão, a recepção pode avisar manualmente.
- Relatórios: a gerência fica sem indicadores por um tempo, mas dá para tirar os dados manualmente.
- Pagamento, chat e fotos: o risco é baixo, pois o pagamento na clínica e o WhatsApp continuam funcionando.