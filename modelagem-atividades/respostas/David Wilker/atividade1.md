# Atividade 1 — Engenharia de Requisitos

**Aluno:** \[Seu Nome Aqui\]
**Data:** 30/10

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

**Problema:** A descentralização das informações acadêmicas, aliada a um sistema atual que é lento e difícil de usar, o que gera insatisfação na comunidade acadêmica e ineficiência na comunicação.
**Principal Objetivo:** Desenvolver uma plataforma centralizada (Conecta Campus) que unifique os serviços acadêmicos de forma ágil, segura e amigável, facilitando a rotina de alunos, professores e coordenação.

### 2. Elicitação

**Principais Stakeholders:**

* Alunos

* Professores

* Coordenação

* Equipe de TI/Reitoria (demandam a segurança e autenticação)

**Técnicas de Elicitação:**

1. **Questionários (Surveys):** Aplicados aos alunos. Como é um público muito grande, questionários online com perguntas fechadas e algumas abertas são ideais para levantar dados quantitativos sobre as maiores dificuldades com o sistema atual e priorizar as funcionalidades mais desejadas.

2. **Entrevistas Estruturadas:** Aplicadas com representantes dos professores e da coordenação. Permitem um aprofundamento maior para entender exatamente quais tipos de materiais, avisos e eventos eles precisam publicar e como é o fluxo dessa informação.

### 3. Análise e modelagem

**Requisitos Funcionais (RF):**

* **RF01:** O sistema deve permitir que os alunos consultem suas notas e faltas consolidadas por disciplina.

* **RF02:** O sistema deve exibir a grade de horários de aulas atualizada para os alunos.

* **RF03:** O sistema deve permitir que os professores façam o upload de materiais de apoio (PDFs, slides) em suas respectivas disciplinas.

* **RF04:** O sistema deve permitir que a coordenação publique comunicados e eventos em um mural de informações acadêmicas.

* **RF05:** O sistema deve possuir uma tela de login para validar a identidade (autenticação) dos usuários antes de liberar o acesso aos dados.

**Requisitos Não Funcionais (RNF):**

* **RNF01 (Desempenho):** O tempo de carregamento das consultas de notas e horários não deve ultrapassar 3 segundos.

* **RNF02 (Segurança):** O sistema deve criptografar as senhas dos usuários no banco de dados e utilizar o protocolo HTTPS para comunicação.

* **RNF03 (Usabilidade):** O sistema deve ser responsivo, adaptando-se automaticamente a telas de smartphones e computadores desktop.

### 4. Negociação (MoSCoW)

* **Must have (Indispensável):** Consulta de notas e horários (Alunos), Publicação de materiais (Professores), Autenticação de usuários (Universidade). *Justificativa:* Formam o núcleo do problema acadêmico diário e cumprem a exigência legal de segurança da instituição.

* **Should have (Importante):** Divulgação de eventos e avisos pela coordenação. *Justificativa:* Melhora muito a comunicação institucional, mas a ausência não impede o aluno de estudar ou o professor de dar aula na primeira versão.

* **Could have (Desejável):** Sistema de notificações push (alertas no celular) para novos materiais ou notas lançadas. *Justificativa:* Agrega valor à experiência do usuário, mas pode ser feito numa versão futura (V2).

* **Won't have (Não terá na versão atual):** Chat entre alunos e professores. *Justificativa:* Como apontado pela equipe técnica, essa funcionalidade é complexa, exige moderação, infraestrutura em tempo real e atrasaria o cronograma de entrega da primeira versão.

### 5. Especificação

Transformando "rápido, seguro e fácil de usar" em RNFs testáveis:

1. **RNF - Rapidez:** O aplicativo deve responder a qualquer requisição de navegação interna (como abrir a tela de notas) em até 3 segundos em uma conexão 4G padrão.

   * *Como testar:* Utilizar ferramentas de teste de carga (como Apache JMeter) simulando usuários simultâneos e medir o tempo médio de resposta do servidor.

2. **RNF - Segurança:** O sistema deve bloquear a conta do usuário por 15 minutos após 5 tentativas consecutivas de login com senha incorreta.

   * *Como testar:* Criar scripts de teste automatizado (ou testar manualmente) inserindo senhas erradas 5 vezes seguidas e verificar se o sistema impede o sexto login mesmo com a senha correta.

