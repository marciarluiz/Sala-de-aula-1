# Atividade 1 — Engenharia de Requisitos

**Aluno:** Jonatan Ferreira de Souza Brito

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

**Problema:** o problema que o Conecta Campus pretende resolver é: os serviços e as informações acadêmicas estão dispersos em diferentes meios, e o sistema atual apresenta lentidão e dificuldades de uso. Isso prejudica a consulta de notas e horários, a comunicação entre professores e alunos e a divulgação de informações institucionais.

**Objetivo principal:** desenvolver uma plataforma centralizada, acessível e segura para consultar informações acadêmicas, compartilhar materiais, enviar comunicados e divulgar eventos, melhorando a experiência dos usuários.

### 2. Elicitação

**Principais stakeholders:**

- **Alunos:** consultar notas e horários e receber avisos com praticidade.
- **Professores:** publicar materiais didáticos e comunicados para suas turmas.
- **Gestão/secretaria acadêmica:** divulgar eventos, manter informações atualizadas e garantir o funcionamento dos serviços.
- **Equipe de TI e desenvolvimento:** implementar, integrar, administrar e manter o sistema, considerando segurança, desempenho e prazo.

**Técnicas de elicitação:**

1. **Entrevistas semiestruturadas:** conversar com representantes de alunos, professores e gestão para compreender dificuldades do sistema atual, necessidades e expectativas. Por exemplo, perguntar quais informações são mais consultadas e onde ocorrem atrasos.
2. **Questionários:** aplicar perguntas a um número maior de alunos e professores para identificar quais funcionalidades são mais importantes e com que frequência seriam utilizadas.
3. **Observação de tarefas:** acompanhar usuários realizando consultas no sistema atual para identificar etapas confusas e pontos de lentidão não mencionados nas entrevistas.

### 3. Análise e modelagem

**Requisitos funcionais (RF):**

| ID | Requisito |
| --- | --- |
| RF01 | O sistema deve permitir que usuários cadastrados realizem autenticação com credenciais individuais. |
| RF02 | O sistema deve permitir que cada aluno consulte suas notas por disciplina e período letivo. |
| RF03 | O sistema deve permitir que cada aluno consulte seus horários de aula. |
| RF04 | O sistema deve permitir que professores publiquem materiais didáticos para suas turmas. |
| RF05 | O sistema deve permitir que professores e a gestão publiquem comunicados para os públicos autorizados. |
| RF06 | O sistema deve permitir que alunos visualizem avisos e eventos acadêmicos publicados. |

**Requisitos não funcionais (RNF):**

| ID | Requisito |
| --- | --- |
| RNF01 — Desempenho | Pelo menos 95% das consultas de notas e horários devem retornar em até 2 segundos, sob carga de 200 usuários simultâneos, no ambiente de testes definido. |
| RNF02 — Segurança | Todas as páginas e APIs com informações acadêmicas devem exigir autenticação válida e verificar as permissões do usuário; acessos não autorizados devem ser bloqueados. |
| RNF03 — Usabilidade | Pelo menos 90% dos participantes de um teste com alunos, sem treinamento prévio, devem localizar seus horários em até 3 minutos. |

Os valores dos RNFs são **metas iniciais propostas pela equipe**, a serem negociadas e validadas com a universidade.

### 4. Negociação — técnica MoSCoW

| Categoria | Funcionalidades | Justificativa |
| --- | --- | --- |
| **Must have (indispensável)** | Autenticação e controle de acesso; consulta de notas e horários; visualização de avisos; publicação de comunicados | Atendem às necessidades centrais e à exigência de acesso restrito às informações acadêmicas. |
| **Should have (deveria ter)** | Publicação de materiais didáticos; divulgação de eventos institucionais | São importantes para a centralização, mas a primeira entrega pode priorizar os serviços mais consultados. |
| **Could have (poderia ter)** | Notificações automáticas quando um aviso novo for publicado | Aumentam a conveniência, mas avisos podem ser consultados diretamente no sistema. |
| **Won't have for now (não terá nesta versão)** | Chat em tempo real entre alunos e professores | Exige funcionalidades adicionais de comunicação, moderação e manutenção e pode comprometer o prazo da primeira versão. |

