# Atividade 1 — Engenharia de Requisitos

**Aluna:** Karla Geovana Gomes Trajano

---

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

O Conecta Campus quer resolver o problema de os serviços acadêmicos estarem espalhados e de o sistema atual ser lento e difícil de usar. O principal objetivo é reunir tudo em um só sistema, rápido, fácil de usar e acessível só para usuários logados.

### 2. Elicitação

**Stakeholders:** alunos, professores, coordenação, universidade e equipe de desenvolvimento.

**Técnicas:**

- **Entrevista:** conversar com alunos, professores e coordenação para saber o que usam, o que atrapalha no sistema atual e o que não pode faltar.
- **Questionário:** enviar um formulário para vários alunos perguntando qual função mais usam e o que mais incomoda hoje.

### 3. Análise e modelagem

**Requisitos funcionais**

- **RF01:** O sistema deve exigir login para acessar as informações acadêmicas.
- **RF02:** O aluno deve poder consultar suas notas.
- **RF03:** O aluno deve poder consultar seus horários.
- **RF04:** O professor deve poder publicar materiais e comunicados.
- **RF05:** A coordenação deve poder divulgar eventos e informações acadêmicas.
- **RF06:** O aluno deve receber avisos no sistema.

**Requisitos não funcionais**

- **RNF01 (Desempenho):** as telas de consulta devem abrir em poucos segundos.
- **RNF02 (Segurança):** só usuários logados acessam as informações acadêmicas e as senhas ficam criptografadas.
- **RNF03 (Usabilidade):** um aluno novo deve ver suas notas em até 3 cliques, sem nunca ter acessado o sistema.

### 4. Negociação (MoSCoW)

- **Must have:** RF01, RF02, RF03, RF04 e RF06.
- **Should have:** RF05 (eventos da coordenação).
- **Could have:** notificações no celular ou por e-mail.
- **Won't have:** chat entre alunos e professores.

**Justificativa:** os Must resolvem o problema principal e atendem à exigência de login. Os eventos são importantes, mas o sistema funciona sem eles na primeira versão. O chat fica de fora porque pode atrasar a entrega, e os professores ainda podem usar os comunicados.

### 5. Especificação

- **RNF01 (Rápido):** as consultas de notas, horários e avisos devem abrir em até 3 segundos, mesmo com muitos usuários ao mesmo tempo.
  **Teste:** abrir essas telas com vários usuários conectados e cronometrar o tempo.
- **RNF02 (Seguro):** nenhuma informação acadêmica pode ser acessada sem login, e a conta deve ser bloqueada depois de 5 senhas erradas.
  **Teste:** tentar abrir as páginas sem estar logado e errar a senha 5 vezes para ver se bloqueia.
- **RNF03 (Fácil de usar):** o aluno deve conseguir ver suas notas em até 3 cliques, sem pedir ajuda.
  **Teste:** pedir para alguns alunos consultarem as notas e contar os cliques.

### 6. Validação

- **Revisão com os stakeholders:** reunião para ler os requisitos com alunos, professores e coordenação e confirmar se estão certos ou se falta algo.
- **Protótipo:** desenhar as telas principais e deixar os usuários testarem para apontar problemas antes de começar a programar.

---

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders

- **Tutores:** marcar consultas pelo celular e receber lembretes de vacinação.
- **Veterinários:** consultar o histórico do animal e registrar diagnósticos, tratamentos e medicamentos.
- **Recepção:** controlar horários e confirmar ou cancelar consultas.
- **Gerência:** ver relatórios de atendimentos.
- **Proprietário:** sistema rápido, seguro e fácil de usar, em 4 meses.

**Técnicas:**

- **Entrevistas** com veterinários, recepção, gerência e proprietário, porque cada um tem uma necessidade diferente.
- **Observação** da recepção (telefone e WhatsApp) e dos veterinários procurando fichas, para ver os problemas reais do dia a dia.
- **Questionário com tutores**, porque são muitos para entrevistar um por um.

### 2. Análise e especificação de requisitos

**Requisitos funcionais**

