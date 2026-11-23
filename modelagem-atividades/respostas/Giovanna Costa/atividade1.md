# Atividade 1 — Engenharia de Requisitos

# Estudo de Caso 1 — Conecta Campus

## 1. Concepção

O Conecta Campus pretende resolver as dificuldades de acesso às informações acadêmicas e a falta de integração dos serviços da universidade. Seu objetivo é reunir notas, horários, avisos e materiais em uma única plataforma, facilitando a comunicação e o acesso dos usuários.

## 2. Elicitação

**Principais stakeholders:**
- Alunos: consultar notas, horários e avisos.
- Professores: publicar materiais e comunicados.
- Coordenação: divulgar eventos e informações.
- Universidade: garantir a segurança das informações.
- Equipe de desenvolvimento: construir o sistema.

**Técnicas utilizadas:**

- Entrevistas: conversar com os usuários para conhecer suas dificuldades e necessidades.
- Questionários: coletar opiniões de vários alunos e professores sobre as funcionalidades desejadas.

## 3. Análise e modelagem

**Requisitos funcionais (RF):**

- RF01: Permitir que alunos consultem suas notas.
- RF02: Permitir a consulta dos horários das aulas.
- RF03: Permitir que alunos recebam avisos acadêmicos.
- RF04: Permitir que professores publiquem materiais.
- RF05: Permitir que a coordenação divulgue eventos.

**Requisitos não funcionais (RNF):**

- RNF01: As páginas principais devem carregar em até 3 segundos.
- RNF02: O acesso às informações acadêmicas deve exigir autenticação.
- RNF03: As principais funcionalidades devem ser encontradas em até três etapas de navegação.

## 4. Negociação — MoSCoW

- **Must have:** consulta de notas, horários e autenticação, pois são essenciais.
- **Should have:** publicação de materiais e comunicados, pois facilitam as atividades acadêmicas.
- **Could have:** divulgação de eventos, pois é útil, mas não essencial.
- **Won't have:** chat entre alunos e professores, pois pode aumentar o prazo de desenvolvimento.

## 5. Especificação

- RNF01 — Desempenho: as páginas devem carregar em até 3 segundos. Teste: medir o tempo de carregamento.
- RNF02 — Segurança: somente usuários autenticados podem acessar informações acadêmicas. Teste: tentar acessar o sistema sem realizar login.
- RNF03 — Usabilidade: alunos devem localizar notas e horários em até três etapas. Teste: pedir que usuários realizem essas tarefas sem ajuda.

## 6. Validação

A equipe poderia utilizar:

- Revisão de requisitos: apresentar os requisitos aos alunos, professores e coordenadores para verificar se estão corretos.
- Prototipação: apresentar modelos das telas para os usuários testarem e sugerirem melhorias.

---

# Estudo de Caso 2 — PetCare

## 1. Elicitação e stakeholders

**Principais stakeholders:**

- Tutores: agendar consultas e receber lembretes.
- Veterinários: consultar históricos e registrar tratamentos.
- Recepcionistas: controlar horários e consultas.
- Gerência: acompanhar relatórios de atendimentos.
- Proprietário: definir prioridades e orçamento.

**Técnicas utilizadas:**

- Entrevistas: conversar com os envolvidos para identificar suas necessidades.
- Observação: acompanhar o atendimento da clínica para entender os problemas dos processos atuais.

## 2. Análise e especificação de requisitos

**Requisitos funcionais (RF):**

- RF01: Permitir o cadastro de tutores e animais.
- RF02: Permitir o agendamento de consultas pelo celular.
- RF03: Permitir a confirmação e o cancelamento de consultas.
- RF04: Permitir que veterinários consultem o histórico dos animais.
- RF05: Permitir o registro de diagnósticos e tratamentos.
- RF06: Enviar lembretes de vacinação aos tutores.

**Requisitos não funcionais (RNF):**

- RNF01: Os horários disponíveis devem ser apresentados em até 3 segundos.
- RNF02: O sistema deve exigir autenticação e controlar o acesso conforme o perfil do usuário.
- RNF03: Um tutor deve conseguir agendar uma consulta em até cinco etapas de navegação.

## 3. Negociação com MoSCoW

- **Must have:** cadastro de animais, agendamento e controle de consultas, pois são essenciais para o funcionamento da clínica.
- **Should have:** histórico dos animais e registro de tratamentos, pois melhoram o atendimento.
- **Could have:** pagamentos pelo aplicativo, pois facilitam a vida dos tutores, mas exigem integração e cuidados de segurança.
- **Won't have:** chat com veterinários e publicação de fotos, pois não são essenciais para a primeira versão e podem aumentar o tempo de desenvolvimento.

## 4. Especificação de requisitos não funcionais

- RNF01 — Desempenho: apresentar horários disponíveis em até 3 segundos. Teste: medir o tempo de resposta.
- RNF02 — Segurança: somente veterinários autorizados podem alterar registros clínicos. Teste: tentar acessar esses registros com outros perfis.
- RNF03 — Usabilidade: permitir que tutores agendem consultas em até cinco etapas. Teste: solicitar que usuários realizem um agendamento sem ajuda.

## 5. Validação dos requisitos

A equipe poderia utilizar:

- Revisão de requisitos: apresentar os requisitos aos envolvidos para identificar erros ou informações faltantes.
- Prototipação: criar modelos das telas para que os usuários avaliem a organização e a facilidade de uso.

## 6. Desafio — Priorização da primeira versão

As cinco funcionalidades prioritárias seriam:

1. **Cadastro de tutores e animais:** organiza os dados dos clientes e seus animais.
2. **Agendamento de consultas:** facilita a marcação de consultas pelo celular.
3. **Controle de horários:** evita conflitos e organiza a agenda da clínica.
4. **Histórico dos animais:** permite consultar informações de atendimentos anteriores.
5. **Registro de diagnósticos e tratamentos:** mantém os dados clínicos organizados.

Essas funcionalidades beneficiam tutores, veterinários e recepcionistas, resolvendo os principais problemas da clínica.

As demais funcionalidades, como pagamentos, chat, fotos e lembretes, poderão ser implementadas futuramente. O adiamento pode manter algumas tarefas manuais, mas não impede o funcionamento dos serviços essenciais.

---

# Conclusão

A Engenharia de Requisitos permite identificar as necessidades dos usuários e definir as funcionalidades de um sistema. Nos dois estudos de caso, foram identificados stakeholders, requisitos funcionais e não funcionais, além de técnicas de elicitação, validação e priorização. Essas etapas ajudam a desenvolver sistemas mais organizados e adequados às necessidades dos usuários.