A priorização deve ser confirmada em reunião com os envolvidos. Acessibilidade, desempenho e segurança não devem ser abandonados por não aparecerem como funcionalidades na tabela.

### 5. Especificação de requisitos não funcionais

| ID | Requisito mensurável | Como testar |
| --- | --- | --- |
| RNF01 — Rapidez | Ao executar 200 sessões simultâneas de consulta de notas e horários, ao menos 95% das respostas devem ocorrer em até 2 segundos. | Realizar teste de carga e verificar os tempos de resposta registrados. |
| RNF02 — Segurança | 100% das tentativas de acessar notas, horários e APIs acadêmicas sem autenticação válida devem ser rejeitadas; um aluno autenticado não pode consultar notas de outro aluno. | Executar testes de acesso sem login, com sessão expirada e com tentativa de acessar dados de outro usuário. |
| RNF03 — Facilidade de uso | Em teste com no mínimo 20 alunos representativos, pelo menos 90% devem conseguir localizar seu horário em até 3 minutos, sem ajuda. | Aplicar testes de usabilidade, cronometrar a tarefa e contabilizar a taxa de sucesso. |

Essas métricas operacionalizam os adjetivos “rápido”, “seguro” e “fácil de usar”, mas devem ser acordadas antes de virarem critérios oficiais de aceitação.

### 6. Validação

1. **Revisão dos requisitos com stakeholders:** apresentar a alunos, professores e gestão uma lista organizada de requisitos, fluxos e prioridades. Solicitar exemplos de uso e confirmar se há informações incorretas, requisitos ausentes ou conflitos de interpretação; registrar as correções aprovadas.
2. **Protótipo navegável e teste de usabilidade:** criar telas simples de consulta de notas e horários e de publicação de avisos. Pedir a participantes reais que executem tarefas e observar dificuldades, expectativas não atendidas e possíveis mudanças antes da implementação.
3. **Cenários e critérios de aceitação:** validar situações como “um aluno tenta consultar notas de outro” e “um professor publica material apenas para sua turma”, verificando com os envolvidos o resultado esperado em cada caso.

---

## Estudo de Caso 2 — PetCare

### 1. Elicitação e stakeholders

**Principais stakeholders e necessidades:**

| Stakeholder | Necessidades |
| --- | --- |
| Tutores dos animais | Agendar consultas pelo celular, acompanhar agendamentos e receber lembretes de vacinação. |
| Veterinários | Localizar rapidamente o histórico do animal e registrar diagnósticos, tratamentos e medicamentos. |
| Recepcionistas | Consultar horários disponíveis e confirmar ou cancelar consultas sem gerar conflitos de agenda. |
| Gerência/proprietário | Consultar relatórios de atendimentos, acompanhar a operação e respeitar o orçamento e o prazo de quatro meses. |
| Equipe de TI e suporte | Desenvolver, proteger e manter a aplicação e os registros de acordo com as regras de acesso. |

**Técnicas de elicitação:**

1. **Entrevistas semiestruturadas:** entrevistar tutores, veterinários, recepcionistas e gerência. Perguntar, por exemplo, quais dados são indispensáveis no prontuário e como a recepção lida com cancelamentos e encaixes.
2. **Observação do processo atual:** acompanhar a rotina de agendamentos por telefone/WhatsApp e a busca de fichas, identificando retrabalho, risco de horários duplicados e informações difíceis de localizar.
3. **Análise de documentos:** examinar modelos de fichas, registros de vacinação e relatórios usados pela clínica, sem expor dados pessoais desnecessários, para identificar campos obrigatórios e regras do processo.