3. **RNF - Facilidade de Uso:** Um aluno deve ser capaz de encontrar sua nota final de uma disciplina em no máximo 3 cliques/toques a partir da tela inicial.

   * *Como testar:* Conduzir testes de usabilidade com um grupo de 10 alunos voluntários (que nunca usaram o sistema) e contar o número de cliques até completarem a tarefa.

### 6. Validação

Para confirmar se os requisitos estão corretos:

1. **Prototipação:** A equipe pode construir telas não funcionais (usando ferramentas como Figma) e apresentar aos alunos, professores e coordenação. Isso permite que eles vejam a "cara" do sistema e validem se os fluxos pensados atendem às suas necessidades reais antes da escrita do código.

2. **Revisão (Walkthrough):** Realizar uma reunião de apresentação do Documento de Requisitos. O analista lê os requisitos em linguagem natural com os representantes de cada grupo (ex: um coordenador, um professor, um representante do DCE) e coleta suas assinaturas ou aprovações formais garantindo que nada foi esquecido.

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders

**Stakeholders e Necessidades:**

* **Tutores (Clientes):** Precisam de conveniência para agendar consultas remotamente e de alertas para não esquecerem o calendário de vacinação de seus pets.

* **Veterinários:** Precisam de acesso ágil e unificado ao prontuário do animal para diagnósticos precisos e registro fácil de tratamentos, abandonando as fichas de papel.

* **Recepção:** Precisa otimizar seu tempo, abandonando o controle manual para gerir a agenda de forma centralizada e sem conflito de horários.

* **Gerência/Proprietário:** Necessita de controle estratégico através de relatórios, garantindo que o sistema fique pronto em 4 meses para modernizar a clínica.

**Técnicas de Elicitação:**

1. **Observação (Etnografia):** Passar um ou dois dias observando o fluxo de trabalho da recepção e dos veterinários. *Justificativa:* Como eles usam fichas físicas e telefones, observar o trabalho real revela gargalos ocultos que eles podem esquecer de mencionar numa entrevista.

2. **Entrevistas:** Realizadas com o proprietário e os veterinários. *Justificativa:* Necessário para alinhar expectativas de negócio, entender as regras de marcação de consulta e os dados exatos que precisam estar no prontuário.

### 2. Análise e especificação de requisitos

**Requisitos Funcionais (RF):**

* **RF01:** O sistema deve permitir que o tutor solicite o agendamento de uma consulta, escolhendo data e horário disponíveis na agenda.

* **RF02:** O sistema deve gerar e enviar um alerta automático (notificação ou e-mail) ao tutor 7 dias antes do vencimento da vacina do animal.

* **RF03:** O sistema deve prover uma interface para o veterinário registrar o diagnóstico, prescrição de medicamentos e notas clínicas na ficha digital do animal.

* **RF04:** O sistema deve permitir que o perfil "Recepção" aprove, reprove ou cancele as solicitações de agendamento feitas pelos tutores.

* **RF05:** O sistema deve gerar um relatório mensal contendo o número total de consultas realizadas, filtrável por veterinário.

**Requisitos Não Funcionais (RNF):**

* **RNF01:** O sistema deve garantir que o prontuário eletrônico esteja disponível 99,5% do tempo no horário comercial da clínica (8h às 18h).

* **RNF02:** O sistema deve realizar backup diário automático na nuvem de todo o banco de dados às 02h00 da manhã.

* **RNF03:** O acesso aos relatórios gerenciais e dados financeiros deve ser restrito exclusivamente aos usuários com perfil de "Gerência".

### 3. Negociação com MoSCoW

* **Must have:** Agendamento pelo app, Controle de agenda (recepção), Prontuário eletrônico (veterinários). *Justificativa:* São as funcionalidades vitais para resolver o problema central da clínica. Sem isso, o sistema não cumpre seu propósito básico.

* **Should have:** Lembretes de vacinação, Relatórios de gerência. *Justificativa:* Ajudam a reter clientes e gerir o negócio, mas o atendimento básico ainda funciona se isso atrasar algumas semanas.

* **Could have:** Publicação de fotos dos animais. *Justificativa:* É um diferencial para engajamento, mas totalmente dispensável frente ao curto prazo de 4 meses. Pode ser feito no futuro.