- **RF01:** O tutor deve poder agendar consulta pelo app escolhendo entre os horários disponíveis.
- **RF02:** O sistema deve enviar lembrete de vacinação ao tutor antes da data.
- **RF03:** O veterinário deve poder consultar o histórico do animal.
- **RF04:** O veterinário deve poder registrar diagnóstico, tratamento e medicamentos.
- **RF05:** A recepção deve poder ver os horários e confirmar ou cancelar consultas.
- **RF06:** A gerência deve poder gerar relatório de atendimentos por período.

**Requisitos não funcionais**

- **RNF01 (Desempenho):** as telas principais devem carregar em até 3 segundos com 50 usuários ao mesmo tempo.
- **RNF02 (Segurança):** os dados só são acessados após login e as senhas ficam criptografadas.
- **RNF03 (Usabilidade):** o tutor deve conseguir agendar uma consulta em até 4 minutos, sem ajuda.

### 3. Negociação com MoSCoW

- **Must have:** RF01, RF03, RF04 e RF05.
- **Should have:** RF02 (lembretes) e RF06 (relatórios).
- **Could have:** fotos dos animais.
- **Won't have:** pagamento pelo app e chat com o veterinário.

**Justificativa:** os Must resolvem os problemas atuais da clínica como agendamento por telefone e WhatsApp e histórico em fichas.

- **Pagamento (Won't):** exige integração e segurança extras e gastaria muito do prazo de 4 meses. Pode continuar sendo feito na clínica.
- **Chat (Won't):** precisa de resposta em tempo real e as conversas ficariam fora do histórico. O WhatsApp consegue cobrir por enquanto.
- **Fotos (Could):** é simples, mas não resolve nenhum problema principal.

### 4. Especificação de requisitos não funcionais

- **RNF01 (Rápido):** as telas principais devem abrir em até 3 segundos, mesmo com 50 usuários ao mesmo tempo.
  **Verificação:** abrir as telas com vários usuários conectados e cronometrar o tempo.
- **RNF02 (Seguro):** todo acesso exige login, as senhas ficam criptografadas e um tutor não pode ver os dados de outro.
  **Verificação:** tentar acessar sem login, tentar ver dados de outro tutor usando a conta de um tutor e conferir se as senhas estão criptografadas no banco.
- **RNF03 (Fácil de usar):** o tutor deve conseguir agendar uma consulta em até 4 minutos, sem ajuda.
  **Verificação:** pedir para alguns tutores agendarem uma consulta e cronometrar.

### 5. Validação dos requisitos

- **Protótipo das telas:** os stakeholders testam telas simples de agendamento, histórico e agenda da recepção. Ajuda a achar erros e coisas que faltam.
- **Revisão dos requisitos:** reunião para ler a lista com proprietário, veterinários, recepção e gerência e confirmar se representa o que pediram. Ajuda a achar divergências, como o proprietário esperar pagamento no app.

### 6. Desafio — Priorização da primeira versão

1. **Agendamento pelo app (RF01):** acaba com o agendamento por telefone e WhatsApp. Beneficia tutores e recepção e é o principal problema da clínica.
2. **Controle de horários pela recepção (RF05):** organiza a agenda e evita horários duplicados. Beneficia recepção e tutores. Sem ela o agendamento não funciona.
3. **Consulta ao histórico (RF03):** acaba com as fichas separadas. Beneficia veterinários e animais.
4. **Registro de atendimento (RF04):** guarda diagnóstico, tratamento e medicamentos num lugar só. Beneficia veterinários e a clínica. Sem registrar, o histórico fica vazio.
5. **Lembretes de vacinação (RF02):** evita que o tutor esqueça a vacina. Beneficia tutores e a clínica, com menos faltas. É uma necessidade direta dos tutores e simples de fazer.

**Riscos de adiar o resto:**

- **Relatórios:** a gerência conta manualmente por um tempo, risco baixo porque os dados já ficam salvos.
- **Pagamento:** continua sendo feito na clínica, risco baixo.
- **Chat:** continua no WhatsApp, risco baixo.
- **Fotos:** praticamente nenhum risco.