### 2. Análise e concepção de requisitos

**Requisitos funcionais (RF):**

| ID | Requisito |
| --- | --- |
| RF01 | O sistema deve permitir cadastrar tutores e seus animais, associando cada animal a um tutor. |
| RF02 | O sistema deve permitir que tutores solicitem agendamentos pelo celular, escolhendo somente horários disponíveis. |
| RF03 | O sistema deve permitir que a recepção consulte a agenda e confirme ou cancele agendamentos, atualizando a disponibilidade dos horários. |
| RF04 | O sistema deve permitir que veterinários consultem o histórico clínico dos animais autorizados. |
| RF05 | O sistema deve permitir que veterinários registrem consultas, diagnósticos, tratamentos e medicamentos no histórico do animal. |
| RF06 | O sistema deve enviar lembretes de vacinação aos tutores que possuam vacina com data futura registrada e canal de contato habilitado. |
| RF07 | O sistema deve gerar relatório com a quantidade de atendimentos realizados em um período selecionado pela gerência. |
| RF08 | O sistema deve autenticar os usuários e aplicar permissões de acesso conforme o perfil (tutor, veterinário, recepção ou gerência). |

**Requisitos não funcionais (RNF):**

| ID | Requisito |
| --- | --- |
| RNF01 — Desempenho | Sob 100 usuários simultâneos no ambiente de testes, ao menos 95% das consultas à agenda devem responder em até 2 segundos. |
| RNF02 — Segurança | O sistema deve utilizar HTTPS e impedir que um tutor consulte históricos de animais não vinculados ao seu cadastro; o acesso clínico deve respeitar as permissões definidas. |
| RNF03 — Usabilidade | Pelo menos 90% de 20 tutores participantes devem concluir uma solicitação de agendamento pelo celular em até 4 minutos, sem ajuda. |

As metas numéricas são propostas para discussão e aprovação da clínica, não fatos já definidos pelo proprietário.

### 3. Negociação com MoSCoW

| Categoria | Funcionalidades | Justificativa |
| --- | --- | --- |
| **Must have** | Cadastro de tutores e animais; agendamento pelo celular; gestão de agenda e confirmações/cancelamentos; consulta do histórico clínico; registro de atendimentos; autenticação e permissões | Resolve os problemas operacionais mais críticos e protege as informações. O cadastro e o controle de acesso são bases necessárias às demais funções. |
| **Should have** | Lembretes de vacinação; relatório básico da quantidade de atendimentos | Atendem demandas relevantes, mas admitem soluções temporárias manuais se o prazo de quatro meses exigir redução de escopo. |
| **Could have** | Pagamento pelo aplicativo | Oferece conveniência, porém aumenta o esforço de integração, testes e segurança financeira; a clínica pode manter o pagamento presencial inicialmente. |
| **Won't have for now** | Chat com veterinário; área de fotos dos animais | O chat exige disponibilidade e regras de atendimento remoto; a área de fotos não resolve os gargalos de agendamento e prontuário. Ambos podem ser reavaliados em uma versão futura. |

### 4. Especificação de requisitos não funcionais

| ID | Requisito mensurável | Como verificar |
| --- | --- | --- |
| RNF01 — Rapidez | Com 100 usuários simultâneos, ao menos 95% das consultas de horários disponíveis devem responder em até 2 segundos. | Simular acessos concorrentes e examinar a distribuição de tempos de resposta. |
| RNF02 — Segurança | Todas as conexões que transmitam dados pessoais ou clínicos devem utilizar HTTPS; 100% das tentativas de acesso ao histórico de animal não autorizado devem ser bloqueadas nos cenários de teste. | Inspecionar a configuração HTTPS e executar testes automatizados de autorização com diferentes perfis. |
| RNF03 — Usabilidade | Em um teste com pelo menos 20 tutores, no mínimo 90% devem solicitar uma consulta pelo celular em até 4 minutos e sem intervenção do avaliador. | Aplicar tarefas em protótipo ou versão de testes, registrar duração, erros e conclusão. |