* **Won't have (Nesta versão):** Chat com o veterinário e Pagamentos pelo aplicativo. *Justificativa:* O chat exige alta disponibilidade do veterinário (que está em consulta) e infraestrutura em tempo real. Pagamentos exigem integrações com gateways externos (bancos/cartões), o que tem alto risco de estourar o prazo de 4 meses e aumenta requisitos de segurança.

### 4. Especificação de requisitos não funcionais

Transformando a frase do proprietário:

1. **"Rápido":** A pesquisa pelo nome do paciente/tutor no banco de dados para abrir um prontuário deve carregar os resultados em, no máximo, 1,5 segundos.

   * *Verificação:* Teste de desempenho no banco de dados simulando carga de pelo menos 5.000 registros para aferir o tempo de *query*.

2. **"Seguro":** O sistema deve implementar controle de acesso baseado em perfis (RBAC - Role Based Access Control), impedindo que tutores ou recepcionistas alterem um diagnóstico médico salvo.

   * *Verificação:* Testes de segurança logando com perfis inferiores (tutor/recepção) e tentando acessar/modificar rotas de API exclusivas de veterinários (teste de penetração básico).

3. **"Fácil de usar":** A equipe da recepção deve ser capaz de concluir a marcação de uma consulta telefônica no sistema em menos de 45 segundos.

   * *Verificação:* Teste prático de usabilidade (cronometrado) com a recepcionista após um treinamento introdutório de 15 minutos.

### 5. Validação dos requisitos

A equipe faria a validação utilizando:

1. **Cenários / Casos de Uso:** Criar histórias passo-a-passo (ex: "Tutor João agenda consulta para seu cão Bob, a recepção aprova e o Vet atende"). Ler esses cenários com os stakeholders garante que o fluxo pensado pela TI condiz com a realidade da clínica veterinária, evitando omissões no processo de negócio.

2. **Prototipação de Baixa Fidelidade (Wireframes):** Desenhar as telas principais em rascunho (papel ou software) e mostrar aos tutores e à recepção. Isso ajuda a identificar antecipadamente se a interface de agendamento é confusa, alinhando as expectativas antes do gasto de 4 meses em codificação.

### 6. Desafio — Priorização da primeira versão

Se apenas 5 funcionalidades podem ser feitas, a escolha estratégica para garantir o funcionamento da clínica seria:

1. **Cadastro centralizado de Tutores e Animais**

   * *Necessidade:* Base de dados única substituindo arquivos físicos.

   * *Beneficiado:* Toda a clínica (Recepção e Veterinários).

   * *Por que:* É a fundação do sistema. Não há agendamento ou prontuário sem um paciente cadastrado.

2. **Módulo de Agendamento (Tutor)**

   * *Necessidade:* Marcar consultas via celular.

   * *Beneficiado:* Tutores.

   * *Por que:* Resolve o gargalo do WhatsApp/Telefone e melhora a experiência do cliente, atraindo adesão ao aplicativo.

3. **Gestão de Agenda (Recepção)**

   * *Necessidade:* Aprovar/cancelar horários solicitados.

   * *Beneficiado:* Recepção.

   * *Por que:* Evita choque de horários e organiza o fluxo diário da clínica.

4. **Prontuário Eletrônico Básico (Veterinário)**

   * *Necessidade:* Consultar histórico e registrar diagnóstico.

   * *Beneficiado:* Veterinários e Animais.

   * *Por que:* Elimina o problema crítico das fichas de papel perdidas apontado no estudo, garantindo qualidade médica.

5. **Lembrete Automático de Vacinação**

   * *Necessidade:* Avisar os clientes sobre o retorno para vacinas.

   * *Beneficiado:* Tutores e Clínica (Proprietário).

   * *Por que:* Gera retorno financeiro direto e imediato para a clínica e previne doenças, tendo um alto impacto positivo logo na V1.

**Riscos de adiar as demais:** Relatórios podem ser temporariamente extraídos de forma manual (exportação de banco de dados pelo TI) pela gerência. Adiar pagamentos não paralisa a clínica, pois a máquina de cartão física atual continua funcionando normalmente. Fotos e chats são perfumarias que não afetam a operação principal neste primeiro momento.