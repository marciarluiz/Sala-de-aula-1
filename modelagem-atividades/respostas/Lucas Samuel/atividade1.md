# Atividade 1 - Engenharia de Requisitos

Aluno: Lucas Samuel Alves Oliveira
Disciplina: Modelagem e Análise de Sistemas

---

## Estudo de Caso 1 - Conecta Campus

### 1. Concepção
- Problema: O sistema atual é lento, difícil de usar e as informações ficam espalhadas.
- Objetivo: Centralizar os serviços acadêmicos em uma única plataforma rápida e simples.

### 2. Elicitação
- Stakeholders: Alunos, professores e coordenação.
- Técnicas: 
  1. Entrevistas com a coordenação e professores para entender quais avisos e materiais precisam publicar.
  2. Questionários com os alunos para identificar os principais problemas do sistema atual.

### 3. Análise e Modelagem
- Requisitos Funcionais:
  - RF01: O aluno deve consultar notas e horários.
  - RF02: O professor deve publicar materiais das disciplinas.
  - RF03: A coordenação deve divulgar eventos e avisos.
  - RF04: O aluno deve visualizar o calendário acadêmico.
  - RF05: O sistema deve permitir login e autenticação de usuários.
- Requisitos Não Funcionais:
  - RNF01: Somente usuários cadastrados e logados podem acessar os dados.
  - RNF02: O sistema deve responder às consultas em até 3 segundos.
  - RNF03: A interface deve ser simples e funcionar em celulares e computadores.

### 4. Negociação (MoSCoW)
- Must have: RF01 e RF05 (consultar notas e fazer login são indispensáveis).
- Should have: RF02 e RF03 (publicar materiais e avisos é importante para a comunicação).
- Could have: Notificações no celular quando uma nova nota for lançada.
- Won't have: Chat entre alunos e professores (descartado para a versão inicial para não atrasar a entrega).

### 5. Especificação de Requisitos Não Funcionais
1. RNF01 (Tempo de resposta): As telas do sistema devem carregar em no máximo 3 segundos. 
   - Teste: Fazer requisições de teste e medir o tempo de resposta.
2. RNF02 (Segurança): O acesso às notas só deve ocorrer após login com senha criptografada.
   - Teste: Tentar acessar o link da página de notas sem estar logado.
3. RNF03 (Usabilidade): Um aluno deve encontrar sua nota em no máximo 3 cliques na tela inicial.
   - Teste: Pedir para um aluno realizar a tarefa e contar a quantidade de cliques.

### 6. Validação
1. Protótipo de telas: Apresentar rascunhos das telas para alunos e professores avaliarem o fluxo.
2. Reunião de revisão: Ler a lista de requisitos junto com a coordenação antes do desenvolvimento.

---

## Estudo de Caso 2 - PetCare

### 1. Elicitação e Stakeholders
- Stakeholders e necessidades:
  - Tutores: Querem agendar consultas pelo celular e receber lembretes.
  - Veterinários: Querem acessar o histórico e registrar atendimentos.
  - Recepção: Precisa controlar a agenda e horários dos médicos.
  - Gerência: Quer relatórios sobre o número de atendimentos.
- Técnicas:
  1. Observação direta da rotina da recepção e dos veterinários.
  2. Entrevistas com a gerência para definir os relatórios necessários.

### 2. Análise e Especificação de Requisitos
- Requisitos Funcionais:
  - RF01: O tutor deve agendar consultas pelo celular.
  - RF02: O sistema deve enviar lembretes automáticos de vacinas.
  - RF03: O veterinário deve registrar o histórico e medicamentos do animal.
  - RF04: A recepção deve confirmar, cancelar e organizar horários.
  - RF05: O sistema deve gerar relatórios de atendimentos para a gerência.
- Requisitos Não Funcionais:
  - RNF01: O sistema deve estar disponível 99% do tempo no horário comercial.
  - RNF02: O cadastro e histórico dos animais devem ser protegidos com senha.
  - RNF03: A tela de agendamento deve ser simples para o tutor concluir rápido.

### 3. Negociação com MoSCoW
- Must have: Agendamento, histórico médico, controle de agenda e relatórios básicos (essenciais para o funcionamento da clínica).
- Should have: Lembretes automáticos de vacina.
- Could have: Pagamento pelo aplicativo (deixado para depois devido ao tempo curto).
- Won't have: Chat com o veterinário e galeria de fotos (descartados na V1 para não sobrecarregar a equipe e cumprir o prazo de 4 meses).

### 4. Especificação de Requisitos Não Funcionais
1. RNF01 (Desempenho): A busca de um histórico médico deve levar menos de 2 segundos.
   - Teste: Realizar pesquisas no banco de dados e medir o tempo.
2. RNF02 (Usabilidade): O agendamento deve ser concluído em até 4 etapas simples.
   - Teste: Testar o fluxo de telas no celular.
3. RNF03 (Segurança): Desconectar a conta da recepção após 15 minutos sem uso.
   - Teste: Deixar o sistema inativo e verificar se pede a senha novamente.

### 5. Validação dos Requisitos
1. Validação por protótipo: Mostrar as telas desenhadas para a recepção e veterinários para ver se atende à rotina deles.
2. Checklist de requisitos: Revisar a lista de funções com a gerência antes de começar a codificar.

### 6. Desafio - Priorização da Primeira Versão
As 5 funcionalidades escolhidas para a V1 são:
1. Agendamento pelo celular (RF01): Resolve o acúmulo de ligações na recepção.
2. Histórico médico digital (RF03): Organiza as fichas dos animais e evita perda de informações.
3. Controle da agenda pela recepção (RF04): Evita choque de horários entre consultas.
4. Lembretes de vacinação (RF02): Garante o retorno dos clientes e a saúde dos animais.
5. Relatórios de atendimentos (RF05): Permite que a gerência acompanhe a rotina do negócio.

Justificativa: O chat, pagamentos e galeria de fotos foram adiados porque demandam muito tempo de desenvolvimento e não são essenciais para organizar o atendimento inicial nos 4 meses de prazo.