Os limites e volumes escolhidos devem ser revisados com a clínica para refletir seu uso esperado.

### 5. Validação dos requisitos

1. **Reuniões de revisão e inspeção:** apresentar à recepção, aos veterinários, aos tutores representantes e à gerência os requisitos, regras de agenda e exemplos de histórico. Conferir se termos como “agendar”, “confirmar” e “cancelar” significam a mesma coisa para todos. Registrar divergências e aprovar ajustes.
2. **Protótipos e testes com usuários:** disponibilizar um protótipo das telas de agendamento, agenda da recepção e prontuário. Solicitar que participantes executem tarefas reais simuladas e identificar campos ausentes, etapas confusas e fluxos que não correspondem à rotina.
3. **Validação de cenários de aceitação:** discutir casos como tentativa de reservar horário já ocupado, cancelamento de consulta confirmada e tentativa de acesso a histórico sem permissão. Definir resultados esperados para evitar ambiguidades antes do desenvolvimento.

### 6. Desafio — Priorização da primeira versão

Considerando **somente cinco funcionalidades de negócio**, a equipe escolheria as seguintes. **Cadastro básico, autenticação e controle de acesso** são tratados como componentes técnicos obrigatórios que dão suporte a elas; devem constar do esforço e orçamento, e não podem ser omitidos.

| Prioridade | Funcionalidade | Necessidade atendida | Beneficiados | Por que incluir na primeira versão |
| --- | --- | --- | --- | --- |
| 1 | **Solicitar agendamento pelo celular (RF02)** | Evitar dependência exclusiva de telefone e WhatsApp para marcar consultas. | Tutores e recepção | É um dos problemas centrais que motivaram o sistema. |
| 2 | **Gerenciar horários, confirmações e cancelamentos (RF03)** | Manter agenda atualizada e prevenir conflitos de horários. | Recepção, tutores e veterinários | Sem essa gestão, o agendamento on-line pode provocar sobreposição de consultas. |
| 3 | **Consultar histórico clínico (RF04)** | Encontrar rapidamente informações anteriores do animal. | Veterinários e animais atendidos | Reduz a dependência de fichas dispersas durante as consultas. |
| 4 | **Registrar atendimentos, diagnósticos, tratamentos e medicamentos (RF05)** | Manter o histórico clínico atualizado e centralizado. | Veterinários e tutores, indiretamente | Sem novos registros, o histórico digital fica incompleto e perde utilidade. |
| 5 | **Enviar lembretes de vacinação (RF06)** | Ajudar tutores a acompanhar datas de vacinação. | Tutores e recepção | Atende necessidade explicitamente mencionada e reduz o acompanhamento manual. |

**Riscos de adiar as demais funcionalidades:**

- **Relatórios (RF07):** a gerência continuará consolidando números manualmente por algum tempo; a equipe deve registrar os dados de atendimentos desde o início para permitir relatórios futuros.
- **Pagamento pelo aplicativo:** o pagamento seguirá por meios atuais, com menor conveniência, mas sem o custo inicial de integração financeira.
- **Chat com veterinário:** a comunicação continuará por canais existentes; é importante informar os canais e horários oficiais para não criar expectativa de resposta instantânea.
- **Publicação de fotos:** há perda de uma função de engajamento, mas pouco impacto nos processos prioritários da clínica.

**Observação sobre o escopo:** se a restrição do proprietário considerar cadastro e autenticação como funcionalidades separadas dentro do limite absoluto de cinco, será necessário renegociar o escopo. Nesse cenário, os lembretes de vacinação seriam adiados para manter cadastro, acesso seguro, agendamento, gestão da agenda e prontuário básico (consulta e registro como um único módulo). Esta alternativa precisa ser aprovada pelo proprietário antes do desenvolvimento.
